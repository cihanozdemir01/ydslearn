package com.example.ydsapp.data

data class Lesson(
    val id: Int,
    val title: String,
    val category: String,
    val content: String,
    val summary: String
)

object LessonDataProvider {
    val lessons = listOf(
        Lesson(
            id = 1,
            title = "1. Conjunctions (Bağlaçlar)",
            category = "Grammar",
            summary = "Contrast, cause-effect, purpose, and time conjunctions key to YDS sentence logic.",
            content = """
                # YDS'de Bağlaçlar (Conjunctions)
                
                YDS sınavının en kritik konularından biridir. Bağlaçlar cümleler arasındaki mantıksal ilişkiyi kurar. Temel gruplar şunlardır:
                
                ## 1. Zıtlık Bağlaçları (Contrast)
                * **Although / Even though / Though (+ Cümle):** -e rağmen (Beklenmedik durumları bağlar).
                  * *Örnek:* Although it rained heavily, they went for a walk.
                * **Despite / In spite of (+ İsim/Noun Phrase):** -e rağmen.
                  * *Örnek:* Despite the heavy rain, they went for a walk.
                * **However / Nevertheless / Nonetheless (+ Cümle):** Ancak, yine de (İki cümle arasında geçiş yapar, genellikle noktalama işaretleriyle ayrılır).
                  * *Örnek:* The project was difficult; however, they completed it on time.
                  
                ## 2. Sebep-Sonuç Bağlaçları (Cause & Effect)
                * **Because / Since / As (+ Cümle):** -dığı için, çünkü.
                  * *Örnek:* Since he was late, he missed the train.
                * **Because of / Due to / Owing to (+ İsim):** -den dolayı, yüzünden.
                  * *Örnek:* Due to bad weather, the flight was cancelled.
                * **Therefore / Thus / Consequently (+ Cümle):** Bu yüzden, sonuç olarak.
                  * *Örnek:* He did not study; therefore, he failed the exam.
                  
                ## 3. Amaç ve Sonuç Bağlaçları (Purpose)
                * **So that / In order that (+ Cümle):** -sin diye, amacıyla.
                  * *Örnek:* He studied hard so that he could pass the exam.
                * **To / In order to / So as to (+ Fiil V1):** -mek için.
                  * *Örnek:* He studied hard in order to pass the exam.
            """.trimIndent()
        ),
        Lesson(
            id = 2,
            title = "2. Noun Clauses (İsim Cümlecikleri)",
            category = "Grammar",
            summary = "Understanding how clauses act as subject, object, or complement in complex sentences.",
            content = """
                # Noun Clauses (İsim Cümlecikleri)
                
                Bir cümlenin, başka bir ana cümlenin öznesi (subject) veya nesnesi (object) rolünü üstlenmesiyle oluşur. Üç ana başlıkta incelenir:
                
                ## 1. "That" ve "Whether/If" Cümlecikleri
                * **That (+ Tam Cümle):** Bir gerçeği veya iddiayı belirtir (-dığı gerçeği, -olması).
                  * *Örnek:* That he failed the exam surprised everyone. (Sınavdan kalması herkesi şaşırttı - Öznek konumunda).
                  * *Örnek:* I know that he is a good doctor. (Nesne konumunda).
                * **Whether / If (+ Tam Cümle):** -ıp ıpmadığı (Belirsizlik veya soru anlamı taşır).
                  * *Örnek:* I wonder whether he will come to the party. (Partiye gelip gelmeyeceğini merak ediyorum).
                  
                ## 2. Soru Kelimeleriyle Yapılan Cümlecikler (Wh- Questions)
                Soru kelimesi (What, Why, Where, How, Who) cümle başına gelir fakat arkasından soru sırası değil, düz cümle sırası (Özne + Yüklem) gelir.
                * *Örnek:* I don't know where he lives. (Nerede yaşadığını bilmiyorum - "where does he live" değil).
                * *Örnek:* What she said was very interesting. (Söylediği şey çok ilginçti).
            """.trimIndent()
        ),
        Lesson(
            id = 3,
            title = "3. Relative Clauses (Sıfat Cümlecikleri)",
            category = "Grammar",
            summary = "Defining and non-defining relative clauses using who, which, that, whose, where, and when.",
            content = """
                # Relative Clauses (Sıfat Cümlecikleri)
                
                Bir ismi tanımlamak veya onun hakkında ekstra bilgi vermek için kullanılır. Tanımlanan ismin hemen arkasından gelir.
                
                ## 1. Özne Konumundaki İlgi Zamirleri
                * **Who / That:** İnsanlar için kullanılır.
                  * *Örnek:* The man who lives next door is a doctor.
                * **Which / That:** Cansız varlıklar ve hayvanlar için kullanılır.
                  * *Örnek:* The car which was stolen yesterday has been found.
                  
                ## 2. Nesne Konumundaki İlgi Zamirleri
                * **Who / Whom / That:** İnsanlar için. (Nesne konumunda olduğunda cümleden atılabilir).
                  * *Örnek:* The person (whom) you met yesterday is my uncle.
                * **Which / That:** Cansız varlıklar için.
                  * *Örnek:* The book (which) I read yesterday was boring.
                  
                ## 3. İyelik ve Yer/Zaman Belirteçleri
                * **Whose (+ İsim):** Kimin, onun (Sahiplik bildirir).
                  * *Örnek:* The girl whose father is a manager got the job. (Babası müdür olan kız).
                * **Where (+ Tam Cümle):** Yer bildirir.
                  * *Örnek:* This is the school where I studied.
                * **When (+ Tam Cümle):** Zaman bildirir.
                  * *Örnek:* I will never forget the day when I graduated.
            """.trimIndent()
        ),
        Lesson(
            id = 4,
            title = "4. Active & Passive Voice (Etken ve Edilgen)",
            category = "Grammar",
            summary = "Mastering the passive voice (be + V3) to identify the focus of action in YDS paragraphs.",
            content = """
                # Active & Passive Voice (Etken ve Edilgen Yapı)
                
                YDS okuma parçalarında ve cümle tamamlama sorularında edilgen yapı (Passive Voice) sıklıkla kullanılır. Eylemi yapan kişiden ziyade, eylemden etkilenen nesne veya eylemin kendisi önemli olduğunda kullanılır.
                
                ## 1. Temel Kurallar
                Aktif cümleyi pasife dönüştürürken:
                1. Aktif cümlenin nesnesi, pasif cümlenin öznesi olur.
                2. Uygun zamanda **"be"** fiili eklenir ve fiilin **3. hali (V3 - Past Participle)** kullanılır.
                
                ## 2. Zamanlara Göre Çekimler
                * **Simple Present:** am/is/are + V3
                  * *Active:* They publish the book. -> *Passive:* The book is published.
                * **Simple Past:** was/were + V3
                  * *Active:* They built this house in 1990. -> *Passive:* This house was built in 1990.
                * **Present Perfect:** have/has been + V3
                  * *Active:* Someone has stolen my wallet. -> *Passive:* My wallet has been stolen.
                * **Modals:** modal + be + V3
                  * *Active:* You can solve this problem. -> *Passive:* This problem can be solved.
                  
                ## 3. "By" Kullanımı
                Eylemi yapan kişi belirtilmek istenirse cümlenin sonuna **"by + eylemi yapan"** eklenir.
                * *Örnek:* Hamlet was written by Shakespeare.
            """.trimIndent()
        )
    )
}
