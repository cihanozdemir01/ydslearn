package com.example.ydsapp.data

data class FeynmanStep(
    val studentQuestion: String,
    val hint: String,
    val requiredKeywords: List<String>,
    val successFeedback: String,
    val missingKeywordFeedback: String
)

data class FeynmanTopicChallenge(
    val topicName: String,
    val introScenario: String,
    val steps: List<FeynmanStep>
)

object FeynmanDataProvider {
    val challenges = listOf(
        FeynmanTopicChallenge(
            topicName = "Noun Clauses",
            introScenario = "🧑‍🎓 Meraklı Öğrenci Ali: Lise öğrencisiyim. İngilizce dersinde Noun Clause konusunu kaçırdım. Bana kafamdaki soruları basitçe açıklar mısın?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam merhaba! Normal bir cümlenin başına 'That' getirince (Örn: *That he is a doctor...*) cümlede ne değişiyor? Bu cümlenin neresinde durur?",
                    hint = "💡 İpucu: 'Özne' veya 'Nesne' olma rolünden ve bir gerçeği belirtmekten bahset.",
                    requiredKeywords = listOf("özne", "nesne", "isim", "gerçek", "subject", "object"),
                    successFeedback = "Ali: 'Anladım hocam! Yani koca bir cümle tek bir kelime gibi ana cümlenin öznesi ya da nesnesi oluyor. Harika!'",
                    missingKeywordFeedback = "Ali: 'Hocam tam kafamda canlanmadı... Cümlenin neresine koyuyoruz bunu? Özne ya da nesne olmasıyla ilgili bir kural mıydı?'"
                ),
                FeynmanStep(
                    studentQuestion = "Peki hocam bir soru kelimesi (*Where does he live?*) cümlenin içine girince yardımcı fiil (*does*) neden kayboluyor (*I know where he lives*)?",
                    hint = "💡 İpucu: 'Düz cümle sırası' (Özne + Yüklem) kuralından ve artık soru sormadığından bahset.",
                    requiredKeywords = listOf("düz", "soru", "sıra", "özne", "yüklem", "yardımcı", "bağlaç"),
                    successFeedback = "Ali: 'Süper! Yani soru kelimesi içeride bağlaç gibi davranıyor, artık soru sormadığı için normal düz cümle sırasına geçiyor.'",
                    missingKeywordFeedback = "Ali: 'Neden *where does he live* demiyoruz da düz fiil kullanıyoruz hocam? Cümle dizilimi kuralı mı değişiyor?'"
                ),
                FeynmanStep(
                    studentQuestion = "Hocam bana içinde Noun Clause olan harika bir YDS örnek cümlesi kurar mısın?",
                    hint = "💡 İpucu: İçinde 'that', 'what', 'whether' veya 'where' geçen İngilizce bir cümle yaz.",
                    requiredKeywords = listOf("that", "what", "where", "whether", "if", "is", "was", "know", "wonder"),
                    successFeedback = "Ali: 'Çok iyi örnek! Hem yapıyı hem çevirisini not aldım hocam, sayenizde konuyu canavar gibi anladım!'",
                    missingKeywordFeedback = "Ali: 'Hocam cümlede *that* ya da *whether* gibi bir bağlayıcı göremedim sanki? Tekrar bir örnek yazabilir misin?'"
                )
            )
        ),
        FeynmanTopicChallenge(
            topicName = "Relative Clauses",
            introScenario = "🧑‍🎓 Meraklı Öğrenci Ali: Bir okuma parçasında ismin arkasından gelen 'who' ve 'which' kelimelerini gördüm ama soru sormuyorlardı. Mantığı ne?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam cümlenin ortasında 'The man who called me...' yazıyor. Buradaki 'who' kim sorusu mu soruyor?",
                    hint = "💡 İpucu: 'Sıfat cümlecikleri' (Relative Clause) mantığından ve kendinden önceki ismi tanımladığından bahset.",
                    requiredKeywords = listOf("sıfat", "tanımla", "isim", "insan", "nitele", "relative", "bilgi"),
                    successFeedback = "Ali: 'Ah! Yani *beni arayan adam* diyoruz, soru sormuyor arkasındaki adamı tanımlıyor.'",
                    missingKeywordFeedback = "Ali: 'Soru sormuyorsa neden *who* dedik hocam? Önündeki adamla (man) bir ilişkisi mi var?'"
                ),
                FeynmanStep(
                    studentQuestion = "Peki hocam cansız bir eşyayı ya da arabayı tanımlarken 'who' yerine ne kullanacağım?",
                    hint = "💡 İpucu: 'Which' veya 'That' kelimelerini söyle.",
                    requiredKeywords = listOf("which", "that"),
                    successFeedback = "Ali: 'Harika, insanlar için Who, cansızlar ve hayvanlar için Which kullanıyoruz. Çok net!'",
                    missingKeywordFeedback = "Ali: 'Arabalar için de mi *who* diyeceğiz hocam yoksa cansızlar için başka bir kelime mi vardı?'"
                )
            )
        ),
        FeynmanTopicChallenge(
            topicName = "Conjunctions (Bağlaçlar)",
            introScenario = "🧑‍🎓 Meraklı Öğrenci Ali: YDS paragraf sorularında bağlaçlardan dolayı paragrafın anlamını kaçırıyorum. Bana taktik verir misin?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam 'Although' ile 'Despite' ikisi de -e rağmen demek. Sorularda ikisinin farkını nasıl ayırt edeceğim?",
                    hint = "💡 İpucu: 'Although kendinden sonra tam cümle (yüklem) alır, Despite sadece isim (noun phrase) alır' kuralından bahset.",
                    requiredKeywords = listOf("cümle", "isim", "fiil", "yüklem", "noun", "tam"),
                    successFeedback = "Ali: 'Süper taktik! Yani boşluktan sonra yüklem/fiil varsa Although seçiyorum, sadece isim varsa Despite.'",
                    missingKeywordFeedback = "Ali: 'İkisinin arkasından gelen kelimelerin türü mü farklı hocam? Hangisi arkasından tam yüklemli cümle alıyordu?'"
                )
            )
        ),
        FeynmanTopicChallenge(
            topicName = "Passive Voice (Edilgen Yapı)",
            introScenario = "🧑‍🎓 Meraklı Öğrenci Ali: Akademik makalelerde sürekli 'is conducted', 'was observed' gibi yapılar görüyorum. Neden normal etken cümle kurmuyorlar?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam akademide neden hep Edilgen (Passive) yapı tercih ediliyor? Etken cümleden farkı ne?",
                    hint = "💡 İpucu: 'Eylemi yapan kişiden ziyade, eylemden etkilenen nesne veya işin kendisi önemlidir' vurgusu yap.",
                    requiredKeywords = listOf("nesne", "yapan", "etkilenen", "önemli", "vurgu", "bilimsel", "odak"),
                    successFeedback = "Ali: 'Anladım hocam, yani deneyi kimin yaptığı değil, deneyin sonucu önemli olduğu için pasif yapıyorlar. Çok mantıklı!'",
                    missingKeywordFeedback = "Ali: 'İşi kimin yaptığı belli olmadığı veya önemsiz olduğu için mi pasif diyoruz hocam?'"
                )
            )
        )
    )
}
