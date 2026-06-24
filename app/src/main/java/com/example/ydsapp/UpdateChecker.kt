package com.example.ydsapp

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.FileProvider
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL

data class UpdateInfo(
    val isAvailable: Boolean,
    val latestVersion: String,
    val downloadUrl: String
)

object UpdateChecker {
    private const val GITHUB_API_URL = "https://api.github.com/repos/cihanozdemir01/ydslearn/releases/latest"

    suspend fun checkForUpdate(context: Context): UpdateInfo = withContext(Dispatchers.IO) {
        try {
            val url = URL(GITHUB_API_URL)
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            connection.connectTimeout = 10000
            connection.readTimeout = 10000
            connection.connect()

            if (connection.responseCode == 200) {
                val responseText = connection.inputStream.bufferedReader().use { it.readText() }
                val json = JSONObject(responseText)
                val tagName = json.getString("tag_name")
                val assets = json.getJSONArray("assets")
                var downloadUrl = ""

                for (i in 0 until assets.length()) {
                    val asset = assets.getJSONObject(i)
                    if (asset.getString("name").endsWith(".apk")) {
                        downloadUrl = asset.getString("browser_download_url")
                        break
                    }
                }

                val currentVersionName = try {
                    val pInfo = context.packageManager.getPackageInfo(context.packageName, 0)
                    pInfo.versionName ?: "1.0.0"
                } catch (e: Exception) {
                    "1.0.0"
                }

                val isAvailable = isNewerVersion(currentVersionName, tagName) && downloadUrl.isNotEmpty()

                UpdateInfo(isAvailable, tagName, downloadUrl)
            } else {
                UpdateInfo(false, "", "")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            UpdateInfo(false, "", "")
        }
    }

    private fun isNewerVersion(current: String, latest: String): Boolean {
        val curParts = current.replace("v", "").trim().split(".").mapNotNull { it.toIntOrNull() }
        val latParts = latest.replace("v", "").trim().split(".").mapNotNull { it.toIntOrNull() }
        val maxLength = maxOf(curParts.size, latParts.size)
        for (i in 0 until maxLength) {
            val curVal = curParts.getOrElse(i) { 0 }
            val latVal = latParts.getOrElse(i) { 0 }
            if (latVal > curVal) return true
            if (curVal > latVal) return false
        }
        return false
    }

    suspend fun downloadAndInstallApk(context: Context, downloadUrl: String, onProgress: (Float) -> Unit): Boolean = withContext(Dispatchers.IO) {
        try {
            val apkFile = File(context.cacheDir, "update.apk")
            if (apkFile.exists()) {
                apkFile.delete()
            }

            val url = URL(downloadUrl)
            val connection = url.openConnection() as HttpURLConnection
            connection.connectTimeout = 15000
            connection.readTimeout = 15000
            connection.connect()

            if (connection.responseCode == 200) {
                val fileLength = connection.contentLength
                val input = connection.inputStream
                val output = FileOutputStream(apkFile)
                val data = ByteArray(4096)
                var total: Long = 0
                var count: Int

                while (input.read(data).also { count = it } != -1) {
                    total += count
                    if (fileLength > 0) {
                        onProgress(total.toFloat() / fileLength.toFloat())
                    }
                    output.write(data, 0, count)
                }

                output.flush()
                output.close()
                input.close()

                // Launch package installer
                installApk(context, apkFile)
                true
            } else {
                false
            }
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    private fun installApk(context: Context, file: File) {
        val apkUri: Uri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.fileprovider",
            file
        )
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(apkUri, "application/vnd.android.package-archive")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_GRANT_READ_URI_PERMISSION
        }
        context.startActivity(intent)
    }
}
