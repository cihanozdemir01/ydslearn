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
            introScenario = "ğŸ§‘â€ğŸ“ MeraklÄ± Ã–ÄŸrenci Ali: Lise Ã¶ÄŸrencisiyim. Ä°ngilizce dersinde Noun Clause konusunu kaÃ§Ä±rdÄ±m. Bana kafamdaki sorularÄ± basitÃ§e aÃ§Ä±klar mÄ±sÄ±n?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam merhaba! Normal bir cÃ¼mlenin baÅŸÄ±na 'That' getirince (Ã–rn: *That he is a doctor...*) cÃ¼mlede ne deÄŸiÅŸiyor? Bu cÃ¼mlenin neresinde durur?",
                    hint = "ğŸ’¡ Ä°pucu: 'Ã–zne' veya 'Nesne' olma rolÃ¼nden ve bir gerÃ§eÄŸi belirtmekten bahset.",
                    requiredKeywords = listOf("Ã¶zne", "nesne", "isim", "gerÃ§ek", "subject", "object"),
                    successFeedback = "Ali: 'AnladÄ±m hocam! Yani koca bir cÃ¼mle tek bir kelime gibi ana cÃ¼mlenin Ã¶znesi ya da nesnesi oluyor. Harika!'",
                    missingKeywordFeedback = "Ali: 'Hocam tam kafamda canlanmadÄ±... CÃ¼mlenin neresine koyuyoruz bunu? Ã–zne ya da nesne olmasÄ±yla ilgili bir kural mÄ±ydÄ±?'"
                ),
                FeynmanStep(
                    studentQuestion = "Peki hocam bir soru kelimesi (*Where does he live?*) cÃ¼mlenin iÃ§ine girince yardÄ±mcÄ± fiil (*does*) neden kayboluyor (*I know where he lives*)?",
                    hint = "ğŸ’¡ Ä°pucu: 'DÃ¼z cÃ¼mle sÄ±rasÄ±' (Ã–zne + YÃ¼klem) kuralÄ±ndan ve artÄ±k soru sormadÄ±ÄŸÄ±ndan bahset.",
                    requiredKeywords = listOf("dÃ¼z", "soru", "sÄ±ra", "Ã¶zne", "yÃ¼klem", "yardÄ±mcÄ±", "baÄŸlaÃ§"),
                    successFeedback = "Ali: 'SÃ¼per! Yani soru kelimesi iÃ§eride baÄŸlaÃ§ gibi davranÄ±yor, artÄ±k soru sormadÄ±ÄŸÄ± iÃ§in normal dÃ¼z cÃ¼mle sÄ±rasÄ±na geÃ§iyor.'",
                    missingKeywordFeedback = "Ali: 'Neden *where does he live* demiyoruz da dÃ¼z fiil kullanÄ±yoruz hocam? CÃ¼mle dizilimi kuralÄ± mÄ± deÄŸiÅŸiyor?'"
                ),
                FeynmanStep(
                    studentQuestion = "Hocam bana iÃ§inde Noun Clause olan harika bir YDS Ã¶rnek cÃ¼mlesi kurar mÄ±sÄ±n?",
                    hint = "ğŸ’¡ Ä°pucu: Ä°Ã§inde 'that', 'what', 'whether' veya 'where' geÃ§en Ä°ngilizce bir cÃ¼mle yaz.",
                    requiredKeywords = listOf("that", "what", "where", "whether", "if", "is", "was", "know", "wonder"),
                    successFeedback = "Ali: 'Ã‡ok iyi Ã¶rnek! Hem yapÄ±yÄ± hem Ã§evirisini not aldÄ±m hocam, sayenizde konuyu canavar gibi anladÄ±m!'",
                    missingKeywordFeedback = "Ali: 'Hocam cÃ¼mlede *that* ya da *whether* gibi bir baÄŸlayÄ±cÄ± gÃ¶remedim sanki? Tekrar bir Ã¶rnek yazabilir misin?'"
                )
            )
        ),
        FeynmanTopicChallenge(
            topicName = "Relative Clauses",
            introScenario = "ğŸ§‘â€ğŸ“ MeraklÄ± Ã–ÄŸrenci Ali: Bir okuma parÃ§asÄ±nda ismin arkasÄ±ndan gelen 'who' ve 'which' kelimelerini gÃ¶rdÃ¼m ama soru sormuyorlardÄ±. MantÄ±ÄŸÄ± ne?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam cÃ¼mlenin ortasÄ±nda 'The man who called me...' yazÄ±yor. Buradaki 'who' kim sorusu mu soruyor?",
                    hint = "ğŸ’¡ Ä°pucu: 'SÄ±fat cÃ¼mlecikleri' (Relative Clause) mantÄ±ÄŸÄ±ndan ve kendinden Ã¶nceki ismi tanÄ±mladÄ±ÄŸÄ±ndan bahset.",
                    requiredKeywords = listOf("sÄ±fat", "tanÄ±mla", "isim", "insan", "nitele", "relative", "bilgi"),
                    successFeedback = "Ali: 'Ah! Yani *beni arayan adam* diyoruz, soru sormuyor arkasÄ±ndaki adamÄ± tanÄ±mlÄ±yor.'",
                    missingKeywordFeedback = "Ali: 'Soru sormuyorsa neden *who* dedik hocam? Ã–nÃ¼ndeki adamla (man) bir iliÅŸkisi mi var?'"
                ),
                FeynmanStep(
                    studentQuestion = "Peki hocam cansÄ±z bir eÅŸyayÄ± ya da arabayÄ± tanÄ±mlarken 'who' yerine ne kullanacaÄŸÄ±m?",
                    hint = "ğŸ’¡ Ä°pucu: 'Which' veya 'That' kelimelerini sÃ¶yle.",
                    requiredKeywords = listOf("which", "that"),
                    successFeedback = "Ali: 'Harika, insanlar iÃ§in Who, cansÄ±zlar ve hayvanlar iÃ§in Which kullanÄ±yoruz. Ã‡ok net!'",
                    missingKeywordFeedback = "Ali: 'Arabalar iÃ§in de mi *who* diyeceÄŸiz hocam yoksa cansÄ±zlar iÃ§in baÅŸka bir kelime mi vardÄ±?'"
                )
            )
        ),
        FeynmanTopicChallenge(
            topicName = "Conjunctions (BaÄŸlaÃ§lar)",
            introScenario = "ğŸ§‘â€ğŸ“ MeraklÄ± Ã–ÄŸrenci Ali: YDS paragraf sorularÄ±nda baÄŸlaÃ§lardan dolayÄ± paragrafÄ±n anlamÄ±nÄ± kaÃ§Ä±rÄ±yorum. Bana taktik verir misin?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam 'Although' ile 'Despite' ikisi de -e raÄŸmen demek. Sorularda ikisinin farkÄ±nÄ± nasÄ±l ayÄ±rt edeceÄŸim?",
                    hint = "ğŸ’¡ Ä°pucu: 'Although kendinden sonra tam cÃ¼mle (yÃ¼klem) alÄ±r, Despite sadece isim (noun phrase) alÄ±r' kuralÄ±ndan bahset.",
                    requiredKeywords = listOf("cÃ¼mle", "isim", "fiil", "yÃ¼klem", "noun", "tam"),
                    successFeedback = "Ali: 'SÃ¼per taktik! Yani boÅŸluktan sonra yÃ¼klem/fiil varsa Although seÃ§iyorum, sadece isim varsa Despite.'",
                    missingKeywordFeedback = "Ali: 'Ä°kisinin arkasÄ±ndan gelen kelimelerin tÃ¼rÃ¼ mÃ¼ farklÄ± hocam? Hangisi arkasÄ±ndan tam yÃ¼klemli cÃ¼mle alÄ±yordu?'"
                )
            )
        ),
        FeynmanTopicChallenge(
            topicName = "Passive Voice (Edilgen YapÄ±)",
            introScenario = "ğŸ§‘â€ğŸ“ MeraklÄ± Ã–ÄŸrenci Ali: Akademik makalelerde sÃ¼rekli 'is conducted', 'was observed' gibi yapÄ±lar gÃ¶rÃ¼yorum. Neden normal etken cÃ¼mle kurmuyorlar?",
            steps = listOf(
                FeynmanStep(
                    studentQuestion = "Hocam akademide neden hep Edilgen (Passive) yapÄ± tercih ediliyor? Etken cÃ¼mleden farkÄ± ne?",
                    hint = "ğŸ’¡ Ä°pucu: 'Eylemi yapan kiÅŸiden ziyade, eylemden etkilenen nesne veya iÅŸin kendisi Ã¶nemlidir' vurgusu yap.",
                    requiredKeywords = listOf("nesne", "yapan", "etkilenen", "Ã¶nemli", "vurgu", "bilimsel", "odak"),
                    successFeedback = "Ali: 'AnladÄ±m hocam, yani deneyi kimin yaptÄ±ÄŸÄ± deÄŸil, deneyin sonucu Ã¶nemli olduÄŸu iÃ§in pasif yapÄ±yorlar. Ã‡ok mantÄ±klÄ±!'",
                    missingKeywordFeedback = "Ali: 'Ä°ÅŸi kimin yaptÄ±ÄŸÄ± belli olmadÄ±ÄŸÄ± veya Ã¶nemsiz olduÄŸu iÃ§in mi pasif diyoruz hocam?'"
                )
            )
        )
    )
}
