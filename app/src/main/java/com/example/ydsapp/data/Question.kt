package com.example.ydsapp.data

data class Question(
    val id: Int,
    val questionText: String,
    val options: List<String>,
    val correctOptionIndex: Int, // 0 to 4
    val explanation: String,
    val category: String
)

object QuestionDataProvider {
    val questions = listOf(
        Question(
            id = 1,
            questionText = "Although the initial results of the study were highly promising, the researchers eventually realized that the data was ----.",
            options = listOf("A) abundant", "B) flawed", "C) reliable", "D) coherent", "E) profound"),
            correctOptionIndex = 1,
            explanation = "'Although' (Rağmen) zıtlık bağlacı kullanılmıştır. Çalışmanın ilk sonuçlarının oldukça 'umut verici' (promising) olmasına rağmen, araştırmacıların verilerin aslında 'kusurlu/hatalı' (flawed) olduğunu fark ettiğini belirtmek anlamı tamamlar. Doğru cevap B.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 2,
            questionText = "Due to the economic crisis, the company had to ---- its expansion plans in order to save capital.",
            options = listOf("A) accelerate", "B) implement", "C) postpone", "D) emphasize", "E) validate"),
            correctOptionIndex = 2,
            explanation = "'Due to the economic crisis' (Ekonomik krizden dolayı) sebep belirtmektedir. Şirket sermaye tasarrufu yapmak amacıyla genişleme planlarını 'ertelemek' (postpone) zorunda kalmıştır. Doğru cevap C.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 3,
            questionText = "The government has introduced new measures to ---- the impact of inflation on low-income families.",
            options = listOf("A) alleviate", "B) aggravate", "C) elevate", "D) trigger", "E) ignore"),
            correctOptionIndex = 0,
            explanation = "Hükümet, enflasyonun düşük gelirli aileler üzerindeki etkisini 'hafifletmek/azaltmak' (alleviate) amacıyla yeni önlemler uygulamaya koymuştur. Doğru cevap A.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 4,
            questionText = "I don't know ---- the new system will be launched next month or if they will delay it again.",
            options = listOf("A) that", "B) whether", "C) which", "D) whose", "E) what"),
            correctOptionIndex = 1,
            explanation = "Cümledeki '... next month or if...' yapısı iki durum arasındaki alternatif belirsizliği gösterir. 'Whether ... or' kalıbından dolayı isim cümleciğinde 'olup olmadığı' anlamını veren 'whether' kullanılmalıdır. Doğru cevap B.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 5,
            questionText = "The manager is looking for a candidate ---- communication skills are exceptionally strong.",
            options = listOf("A) who", "B) whom", "C) which", "D) whose", "E) that"),
            correctOptionIndex = 3,
            explanation = "İlgi cümleciğinde (Relative Clause), tanımlanan aday ('candidate') ile onun iletişim becerileri ('communication skills') arasında aitlik ilişkisi vardır. Sahiplik belirten 'whose' (iletişim becerileri mükemmel olan aday) kullanımı doğrudur. Doğru cevap D.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 6,
            questionText = "The historic bridge, ---- was built by the Romans, is still used by pedestrians today.",
            options = listOf("A) who", "B) which", "C) whose", "D) where", "E) when"),
            correctOptionIndex = 1,
            explanation = "Cansız bir varlık olan 'historic bridge' (tarihi köprü) hakkında bilgi verilmektedir. Cansız varlıkları nitelemek için özne veya nesne konumunda 'which' kullanılır. Doğru cevap B.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 7,
            questionText = "Many endangered species ---- by conservationists if active projects are not supported financially.",
            options = listOf("A) cannot be saved", "B) will save", "C) are saving", "D) have saved", "E) saved"),
            correctOptionIndex = 0,
            explanation = "Nesne konumundaki 'Many endangered species' (Nesli tükenmekte olan birçok tür) eylemi yapan değil etkilenendir, yani pasif yapı kullanılmalıdır. Ayrıca 'by conservationists' eylemi yapanı belirttiği için 'cannot be saved' (kurtarılamaz) doğru edilgen seçenektir. Doğru cevap A.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 8,
            questionText = "The doctors worked tirelessly to prevent the patient's condition from ---- any further.",
            options = listOf("A) improving", "B) recovering", "C) deteriorating", "D) flourishing", "E) healing"),
            correctOptionIndex = 2,
            explanation = "Doktorlar hastanın durumunun daha fazla 'kötüleşmesini/bozulmasını' (deteriorating) önlemek için durmaksızın çalıştılar. Doğru cevap C.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 9,
            questionText = "Although she was highly qualified for the position, she was ---- to accept it because of the long commute.",
            options = listOf("A) eager", "B) reluctant", "C) proud", "D) confident", "E) generous"),
            correctOptionIndex = 1,
            explanation = "Nitelikli olmasına 'rağmen' (Although), uzun yolculuk süresi yüzünden işi kabul etmeye 'isteksiz' (reluctant) olduğunu söylemek zıtlık ilişkisini tamamlar. Doğru cevap B.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 10,
            questionText = "The new policy will be ---- next Monday, and all employees are expected to comply with it.",
            options = listOf("A) dissolved", "B) ignored", "C) implemented", "D) postponed", "E) questioned"),
            correctOptionIndex = 2,
            explanation = "Yeni politikanın önümüzdeki Pazartesi günü 'uygulamaya konulacağı/yürütüleceği' (implemented) ve çalışanların buna uymasının beklendiği anlamı tamamlar. Doğru cevap C.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 11,
            questionText = "The expansion of the universe ---- by scientists for decades, but many questions still remain unanswered.",
            options = listOf("A) has been studied", "B) studies", "C) was studying", "D) will study", "E) had studied"),
            correctOptionIndex = 0,
            explanation = "Evrenin genişlemesi bilim insanları tarafından onlarca yıldır 'incelenmektedir/incelenegelmiştir' (pasif ve süregelen eylem - Present Perfect Passive). Doğru cevap A.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 12,
            questionText = "She decided to accept the job offer ---- the salary was lower than she had expected.",
            options = listOf("A) as if", "B) even though", "C) in case", "D) in order that", "E) as long as"),
            correctOptionIndex = 1,
            explanation = "Maaşın beklediğinden düşük olmasına 'rağmen' (even though) iş teklifini kabul etmeye karar verdi. Zıtlık bağlacı gerekir. Doğru cevap B.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 13,
            questionText = "The city of Pompeii was ---- destroyed by the eruption of Mount Vesuvius in 79 AD.",
            options = listOf("A) partially", "B) virtually", "C) completely", "D) mutually", "E) abruptly"),
            correctOptionIndex = 2,
            explanation = "Pompeii şehri MS 79 yılında Vezüv Yanardağı'nın patlamasıyla 'tamamen' (completely) yok oldu. Doğru cevap C.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 14,
            questionText = "We should take an umbrella with us ---- it rains later in the afternoon.",
            options = listOf("A) in case", "B) so that", "C) even if", "D) unless", "E) although"),
            correctOptionIndex = 0,
            explanation = "Öğleden sonra yağmur yağması 'ihtimaline karşı' (in case) yanımıza şemsiye almalıyız. Önlem amaçlı 'in case' kullanımı uygundur. Doğru cevap A.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 15,
            questionText = "The project ---- by the committee last week, but the official announcement has not been made yet.",
            options = listOf("A) approved", "B) was approved", "C) has approved", "D) is approved", "E) would approve"),
            correctOptionIndex = 1,
            explanation = "'Last week' (geçen hafta) ifadesi Past Simple gerektirir. Proje komite tarafından 'onaylandı' (edilgen/passive yapı). Doğru cevap B.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 16,
            questionText = "No one is quite sure ---- the ancient monument was constructed by prehistoric civilisations.",
            options = listOf("A) what", "B) how", "C) which", "D) whose", "E) whatever"),
            correctOptionIndex = 1,
            explanation = "Antik anıtın tarih öncesi uygarlıklar tarafından 'nasıl' (how) inşa edildiğinden kimse tam olarak emin değil. İsim cümleciğinde yöntem bildiren zarf kullanımı uygundur. Doğru cevap B.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 17,
            questionText = "The search for clean and renewable energy sources has ---- due to growing environmental concerns.",
            options = listOf("A) diminished", "B) intensified", "C) abandoned", "D) collapsed", "E) stabilized"),
            correctOptionIndex = 1,
            explanation = "Çevre kaygılarının artması sebebiyle temiz ve yenilenebilir enerji kaynakları arayışı 'yoğunlaşmıştır' (intensified). Doğru cevap B.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 18,
            questionText = "If the government had taken strict measures earlier, the economic downturn ---- so severe.",
            options = listOf("A) wouldn't be", "B) won't be", "C) wouldn't have been", "D) is not", "E) had not been"),
            correctOptionIndex = 2,
            explanation = "Geçmişte gerçekleşmeyen bir durum için koşul bildiren Type 3 Conditional yapısıdır: 'If + past perfect, would have + V3'. Doğru cevap C.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 19,
            questionText = "The students ---- research on climate change were awarded a special scholarship by the university.",
            options = listOf("A) who conducting", "B) conducted", "C) conducting", "D) they conduct", "E) which conducted"),
            correctOptionIndex = 2,
            explanation = "Kısaltılmış ilgi cümleciği (Relative Clause reduction) yapısıdır. 'The students who were conducting research...' ifadesi aktif kısaltma ile 'students conducting research...' (araştırma yapan öğrenciler) şekline dönüşür. Doğru cevap C.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 20,
            questionText = "---- the difficulty of the exam, almost all candidates managed to pass with high scores.",
            options = listOf("A) Because of", "B) In spite of", "C) As a result of", "D) In addition to", "E) Rather than"),
            correctOptionIndex = 1,
            explanation = "Sınavın zorluğuna 'rağmen' (In spite of + noun phrase) neredeyse tüm adaylar yüksek puanlarla geçmeyi başardı. Doğru cevap B.",
            category = "Bağlaçlar"
        ),
        // --- 15 New Real YDS Questions (from 2021 PDF) ---
        Question(
            id = 21,
            questionText = "Attaining ---- in the current job is a basic career strategy, given that organisations make promotion decisions, at least in part, on an employee's present performance.",
            options = listOf("A) assurance", "B) competence", "C) balance", "D) recession", "E) insurance"),
            correctOptionIndex = 1,
            explanation = "'Attaining competence...' (Mevcut işte yetkinlik kazanmak), kuruluşların terfi kararlarını en azından kısmen çalışanın mevcut performansına göre vermesi nedeniyle temel bir kariyer stratejisidir. Doğru cevap B.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 22,
            questionText = "Despite its being a remote and harsh environment, there is ---- about ownership of the North Pole as there could be rich natural resources beneath the ice.",
            options = listOf("A) discrimination", "B) substitution", "C) exposure", "D) controversy", "E) neglect"),
            correctOptionIndex = 3,
            explanation = "Uzak ve zorlu bir çevre olmasına 'rağmen' (Despite), buzun altında zengin doğal kaynaklar olabileceğinden Kuzey Kutbu'nun mülkiyeti hakkında 'tartışma/anlaşmazlık' (controversy) vardır. Doğru cevap D.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 23,
            questionText = "The reasons for an urban climate are heat storage, trapping of radiation, increasing roughness and less evaporation, which are seen in cities worldwide but are most ---- in densely built-up megacities.",
            options = listOf("A) evident", "B) arbitrary", "C) convenient", "D) constructive", "E) mediocre"),
            correctOptionIndex = 0,
            explanation = "Kentsel iklimin nedenleri ısı depolama, radyasyon sıkışması, pürüzlülüğün artması ve daha az buharlaşmadır; bunlar dünya genelinde şehirlerde görülür ancak en çok yoğun yapılaşmış megakentlerde 'belirgindir/ortadadır' (evident). Doğru cevap A.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 24,
            questionText = "The population of koalas dropped ---- during the early part of the 20th century because they were over-hunted for their fur.",
            options = listOf("A) strictly", "B) drastically", "C) cautiously", "D) ardently", "E) merely"),
            correctOptionIndex = 1,
            explanation = "Koala popülasyonu, kürkleri için aşırı avlanmalarından dolayı 20. yüzyılın başlarında 'ciddi derecede/büyük ölçüde' (drastically) azaldı. Doğru cevap B.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 25,
            questionText = "When neurological issues like aphasia and dyslexia arise, they often ---- themselves in the things we say and how we say them.",
            options = listOf("A) alienate", "B) improve", "C) manifest", "D) diminish", "E) receive"),
            correctOptionIndex = 2,
            explanation = "Afazi ve disleksi gibi nörolojik sorunlar ortaya çıktığında, bunlar kendilerini genellikle söylediğimiz şeylerde ve bunları nasıl söylediğimizde 'gösterir/belli eder' (manifest themselves). Doğru cevap C.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 26,
            questionText = "When you cook meat, a chemical reaction turns creatine into heterocyclic amines and there is some evidence that these compounds ---- cancer in high concentrations.",
            options = listOf("A) rely on", "B) break into", "C) pass for", "D) call off", "E) lead to"),
            correctOptionIndex = 4,
            explanation = "Et pişirildiğinde kimyasal bir reaksiyon kreatini heterosiklik aminlere dönüştürür ve yüksek konsantrasyonlardaki bu bileşiklerin kansere 'yol açtığına/sebep olduğuna' (lead to) dair bazı kanıtlar vardır. Doğru cevap E.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 27,
            questionText = "Recently, nutritional scientists ---- strong evidence that the eating, drinking, and exercise habits of the Mediterranean people ---- a major role in their low risk for heart disease.",
            options = listOf(
                "A) uncover / are playing",
                "B) are uncovering / had been playing",
                "C) have uncovered / play",
                "D) may uncover / have played",
                "E) uncovered / had played"
            ),
            correctOptionIndex = 2,
            explanation = "'Recently' (son zamanlarda) kelimesi Present Perfect gerektirir. Akdeniz insanının alışkanlıklarının genel olarak kalp hastalığı riskini azaltmada önemli bir rol oynadığı genel geçer bir gerçek olduğu için ikinci boşlukta Simple Present (play) kullanılır. Doğru cevap C.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 28,
            questionText = "There are some people who ---- objects from 6 metres away with the same sharpness that a normal-sighted person ---- in to 4.5 metres to achieve.",
            options = listOf(
                "A) may view / had to move",
                "B) must view / could move",
                "C) can view / would have to move",
                "D) ought to view / should have moved",
                "E) might view / can move"
            ),
            correctOptionIndex = 2,
            explanation = "Yetenek belirten genel bir durum için ilk boşlukta 'can view' (görebilir) kullanılır. İkinci boşlukta ise varsayımsal bir eyleme atıfta bulunarak 'normal görüşe sahip bir kişinin yaklaşmak zorunda kalacağı' (would have to move) anlamı tamamlar. Doğru cevap C.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 29,
            questionText = "While many people welcome the chance ---- exotic foods or novel flavours, others do not even consider ---- foods beyond their usual repertoire.",
            options = listOf(
                "A) to be tasting / having consumed",
                "B) tasting / to have consumed",
                "C) to have tasted / to be consuming",
                "D) having tasted / to consume",
                "E) to taste / consuming"
            ),
            correctOptionIndex = 4,
            explanation = "'chance' isminden sonra mastar yapısı (to taste), 'consider' fiilinden sonra ise ulaç (gerund - consuming) kullanımı dil bilgisi açısından doğrudur. Doğru cevap E.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 30,
            questionText = "People intuitively tend to equate happiness ---- freedom, however without obstacles ---- our desires it is harder to know what we really want.",
            options = listOf(
                "A) between / on",
                "B) with / to",
                "C) at / into",
                "D) in / among",
                "E) for / from"
            ),
            correctOptionIndex = 1,
            explanation = "'equate happiness with freedom' (mutluluğu özgürlükle eşleştirmek/bir tutmak) ve 'obstacles to desires' (arzuların önündeki engeller) edat kombinasyonları doğrudur. Doğru cevap B.",
            category = "Edatlar"
        ),
        Question(
            id = 31,
            questionText = "People who feel strongly that they do not want to be awake and alert ---- certain procedures may not be good candidates ---- local or regional anaesthesia.",
            options = listOf(
                "A) through / at",
                "B) by / with",
                "C) during / for",
                "D) upon / to",
                "E) against / about"
            ),
            correctOptionIndex = 2,
            explanation = "Belirli işlemler 'esnasında/boyunca' (during) uyanık olmak istemeyen kişiler, lokal veya bölgesel anestezi 'için' (for) iyi birer aday olmayabilirler. Doğru cevap C.",
            category = "Edatlar"
        ),
        Question(
            id = 32,
            questionText = "---- social media has become widely integrated into everyday life, there is a growing interest in understanding its impact and the norms of online conduct.",
            options = listOf(
                "A) Supposing that",
                "B) Although",
                "C) Now that",
                "D) As much as",
                "E) While"
            ),
            correctOptionIndex = 2,
            explanation = "Sosyal medya günlük hayata büyük ölçüde entegre 'olduğuna göre / olduğu için' (Now that), çevrimiçi davranış kurallarını ve etkisini anlama ilgisi artmaktadır (Neden-sonuç bağlamı). Doğru cevap C.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 33,
            questionText = "For many years, social researchers regarded gossip as unworthy of scientific investigation; ----, sociologists have recently begun to recognise gossip as an important feature of social life.",
            options = listOf(
                "A) accordingly",
                "B) in other words",
                "C) however",
                "D) as a result",
                "E) for example"
            ),
            correctOptionIndex = 2,
            explanation = "İki cümle arasında anlamca zıtlık vardır: Yıllarca değersiz görülüyordu; 'ancak/yine de' (however) son dönemde önemli bir özellik olarak kabul edilmeye başlandı. Doğru cevap C.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 34,
            questionText = "In diabetic patients, even though food intake may be increased, weight loss can occur ---- muscles and fat stores may shrink as they are not getting the necessary glucose.",
            options = listOf(
                "A) because",
                "B) given that",
                "C) as long as",
                "D) although",
                "E) in case"
            ),
            correctOptionIndex = 0,
            explanation = "Şeker hastalarında gıda alımı artsa bile kilo kaybı gerçekleşebilir, 'çünkü' (because) hücreler gerekli glikozu alamadığından kaslar ve yağ depoları küçülebilir (Açıklama/neden). Doğru cevap A.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 35,
            questionText = "---- you are a long-time fan ---- casual follower of the series of Street Fighter, you are already well-aware that it is constantly updated.",
            options = listOf(
                "A) Both / and",
                "B) Neither / nor",
                "C) Rather / than",
                "D) Whether / or",
                "E) Not only / but also"
            ),
            correctOptionIndex = 3,
            explanation = "Cümle 'ister ... ister ...' yapısındadır: 'Whether you are a long-time fan or casual follower...' (İster uzun süreli bir hayranı ister sıradan bir takipçisi olun...). Doğru cevap D.",
            category = "Bağlaçlar"
        )
    )
}
