package com.example.ydsapp.data

data class Question(
    val id: Int,
    val questionText: String,
    val options: List<String>,
    val correctOptionIndex: Int, // 0 to 4
    val explanation: String
)

object QuestionDataProvider {
    val questions = listOf(
        Question(
            id = 1,
            questionText = "Although the initial results of the study were highly promising, the researchers eventually realized that the data was ----.",
            options = listOf(
                "A) abundant",
                "B) flawed",
                "C) reliable",
                "D) coherent",
                "E) profound"
            ),
            correctOptionIndex = 1,
            explanation = "'Although' (Rağmen) zıtlık bağlacı kullanılmıştır. Çalışmanın ilk sonuçlarının oldukça 'umut verici' (promising) olmasına rağmen, araştırmacıların verilerin aslında 'kusurlu/hatalı' (flawed) olduğunu fark ettiğini belirtmek anlamı tamamlar. Doğru cevap B."
        ),
        Question(
            id = 2,
            questionText = "Due to the economic crisis, the company had to ---- its expansion plans in order to save capital.",
            options = listOf(
                "A) accelerate",
                "B) implement",
                "C) postpone",
                "D) emphasize",
                "E) validate"
            ),
            correctOptionIndex = 2,
            explanation = "'Due to the economic crisis' (Ekonomik krizden dolayı) sebep belirtmektedir. Şirket sermaye tasarrufu yapmak amacıyla genişleme planlarını 'ertelemek' (postpone) zorunda kalmıştır. Doğru cevap C."
        ),
        Question(
            id = 3,
            questionText = "The government has introduced new measures to ---- the impact of inflation on low-income families.",
            options = listOf(
                "A) alleviate",
                "B) aggravate",
                "C) elevate",
                "D) trigger",
                "E) ignore"
            ),
            correctOptionIndex = 0,
            explanation = "Hükümet, enflasyonun düşük gelirli aileler üzerindeki etkisini 'hafifletmek/azaltmak' (alleviate) amacıyla yeni önlemler uygulamaya koymuştur. Doğru cevap A."
        ),
        Question(
            id = 4,
            questionText = "I don't know ---- the new system will be launched next month or if they will delay it again.",
            options = listOf(
                "A) that",
                "B) whether",
                "C) which",
                "D) whose",
                "E) what"
            ),
            correctOptionIndex = 1,
            explanation = "Cümledeki '... next month or if...' yapısı iki durum arasındaki alternatif belirsizliği gösterir. 'Whether ... or' kalıbından dolayı isim cümleciğinde 'olup olmadığı' anlamını veren 'whether' kullanılmalıdır. Doğru cevap B."
        ),
        Question(
            id = 5,
            questionText = "The manager is looking for a candidate ---- communication skills are exceptionally strong.",
            options = listOf(
                "A) who",
                "B) whom",
                "C) which",
                "D) whose",
                "E) that"
            ),
            correctOptionIndex = 3,
            explanation = "İlgi cümleciğinde (Relative Clause), tanımlanan aday ('candidate') ile onun iletişim becerileri ('communication skills') arasında aitlik ilişkisi vardır. Sahiplik belirten 'whose' (iletişim becerileri mükemmel olan aday) kullanımı doğrudur. Doğru cevap D."
        ),
        Question(
            id = 6,
            questionText = "The historic bridge, ---- was built by the Romans, is still used by pedestrians today.",
            options = listOf(
                "A) who",
                "B) which",
                "C) whose",
                "D) where",
                "E) when"
            ),
            correctOptionIndex = 1,
            explanation = "Cansız bir varlık olan 'historic bridge' (tarihi köprü) hakkında bilgi verilmektedir. Cansız varlıkları nitelemek için özne veya nesne konumunda 'which' kullanılır. Doğru cevap B."
        ),
        Question(
            id = 7,
            questionText = "Many endangered species ---- by conservationists if active projects are not supported financially.",
            options = listOf(
                "A) cannot be saved",
                "B) will save",
                "C) are saving",
                "D) have saved",
                "E) saved"
            ),
            correctOptionIndex = 0,
            explanation = "Nesne konumundaki 'Many endangered species' (Nesli tükenmekte olan birçok tür) eylemi yapan değil etkilenendir, yani pasif yapı kullanılmalıdır. Ayrıca 'by conservationists' eylemi yapanı belirttiği için 'cannot be saved' (kurtarılamaz) doğru edilgen seçenektir. Doğru cevap A."
        ),
        Question(
            id = 8,
            questionText = "The doctors worked tirelessly to prevent the patient's condition from ---- any further.",
            options = listOf(
                "A) improving",
                "B) recovering",
                "C) deteriorating",
                "D) flourishing",
                "E) healing"
            ),
            correctOptionIndex = 2,
            explanation = "Doktorlar hastanın durumunun daha fazla 'kötüleşmesini/bozulmasını' (deteriorating) önlemek için durmaksızın çalıştılar. Doğru cevap C."
        ),
        Question(
            id = 9,
            questionText = "Although she was highly qualified for the position, she was ---- to accept it because of the long commute.",
            options = listOf(
                "A) eager",
                "B) reluctant",
                "C) proud",
                "D) confident",
                "E) generous"
            ),
            correctOptionIndex = 1,
            explanation = "Nitelikli olmasına 'rağmen' (Although), uzun yolculuk süresi yüzünden işi kabul etmeye 'isteksiz' (reluctant) olduğunu söylemek zıtlık ilişkisini tamamlar. Doğru cevap B."
        ),
        Question(
            id = 10,
            questionText = "The new policy will be ---- next Monday, and all employees are expected to comply with it.",
            options = listOf(
                "A) dissolved",
                "B) ignored",
                "C) implemented",
                "D) postponed",
                "E) questioned"
            ),
            correctOptionIndex = 2,
            explanation = "Yeni politikanın önümüzdeki Pazartesi günü 'uygulamaya konulacağı/yürütüleceği' (implemented) ve çalışanların buna uymasının beklendiği anlamı tamamlar. Doğru cevap C."
        ),
        Question(
            id = 11,
            questionText = "The expansion of the universe ---- by scientists for decades, but many questions still remain unanswered.",
            options = listOf(
                "A) has been studied",
                "B) studies",
                "C) was studying",
                "D) will study",
                "E) had studied"
            ),
            correctOptionIndex = 0,
            explanation = "Evrenin genişlemesi bilim insanları tarafından onlarca yıldır 'incelenmektedir/incelenegelmiştir' (pasif ve süregelen eylem - Present Perfect Passive). Doğru cevap A."
        ),
        Question(
            id = 12,
            questionText = "She decided to accept the job offer ---- the salary was lower than she had expected.",
            options = listOf(
                "A) as if",
                "B) even though",
                "C) in case",
                "D) in order that",
                "E) as long as"
            ),
            correctOptionIndex = 1,
            explanation = "Maaşın beklediğinden düşük olmasına 'rağmen' (even though) iş teklifini kabul etmeye karar verdi. Zıtlık bağlacı gerekir. Doğru cevap B."
        ),
        Question(
            id = 13,
            questionText = "The city of Pompeii was ---- destroyed by the eruption of Mount Vesuvius in 79 AD.",
            options = listOf(
                "A) partially",
                "B) virtually",
                "C) completely",
                "D) mutually",
                "E) abruptly"
            ),
            correctOptionIndex = 2,
            explanation = "Pompeii şehri MS 79 yılında Vezüv Yanardağı'nın patlamasıyla 'tamamen' (completely) yok oldu. Doğru cevap C."
        ),
        Question(
            id = 14,
            questionText = "We should take an umbrella with us ---- it rains later in the afternoon.",
            options = listOf(
                "A) in case",
                "B) so that",
                "C) even if",
                "D) unless",
                "E) although"
            ),
            correctOptionIndex = 0,
            explanation = "Öğleden sonra yağmur yağması 'ihtimaline karşı' (in case) yanımıza şemsiye almalıyız. Önlem amaçlı 'in case' kullanımı uygundur. Doğru cevap A."
        ),
        Question(
            id = 15,
            questionText = "The project ---- by the committee last week, but the official announcement has not been made yet.",
            options = listOf(
                "A) approved",
                "B) was approved",
                "C) has approved",
                "D) is approved",
                "E) would approve"
            ),
            correctOptionIndex = 1,
            explanation = "'Last week' (geçen hafta) ifadesi Past Simple gerektirir. Proje komite tarafından 'onaylandı' (edilgen/passive yapı). Doğru cevap B."
        ),
        Question(
            id = 16,
            questionText = "No one is quite sure ---- the ancient monument was constructed by prehistoric civilisations.",
            options = listOf(
                "A) what",
                "B) how",
                "C) which",
                "D) whose",
                "E) whatever"
            ),
            correctOptionIndex = 1,
            explanation = "Antik anıtın tarih öncesi uygarlıklar tarafından 'nasıl' (how) inşa edildiğinden kimse tam olarak emin değil. İsim cümleciğinde yöntem bildiren zarf kullanımı uygundur. Doğru cevap B."
        ),
        Question(
            id = 17,
            questionText = "The search for clean and renewable energy sources has ---- due to growing environmental concerns.",
            options = listOf(
                "A) diminished",
                "B) intensified",
                "C) abandoned",
                "D) collapsed",
                "E) stabilized"
            ),
            correctOptionIndex = 1,
            explanation = "Çevre kaygılarının artması sebebiyle temiz ve yenilenebilir enerji kaynakları arayışı 'yoğunlaşmıştır' (intensified). Doğru cevap B."
        ),
        Question(
            id = 18,
            questionText = "If the government had taken strict measures earlier, the economic downturn ---- so severe.",
            options = listOf(
                "A) wouldn't be",
                "B) won't be",
                "C) wouldn't have been",
                "D) is not",
                "E) had not been"
            ),
            correctOptionIndex = 2,
            explanation = "Geçmişte gerçekleşmeyen bir durum için koşul bildiren Type 3 Conditional yapısıdır: 'If + past perfect, would have + V3'. Doğru cevap C."
        ),
        Question(
            id = 19,
            questionText = "The students ---- research on climate change were awarded a special scholarship by the university.",
            options = listOf(
                "A) who conducting",
                "B) conducted",
                "C) conducting",
                "D) they conduct",
                "E) which conducted"
            ),
            correctOptionIndex = 2,
            explanation = "Kısaltılmış ilgi cümleciği (Relative Clause reduction) yapısıdır. 'The students who were conducting research...' ifadesi aktif kısaltma ile 'students conducting research...' (araştırma yapan öğrenciler) şekline dönüşür. Doğru cevap C."
        ),
        Question(
            id = 20,
            questionText = "---- the difficulty of the exam, almost all candidates managed to pass with high scores.",
            options = listOf(
                "A) Because of",
                "B) In spite of",
                "C) As a result of",
                "D) In addition to",
                "E) Rather than"
            ),
            correctOptionIndex = 1,
            explanation = "Sınavın zorluğuna 'rağmen' (In spite of + noun phrase) neredeyse tüm adaylar yüksek puanlarla geçmeyi başardı. Doğru cevap B."
        )
    )
}
