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
            questionText = "(2013 Sonbahar / Soru 1)\nAÇIKLAMA 1. Bu soru kitapçığındaki test 80 sorudan oluşmaktadır. 2. Bu test için verilen cevaplama süresi 150 dakikadır (2.5 saat). 3. Bu kitapçıktaki testte yer alan her sorunun sadece bir doğru cevabı vardır. Bir soru için birden çok cevap yeri işaretlenmişse o soru yanlış cevaplanmış sayılacaktır. 4. İşaretlediğiniz bir cevabı değiştirmek istediğinizde, sil- me işlemini çok iyi yapmanız gerektiğini unutmayınız. 5. Bu sınavın değerlendirilmesi doğru cevap sayısı üzerinden yapılacak, yanlış cevaplar dikkate alın- mayacaktır. 6. Cevaplamaya istediğiniz sorudan başlayabilirsiniz. Bir soru ile ilgili cevabınızı, cevap kâğıdında o soru için ay- rılmış olan yere işaretlemeyi unutmayınız. 7. Sınavda uyulacak diğer kurallar bu kitapçığın arka ka- pağında belirtilmiştir. ÖSYM Bu testte 80 soru vardır. 1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük ya da ifadeyi bulunuz. Parents should teach their children that being patient with someone does not necessarily mean they have to ---- their inappropriate behaviour.",
            options = listOf("A) do away with", "B) look down on", "C) put up with", "D) get up to", "E) come out of"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 2,
            questionText = "(2013 Sonbahar / Soru 2)\nParacetamol, one of the most effective painkillers used today, was discovered in the 1890s, but ---- how it relieves pain remains a mystery.",
            options = listOf("A) adversely", "B) precisely", "C) increasingly", "D) comparatively", "E) mistakenly"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 3,
            questionText = "(2013 Sonbahar / Soru 3)\nThere is a wide range of theories that attempt to ---- the differences in left- and right-handedness, some with much more empirical support than others.",
            options = listOf("A) carry out", "B) take over", "C) refer to", "D) account for", "E) give away"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 4,
            questionText = "(2013 Sonbahar / Soru 4)\nPsychologists have shown that people can make ---- of age, income and even personality traits based on footwear alone.",
            options = listOf("A) regularities", "B) incentives", "C) requisites", "D) tendencies", "E) estimates"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 5,
            questionText = "(2013 Sonbahar / Soru 5)\nThe rapid growth of English as an international language has ---- a number of interesting discussions about the status of English today.",
            options = listOf("A) confirmed", "B) postponed", "C) stimulated", "D) weakened", "E) distinguished"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 6,
            questionText = "(2013 Sonbahar / Soru 6)\nBecause trade among nations is so important in economic development, most countries are ---- to be able to sell their goods and services in foreign markets.",
            options = listOf("A) insufficient", "B) inconsistent", "C) entitled", "D) vulnerable", "E) eager"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 7,
            questionText = "(2013 Sonbahar / Soru 7)\nDiğer sayfaya geçiniz. ÖSYM 7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük ya da ifadeyi bulunuz. Scientists in the US ---- the rivers, streams and floods of ice at the Antarctic, ---- a fascinating picture of a constantly shifting continent.",
            options = listOf("A) have mapped / painting", "B) mapped / having been painted", "C) had mapped / being painted", "D) are mapping / painted", "E) will be mapping / having painted"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 8,
            questionText = "(2013 Sonbahar / Soru 8)\n---- certain conceptual strategies can be learned, specific levels of cognitive development must be achieved in early childhood education.",
            options = listOf("A) In case", "B) Now that", "C) Unless", "D) Before", "E) Just as"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 9,
            questionText = "(2013 Sonbahar / Soru 9)\nA report by the Japanese government ---- that the disaster in 2011 at the Fukushima Nuclear Plant ----.",
            options = listOf("A) has revealed / needs to be foreseen", "B) can reveal / should have been foreseen", "C) could reveal / will be foreseen", "D) reveals / must be foreseen", "E) revealed / could have been foreseen"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 10,
            questionText = "(2013 Sonbahar / Soru 10)\nAdopting a positive attitude to a terrible experience can ---- enhance accuracy in emotional memories ---- diminish their negative overtones.",
            options = listOf("A) just / as", "B) both / and", "C) as / as", "D) rather / than", "E) so / that"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 11,
            questionText = "(2013 Sonbahar / Soru 11)\nWhen we think of war films, we often think of places like Vietnam and Europe, ---- the location for these films is generally the United States.",
            options = listOf("A) only if", "B) as", "C) but", "D) given that", "E) thus"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 12,
            questionText = "(2013 Sonbahar / Soru 12)\nIn a workplace, standardization of skills involves considerable training of personnel ---- they can carry out organizational policies with few faults.",
            options = listOf("A) because", "B) whereas", "C) even though", "D) as if", "E) so that"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 13,
            questionText = "(2013 Sonbahar / Soru 13)\nDolphins use half their brain ---- sleep, as it gives them the ability to be on the lookout ---- danger while still technically sleeping.",
            options = listOf("A) during / for", "B) in / by", "C) at / into", "D) on / against", "E) through / from"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 14,
            questionText = "(2013 Sonbahar / Soru 14)\nDiğer sayfaya geçiniz. ÖSYM The discovery that the Universe ---- at an accelerating rate ---- two rival teams of scientists a Nobel Prize in Physics.",
            options = listOf("A) could expand / should have earned", "B) was expanding / must have earned", "C) will be expanding / had earned", "D) is expanding / has earned", "E) ought to expand / may have earned"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 15,
            questionText = "(2013 Sonbahar / Soru 15)\n---- all the essential amino acids for health and an excellent source of vitamin D, cheese is a highly nutritious food which should be included ---- any healthy diet.",
            options = listOf("A) For / at", "B) Under / to", "C) Of / from", "D) With / in", "E) Upon / by"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 16,
            questionText = "(2013 Sonbahar / Soru 16)\nThe crimes of the rich and the powerful can be explained ---- the same motives as any other criminal act.",
            options = listOf("A) in terms of", "B) prior to", "C) apart from", "D) in spite of", "E) instead of"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2013 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 17,
            questionText = "(2013 İlkbahar / Soru 1)\nAÇIKLAMA 1. Bu soru kitapçığındaki test 80 sorudan oluşmaktadır. 2. Bu test için verilen cevaplama süresi 150 dakikadır (2.5 saat). 3. Bu kitapçıktaki testte yer alan her sorunun sadece bir doğru cevabı vardır. Bir soru için birden çok cevap yeri işaretlenmişse o soru yanlış cevaplanmış sayılacaktır. 4. İşaretlediğiniz bir cevabı değiştirmek istediğinizde, sil- me işlemini çok iyi yapmanız gerektiğini unutmayınız. 5. Bu sınavın değerlendirilmesi doğru cevap sayısı üzerinden yapılacak, yanlış cevaplar dikkate alın- mayacaktır. 6. Cevaplamaya istediğiniz sorudan başlayabilirsiniz. Bir soru ile ilgili cevabınızı, cevap kâğıdında o soru için ay- rılmış olan yere işaretlemeyi unutmayınız. 7. Sınavda uyulacak diğer kurallar bu kitapçığın arka ka- pağında belirtilmiştir. Bu testte 80 soru vardır. 1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük ya da ifadeyi bulunuz. UNICEF is deeply committed to creating a world in which all children, regardless of their gender or socioeconomic background, have ---- to free, compulsory and quality education.",
            options = listOf("A) A) B) C)", "B) E)D)", "C) access", "D) dedication", "E) insight"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 18,
            questionText = "(2013 İlkbahar / Soru 2)\naddiction tendency In some countries, such as Brazil and Russia, codes have been put in place to promote ---- logging of forest ecosystems.",
            options = listOf("A) A) B) C)", "B) E)D)", "C) applicable", "D) penetrable", "E) notable"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 19,
            questionText = "(2013 İlkbahar / Soru 3)\nsustainable provable Before they are allowed to be used, all medicines, including vaccines, are ---- tested to assess how safe and effective they are.",
            options = listOf("A) incidentally", "B) hazardously", "C) thoroughly", "D) fatally", "E) offensively"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 20,
            questionText = "(2013 İlkbahar / Soru 4)\nMany scientists believe that our sanitized surroundings are ---- allergic disorders in children, which have doubled in the last decade.",
            options = listOf("A) extracting", "B) fulfilling", "C) unifying", "D) ensuring", "E) fostering"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 21,
            questionText = "(2013 İlkbahar / Soru 5)\nIn non-literate societies, valuable information about the past is often enshrined in oral tradition – poems, hymns or sayings ---- from generation to generation by word of mouth.",
            options = listOf("A) taken off", "B) handed down", "C) thrown up", "D) kept off", "E) rooted out"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 22,
            questionText = "(2013 İlkbahar / Soru 6)\nBy mapping equatorial rainfall since 800 AD, scientists have ---- how tropical weather may change over the next century.",
            options = listOf("A) taken out", "B) put aside", "C) brought down", "D) figured out", "E) counted upon"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 23,
            questionText = "(2013 İlkbahar / Soru 7)\nDiğer sayfaya geçiniz. 7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük ya da ifadeyi bulunuz. The physics of elementary particles in the 20 th century ---- by the observation of particles whose existence ---- by theorists decades earlier.",
            options = listOf("A) has been distinguished / was predicted", "B) distinguished / is being predicted", "C) was distinguished / had been predicted", "D) is distinguished / has been predicted", "E) had been distinguished / was being predicted"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 24,
            questionText = "(2013 İlkbahar / Soru 8)\nAt the end of the First World War, the leaders of victorious countries gathered at Versailles, and there, they ---- to decide what penalties Germany, Austria and other allies ----.",
            options = listOf("A) tried / would have to pay", "B) had tried / must have paid", "C) were trying / were paying", "D) used to try / might have paid", "E) could try / should have paid"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 25,
            questionText = "(2013 İlkbahar / Soru 9)\n---- the types of individuals it seeks to attract, an organization ---- to consider what methods to use to reach them.",
            options = listOf("A) To have established / could need", "B) Having established / needs", "C) Establishing / had needed", "D) Established / needed", "E) Being established / will need"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 26,
            questionText = "(2013 İlkbahar / Soru 10)\nChina’s rapid growth ---- trade is seen as a plus for the Southeast Asian nations because it helps to spur development ---- the region.",
            options = listOf("A) of / without", "B) by / about", "C) upon / over", "D) at / under", "E) in / across"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 27,
            questionText = "(2013 İlkbahar / Soru 11)\nAs Antarctic glaciers collapse ---- the sea, scientists struggle to find out what that means ---- the rise of sea levels.",
            options = listOf("A) against / in", "B) over / to", "C) around / along", "D) on / for", "E) from / behind"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 28,
            questionText = "(2013 İlkbahar / Soru 12)\n---- lead was widely known to be dangerous, by the early years of the 20 th century, it could be found in all manners of consumer products.",
            options = listOf("A) Since", "B) Once", "C) Only when", "D) Even though", "E) Given that"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 29,
            questionText = "(2013 İlkbahar / Soru 13)\nDiğer sayfaya geçiniz. Animals trapped in a stone called ‘amber’ are sometimes so well preserved that they look ---- they have just died.",
            options = listOf("A) so that", "B) in case", "C) as though", "D) even if", "E) now that"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 30,
            questionText = "(2013 İlkbahar / Soru 14)\nThe European Commission has put forward that policies to cut greenhouse gases will not work ---- individuals share the vision of a low-carbon society.",
            options = listOf("A) provided that", "B) after", "C) but", "D) while", "E) unless"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 31,
            questionText = "(2013 İlkbahar / Soru 15)\nWhen modern coastal fish-farming began 30 years ago, no one was doing things right, ---- for the environment ---- the industry’s long-term sustainability.",
            options = listOf("A) whether / or", "B) such / as", "C) so / that", "D) either / or", "E) as / as"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 32,
            questionText = "(2013 İlkbahar / Soru 16)\n---- deriving two-thirds of its power supply from fossil fuels, power producers in India cannot get enough pipeline space to distribute natural gas.",
            options = listOf("A) Despite", "B) Besides", "C) As a result of", "D) By means of", "E) Rather than"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2013 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 33,
            questionText = "(2014 Sonbahar / Soru 1)\nAÇIKLAMA 1. Bu soru kitapçığındaki test 80 sorudan oluşmaktadır. 2. Bu test için verilen cevaplama süresi 150 dakikadır (2,5 saat). 3. Bu kitapçıktaki testte yer alan her sorunun sadece bir doğru cevabı vardır. Bir soru için birden çok cevap yeri işaretlenmişse o soru yanlış cevaplanmış sayılacaktır. 4. İşaretlediğiniz bir cevabı değiştirmek istediğinizde, sil- me işlemini çok iyi yapmanız gerektiğini unutmayınız. 5. Bu sınavın değerlendirilmesi doğru cevap sayısı üzerinden yapılacak, yanlış cevaplar dikkate alın- mayacaktır. 6. Cevaplamaya istediğiniz sorudan başlayabilirsiniz. Bir soru ile ilgili cevabınızı, cevap kâğıdında o soru için ay- rılmış olan yere işaretlemeyi unutmayınız. 7. Sınavda uyulacak diğer kurallar bu kitapçığın arka ka- pağında belirtilmiştir. ÖSYM Bu testte 80 soru vardır. The story of creating power begins with the ---- of the most obvious natural resources around us – water and wind.",
            options = listOf("A) termination", "B) estimation", "C) perception", "D) exploitation", "E) elaboration"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 34,
            questionText = "(2014 Sonbahar / Soru 2)\nSince a modern company cannot survive without information and computer technologies, they have become an ---- part of any commercial venture or worldwide business system.",
            options = listOf("A) unavailable", "B) infrequent", "C) intact", "D) unbearable", "E) inseparable"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 35,
            questionText = "(2014 Sonbahar / Soru 3)\nWithout knowing distances ----, it can be difficult to plan a journey, so maps are very beneficial tools for people to find their way easily.",
            options = listOf("A) accurately", "B) suspiciously", "C) innovatively", "D) rapidly", "E) controversially"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 36,
            questionText = "(2014 Sonbahar / Soru 4)\n1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. Exposure to sunshine enables the production of vitamin D in our skin, and this ---- the growth and maintenance of healthy bones and teeth.",
            options = listOf("A) deteriorates", "B) declares", "C) promotes", "D) articulates", "E) differentiates"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 37,
            questionText = "(2014 Sonbahar / Soru 5)\nHow a person ---- stress is more important than the number of stressors in that person’s life.",
            options = listOf("A) copes with", "B) relies on", "C) leads to", "D) puts aside", "E) pertains to"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 38,
            questionText = "(2014 Sonbahar / Soru 6)\nA stroke occurs when the blood supply of an area of brain cells is ---- for a long period of time, resulting in the death of the cells from lack of oxygen and nutrients.",
            options = listOf("A) set up", "B) cut off", "C) put down", "D) left out", "E) taken over"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 39,
            questionText = "(2014 Sonbahar / Soru 7)\nDiğer sayfaya geçiniz.1 ÖSYM The famous artist Raphael’s final works ---- so good that museums like the Prado and the Louvre ---- a whole exhibition to them.",
            options = listOf("A) were / have dedicated", "B) should have been / dedicate", "C) are / had dedicated", "D) would be / are dedicating", "E) have been / will have dedicated"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 40,
            questionText = "(2014 Sonbahar / Soru 8)\nIf the soldiers ---- at the beginning of the siege of Rhodes Island, they ---- to Crete or somewhere else with their treasures.",
            options = listOf("A) surrender / must have been transported", "B) would surrender / could be transported", "C) had surrendered / might have been transported", "D) used to surrender / could have transported", "E) could surrender / should have been transported"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 41,
            questionText = "(2014 Sonbahar / Soru 9)\nA new type of airport X-ray scanner ---- lately by an innovative company ---- the contents of bottles.",
            options = listOf("A) has been built / to detect", "B) was built / to have detected", "C) will be built / being detected", "D) had been built / having detected", "E) is built / to be detected"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 42,
            questionText = "(2014 Sonbahar / Soru 10)\n7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. The study of visual illusions is critical ---- understanding the basic mechanisms of sensory perception and advancing cures ---- neurological diseases.",
            options = listOf("A) off / toward", "B) at / with", "C) in / about", "D) to / for", "E) on / from"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 43,
            questionText = "(2014 Sonbahar / Soru 11)\n---- the chaos that arose after the political and economic changes in the Union of Soviet Socialist Republics, the newly formed republics were anxious to make deals ---- foreign investors.",
            options = listOf("A) During / with", "B) After / upon", "C) Through / off", "D) Before / into", "E) Until / from"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 44,
            questionText = "(2014 Sonbahar / Soru 12)\nBy the age of three, a child’s brain is almost fully grown ---- her bones and muscles are still underdeveloped.",
            options = listOf("A) since", "B) but", "C) if", "D) unless", "E) once"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 45,
            questionText = "(2014 Sonbahar / Soru 13)\n---- the world has been changing more rapidly than ever before, managers and other employees throughout an organization must perform at higher and higher levels.",
            options = listOf("A) Because", "B) In case", "C) As if", "D) Although", "E) Unless"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 46,
            questionText = "(2014 Sonbahar / Soru 14)\nDiğer sayfaya geçiniz.2 ÖSYM ---- evidence of the civilization of the ancient Egypt was apparent everywhere, little was known of its detailed history until its hieroglyphic writing was deciphered in the early 19 th century.",
            options = listOf("A) Since", "B) Just as", "C) Although", "D) Given that", "E) Only if"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 47,
            questionText = "(2014 Sonbahar / Soru 15)\nOne central question in acupuncture is ---- the needles reduce pain ---- patients are simply responding to suggestions.",
            options = listOf("A) whether / or", "B) neither / nor", "C) either / or", "D) so / that", "E) as / as"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 48,
            questionText = "(2014 Sonbahar / Soru 16)\nBeing very significant ---- economical and geopolitical aspects, control of the Bosphorus was always demanded by many countries.",
            options = listOf("A) in spite of", "B) rather than", "C) instead of", "D) regardless of", "E) in terms of"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2014 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 49,
            questionText = "(2014 İlkbahar / Soru 1)\nAÇIKLAMA 1. Bu soru kitapçığındaki test 80 sorudan oluşmaktadır. 2. Bu test için verilen cevaplama süresi 150 dakikadır (2,5 saat). 3. Bu kitapçıktaki testte yer alan her sorunun sadece bir doğru cevabı vardır. Bir soru için birden çok cevap yeri işaretlenmişse o soru yanlış cevaplanmış sayılacaktır. 4. İşaretlediğiniz bir cevabı değiştirmek istediğinizde, sil- me işlemini çok iyi yapmanız gerektiğini unutmayınız. 5. Bu sınavın değerlendirilmesi doğru cevap sayısı üzerinden yapılacak, yanlış cevaplar dikkate alın- mayacaktır. 6. Cevaplamaya istediğiniz sorudan başlayabilirsiniz. Bir soru ile ilgili cevabınızı, cevap kâğıdında o soru için ay- rılmış olan yere işaretlemeyi unutmayınız. 7. Sınavda uyulacak diğer kurallar bu kitapçığın arka ka- pağında belirtilmiştir. ÖSYM Bu testte 80 soru vardır. 1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. Alzheimer’s disease is the major form of mental impairment in older people and is characterized by the ---- of brain tissue over an extended period of time.",
            options = listOf("A) clarification", "B) examination", "C) deterioration", "D) realisation", "E) prevention"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 50,
            questionText = "(2014 İlkbahar / Soru 2)\nAs video-gaming has become a ---- industry that attracts huge investment and intense competition, there are numerous ideas concerning its characteristics.",
            options = listOf("A) massive", "B) constant", "C) challenging", "D) repetitive", "E) complementary"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 51,
            questionText = "(2014 İlkbahar / Soru 3)\nWhen compared with petrol, hydrogen is ---- clean and does not produce carbon emissions when it is burned.",
            options = listOf("A) severely", "B) fundamentally", "C) promptly", "D) gradually", "E) relatively"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 52,
            questionText = "(2014 İlkbahar / Soru 4)\nPeople seem to forget that an e-mail says so much about them, but it can even ---- personality characteristics.",
            options = listOf("A) receive", "B) eliminate", "C) overcome", "D) convey", "E) abandon"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 53,
            questionText = "(2014 İlkbahar / Soru 5)\nChildren’s power to understand and reflect on their experiences ---- their ability to use verbal symbols.",
            options = listOf("A) depends on", "B) looks into", "C) complies with", "D) brings about", "E) sends out"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 54,
            questionText = "(2014 İlkbahar / Soru 6)\nFamous Brazilian photographer Sebastião Salgado ---- photography after a brief career as an economist in the 1970s.",
            options = listOf("A) gave off", "B) took up", "C) called for", "D) pulled over", "E) handed in"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 55,
            questionText = "(2014 İlkbahar / Soru 7)\nDiğer sayfaya geçiniz. ÖSYM 7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. You ---- good about helping others when you see how it ---- a difference for someone else.",
            options = listOf("A) feel / will have made", "B) are feeling / had made", "C) will feel / has made", "D) felt / is making", "E) had felt / will make"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 56,
            questionText = "(2014 İlkbahar / Soru 8)\nIn September 2003, the National Book Foundation ---- that Stephen King ---- the recipient of a ‘lifetime award’.",
            options = listOf("A) would be announcing / is to be", "B) announces / has to be", "C) had announced / used to be", "D) had been announcing / has been", "E) announced / would be"),
            correctOptionIndex = -1,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap @ seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 57,
            questionText = "(2014 İlkbahar / Soru 9)\n---- by the Romans first and then by Arabs, Crete ---- by the Ottomans in the 17 th century.",
            options = listOf("A) Taking over / had been conquered", "B) Having been taken over / had conquered", "C) Having taken over / conquered", "D) Taken over / was conquered", "E) To be taken over / was being conquered"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 58,
            questionText = "(2014 İlkbahar / Soru 10)\nDiseases and injuries that result from alcohol consumption are usually attributed ---- lower socio-economic status, and this seems to be true ---- individuals, countries and regions.",
            options = listOf("A) to / for", "B) at / with", "C) into / across", "D) by / in", "E) upon / along"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 59,
            questionText = "(2014 İlkbahar / Soru 11)\n---- all the roles of the state ---- the modern world, none should be underestimated or ignored.",
            options = listOf("A) At / by", "B) To / across", "C) Of / in", "D) From / upon", "E) Within / for"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 60,
            questionText = "(2014 İlkbahar / Soru 12)\n---- the role of calcium has received an enormous amount of attention, very few people realise that without its partner, magnesium, calcium does not serve the body nearly as well as it should.",
            options = listOf("A) If", "B) Whereas", "C) Whenever", "D) Since", "E) Once"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 61,
            questionText = "(2014 İlkbahar / Soru 13)\nWhether in the countryside or in city, a hotel should not be built ---- there is a proven need for it.",
            options = listOf("A) in case", "B) unless", "C) though", "D) because", "E) after"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 62,
            questionText = "(2014 İlkbahar / Soru 14)\nDiğer sayfaya geçiniz. ÖSYM For centuries, people have thought that we have two brains ---- we have two lungs or two kidneys.",
            options = listOf("A) until", "B) even though", "C) whether", "D) so long as", "E) just as"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 63,
            questionText = "(2014 İlkbahar / Soru 15)\nAs with other chronic illnesses, asthma affects ---- patients ---- their families.",
            options = listOf("A) not only / but also", "B) the more / the more", "C) neither / nor", "D) such / that", "E) less / than"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 64,
            questionText = "(2014 İlkbahar / Soru 16)\n---- children and older people, who suffer most of their unintentional injuries at home, young and middle-aged adults are often injured in the workplace.",
            options = listOf("A) In contrast to", "B) Instead of", "C) Due to", "D) Thanks to", "E) In case of"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2014 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 65,
            questionText = "(2015 Sonbahar / Soru 1)\nÖSYM Bu testte 80 soru vardır. The total amount of military ---- by all the countries of the world in 2010 was $1.63 trillion, which is equivalent to $236 for every person on the planet.",
            options = listOf("A) diversity", "B) requirement", "C) expenditure", "D) dimension", "E) influence"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 66,
            questionText = "(2015 Sonbahar / Soru 2)\nThe speed of wind is measured by using the Beaufort Scale, based on easily ---- factors such as tree movement, smoke behaviour and damage incurred.",
            options = listOf("A) hostile", "B) irrelevant", "C) misleading", "D) additional", "E) observable"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 67,
            questionText = "(2015 Sonbahar / Soru 3)\nToday, contagious diseases rarely kill in developed countries, where improvements in sanitation and nutrition have ---- reduced premature deaths.",
            options = listOf("A) favourably", "B) separately", "C) significantly", "D) dangerously", "E) cautiously"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 68,
            questionText = "(2015 Sonbahar / Soru 4)\n1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. With mankind ---- by an energy crisis and climate change, nuclear power is back on the scene.",
            options = listOf("A) confronted", "B) responded", "C) surpassed", "D) initiated", "E) allowed"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 69,
            questionText = "(2015 Sonbahar / Soru 5)\nPeople have always been fascinated by the stars and planets in the night sky, but they had to ---- just the naked eye to make them out until the telescope was invented in 1609.",
            options = listOf("A) rely on", "B) look up", "C) put off", "D) take up", "E) bring back"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 70,
            questionText = "(2015 Sonbahar / Soru 6)\nBlood type has been linked with a variety of mental disorders, but associations are weak; many other factors are more important in determining who ---- a particular illness.",
            options = listOf("A) runs out of", "B) ends up with", "C) makes up for", "D) gets back to", "E) cuts down on"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 71,
            questionText = "(2015 Sonbahar / Soru 7)\nDiğer sayfaya geçiniz.1 ÖSYM Costa Rica ---- the first country in Central America to grow coffee, and for the last 100 years, this ---- its leading export.",
            options = listOf("A) is / was", "B) was / has been", "C) had been / used to be", "D) would be / had been", "E) could be / is"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 72,
            questionText = "(2015 Sonbahar / Soru 8)\nComplex human language ---- suddenly and without progression; like other advanced capabilities, it ---- in a series of stages.",
            options = listOf("A) does not appear / can evolve", "B) has not appeared / might evolve", "C) did not appear / must have evolved", "D) will not appear / could have evolved", "E) had not appeared / should have evolved"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 73,
            questionText = "(2015 Sonbahar / Soru 9)\nMany advanced nations ---- space exploration, and plans are under way ---- a human presence on Mars.",
            options = listOf("A) begin / seeing", "B) have begun / to see", "C) are beginning / to have seen", "D) began / being seen", "E) had begun / having seen"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 74,
            questionText = "(2015 Sonbahar / Soru 10)\n7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. Governments, organizations and businesses are becoming increasingly concerned ---- social responsibility and ethical issues surrounding the problem ---- maintaining economic growth.",
            options = listOf("A) with / of", "B) on / by", "C) into / from", "D) for / beyond", "E) at / behind"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 75,
            questionText = "(2015 Sonbahar / Soru 11)\nPersonality psychology focuses on the consistency in people’s behaviour ---- time and the traits that differentiate one person ---- another.",
            options = listOf("A) at / for", "B) over / from", "C) in / of", "D) within / by", "E) around / to"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 76,
            questionText = "(2015 Sonbahar / Soru 12)\nTelecommunication companies install cell towers in places where the network will get sufficient use, ---- sparsely populated areas do not qualify, which means people there lack access to reliable phone service.",
            options = listOf("A) in case", "B) even if", "C) so", "D) although", "E) just as"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 77,
            questionText = "(2015 Sonbahar / Soru 13)\n---- the 50-second silent film Train Pulling Into A Station was first shown in 1895, people were so terrified by the locomotive racing towards them that they hurried to the back of the theatre.",
            options = listOf("A) Before", "B) Although", "C) Since", "D) When", "E) As if"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 78,
            questionText = "(2015 Sonbahar / Soru 14)\nDiğer sayfaya geçiniz.2 ÖSYM Much evidence points to a relationship between stress and disease ---- claims that stressful life events and daily routines cause various diseases are still premature.",
            options = listOf("A) since", "B) if", "C) once", "D) only when", "E) but"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 79,
            questionText = "(2015 Sonbahar / Soru 15)\nScientists do research in natural forces ---- for the sake of new discoveries ---- to use the findings for the advantage of mankind.",
            options = listOf("A) not only / but also", "B) so / that", "C) the more / the more", "D) such / that", "E) whether / or"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 80,
            questionText = "(2015 Sonbahar / Soru 16)\nOne way to reduce the negative impact people have on the environment is to make sure that as much garbage as possible is recycled ---- being put in a landfill.",
            options = listOf("A) because of", "B) in terms of", "C) for the sake of", "D) instead of", "E) in case of"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2015 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 81,
            questionText = "(2015 İlkbahar / Soru 1)\nAÇIKLAMA 1. Bu soru kitapçığındaki test 80 sorudan oluşmaktadır. 2. Bu test için verilen toplam cevaplama süresi 150 dakikadır (2,5 saat). 3. Testteki her sorunun sadece bir doğru cevabı vardır. Bir soru için birden çok cevap yeri işaretlenmişse o soru yanlış cevaplanmış sayılacaktır. 4. İşaretlediğiniz bir cevabı değiştirmek istediğinizde, sil- me işlemini çok iyi yapmanız gerektiğini unutmayınız. 5. Bu sınavın değerlendirilmesi doğru cevap sayısı üzerinden yapılacak, yanlış cevaplar dikkate alın- mayacaktır. 6. Cevaplamaya istediğiniz sorudan başlayabilirsiniz. Bir soru ile ilgili cevabınızı, cevap kâğıdında o soru için ay- rılmış olan yere işaretlemeyi unutmayınız. 7. Sınavda uyulacak diğer kurallar bu kitapçığın arka ka- pağında belirtilmiştir. ÖSYM Bu testte 80 soru vardır. For years, information systems experts have faced the ---- of convincing business managers of the value they provide to the organizations.",
            options = listOf("A) challenge", "B) appreciation", "C) consciousness", "D) assurance", "E) designation"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 82,
            questionText = "(2015 İlkbahar / Soru 2)\nAlthough including children with special needs in learning environments with their typical peers presents many obstacles, the rewards, benefits and teamwork make it ----.",
            options = listOf("A) worthwhile", "B) legitimate", "C) obligatory", "D) questionable", "E) implicit"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 83,
            questionText = "(2015 İlkbahar / Soru 3)\nHerbal treatment administered in a medical context has been shown to induce relief from symptoms in an ---- wide range of illnesses including allergies, asthma, cancer, depression, diabetes and migraine.",
            options = listOf("A) impressively", "B) accurately", "C) eventually", "D) unbearably", "E) exclusively"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 84,
            questionText = "(2015 İlkbahar / Soru 4)\nTotal world population seems to have ---- around a level of approximately half a billion people until the modern period, when it began to climb steadily.",
            options = listOf("A) appeared", "B) expired", "C) qualified", "D) fluctuated", "E) weakened"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 85,
            questionText = "(2015 İlkbahar / Soru 5)\n1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. A) B) C) A) B) C) A) B) C) A) B) C) By 2008, the UK had begun to return to nuclear power by ---- the construction of new reactors.",
            options = listOf("A) calling for", "B) turning over", "C) putting off", "D) taking apart", "E) pulling up"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 86,
            questionText = "(2015 İlkbahar / Soru 6)\nFrom the ancient pyramids to today’s hi-tech skyscrapers, powerful people have always ---- their status through impressive buildings.",
            options = listOf("A) put on", "B) laid out", "C) shown off", "D) given in", "E) passed over"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 87,
            questionText = "(2015 İlkbahar / Soru 7)\nA) B) C) A) B) C) Diğer sayfaya geçiniz.1 ÖSYM It ---- fourteen years since his last feature film, Ryan’s Daughter, when David Lean ---- to filmmaking with his 1984 adaptation of E. M. Forster’s celebrated novel, A Passage to India.",
            options = listOf("A) had been / returned", "B) has been / had returned", "C) was / returns", "D) will be / would return", "E) is / has returned"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 88,
            questionText = "(2015 İlkbahar / Soru 8)\nBehind every architectural masterpiece ---- a brand new technology without which these structures ---- a few years ago.",
            options = listOf("A) has been / did not have to be built", "B) is / could not have been built", "C) had been / would not have been built", "D) was / need not have been built", "E) will be / should not have been built"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 89,
            questionText = "(2015 İlkbahar / Soru 9)\n7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. Philosophy did not play a large part in Roman culture, other than Stoicism, which ---- by the Romans for its emphasis on virtuous conduct and ---- one’s duty.",
            options = listOf("A) is to be admired / to have done", "B) is admired / to do", "C) had been admired / having done", "D) was admired / doing", "E) could be admired / being done"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 90,
            questionText = "(2015 İlkbahar / Soru 10)\nAs a young officer, Mustafa Kemal Atatürk was critical ---- the government of the Ottoman Empire and became involved ---- the Committee of Union and Progress.",
            options = listOf("A) to / for", "B) of / with", "C) at / upon", "D) from / in", "E) toward / under"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 91,
            questionText = "(2015 İlkbahar / Soru 11)\nThe ultimate goal ---- medical profession is not to replace whole organs but to repair damaged organs ---- healthy cells. of / over",
            options = listOf("A) to / on", "B) for / with", "C) against / into", "D) behind / towards", "E) A) B) C)"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 92,
            questionText = "(2015 İlkbahar / Soru 12)\nDiğer sayfaya geçiniz.2 ÖSYM Digital media communication differs significantly from conventional marketing communication ---- digital media enable new forms of interaction and new models for information exchange.",
            options = listOf("A) although", "B) since", "C) only if", "D) in case", "E) even if"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 93,
            questionText = "(2015 İlkbahar / Soru 13)\nThe mouth is the first part of the digestive system, where food is broken and chewed ---- it can easily be swallowed.",
            options = listOf("A) so that", "B) since", "C) just as", "D) as long as", "E) once"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 94,
            questionText = "(2015 İlkbahar / Soru 14)\nFire was essential for the growth of human civilization ---- people used it to cook their food, warm their homes, clear woodland for cultivation, make pottery, and eventually melt metals for ores.",
            options = listOf("A) unless", "B) even if", "C) whenever", "D) as", "E) in case"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 95,
            questionText = "(2015 İlkbahar / Soru 15)\nJapan is enormously centralized, and Tokyo, the capital city, hosts ---- the national government ---- the stock market and the world’s largest companies. not only / but also whether / or neither / nor",
            options = listOf("A) such / that", "B) the more / the less", "C) A) B) C)", "D) A) B) C)", "E) A) B) C)"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 96,
            questionText = "(2015 İlkbahar / Soru 16)\nPrejudice may be expressed by people who have developed generally negative personalities, perhaps ---- being raised in harsh and restrictive families. as a result of",
            options = listOf("A) in terms of", "B) rather than", "C) in contrast with", "D) in place of", "E) A) B) C)"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2015 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 97,
            questionText = "(2016 Sonbahar / Soru 1)\nÖSYM Bu tesāe 80 soru vardır. There is new ---- that dinosaurs were warm-blooded like birds and mammals rather than cold-blooded like reptiles.",
            options = listOf("A) compulsion", "B) frustration", "C) evidence", "D) significance", "E) fulfillment"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 98,
            questionText = "(2016 Sonbahar / Soru 2)\nThe tendency towards increasingly bitter chocolate has its origins in the ---- fall in cocoa prices in the 1980s.",
            options = listOf("A) dramatic", "B) permanent", "C) empirical", "D) subtle", "E) hectic"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 99,
            questionText = "(2016 Sonbahar / Soru 3)\nAn understanding of the physiology of stress does not ---- clarify its meaning, thus several models have been constructed in an attempt to better define and explain it.",
            options = listOf("A) arguably", "B) jointly", "C) eventually", "D) completely", "E) desperately"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 100,
            questionText = "(2016 Sonbahar / Soru 4)\n1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. That we have the ability to detect and ---- minute differences in the fat content of food suggests that this ability must have had considerable evolutionary importance.",
            options = listOf("A) discriminate", "B) hinder", "C) undermine", "D) tackle", "E) protect"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 101,
            questionText = "(2016 Sonbahar / Soru 5)\nChildren who are securely attached to their mother by the time they enter their second year of life are better equipped to ---- new experiences and relationships.",
            options = listOf("A) depend on", "B) turn down", "C) refrain from", "D) cope with", "E) carry out"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 102,
            questionText = "(2016 Sonbahar / Soru 6)\nThe success of advertising ultimately ---- whether it influences consumer behaviour.",
            options = listOf("A) breaks in", "B) disposes of", "C) gives away", "D) rests on", "E) tears apart"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 103,
            questionText = "(2016 Sonbahar / Soru 7)\nDiğer sayfaya geçiniz.1 ÖSYM Although Immanuel Kant, one of the greatest thinkers in the history of philosophy, ---- many pieces of technical terminology to articulate the themes of his critical philosophy, perhaps none ---- more pervasive than a priori.",
            options = listOf("A) was introducing / was", "B) introduced / is", "C) had introduced / had been", "D) used to introduce / has been", "E) had been introducing / would be"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 104,
            questionText = "(2016 Sonbahar / Soru 8)\nIn cultures that ---- up to more recent times, we ---- further clues to past beliefs.",
            options = listOf("A) will survive / need to find", "B) had survived / could find", "C) survived / would find", "D) survive / used to find", "E) have survived / may find"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 105,
            questionText = "(2016 Sonbahar / Soru 9)\n7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. The Internet provides a platform which enables new products ---- more rapidly since it is possible ---- new ideas and concepts through online research.",
            options = listOf("A) being developed / testing", "B) to develop / to have tested", "C) developing / to be tested", "D) to be developed / to test", "E) having developed / being tested"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 106,
            questionText = "(2016 Sonbahar / Soru 10)\nEducation plays an important role ---- improving people's health, and educated people are more likely to be informed consumers of health care, gathering information ---- diseases and potential treatments.",
            options = listOf("A) to / upon", "B) in / on", "C) at / about", "D) with / from", "E) for / over"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 107,
            questionText = "(2016 Sonbahar / Soru 11)\nExcluding minor skin cancers, breast cancer is the single most common type of cancer ---- women based ---- American Cancer Society data.",
            options = listOf("A) in / from", "B) with / for", "C) among / upon", "D) within / about", "E) on / of"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 108,
            questionText = "(2016 Sonbahar / Soru 12)\nDiğer sayfaya geçiniz.2 ÖSYM ---- some people produce irresistibly scented sweat that insects can detect from 30 m away, they are especially attractive to mosquitoes.",
            options = listOf("A) Until", "B) As", "C) Whereas", "D) Whether", "E) Before"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 109,
            questionText = "(2016 Sonbahar / Soru 13)\n---- using renewable energy is potentially a means of combating global warming, renewable energy facilities can be very expensive to establish.",
            options = listOf("A) Unless", "B) Although", "C) Just as", "D) Until", "E) When"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 110,
            questionText = "(2016 Sonbahar / Soru 14)\nStandard Mail Transfer Protocol employs an elaborate letter-and-number code that tells each computer station what it must do with a message ---- it can reach its destination.",
            options = listOf("A) as though", "B) in case", "C) so that", "D) even if", "E) now that"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 111,
            questionText = "(2016 Sonbahar / Soru 15)\nLeonardo da Vinci’s drawings for machines are ---- accurate ---- it has been possible for modern engineers to build some of them.",
            options = listOf("A) so / that", "B) as / as", "C) either / or", "D) more / than", "E) neither / nor"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 112,
            questionText = "(2016 Sonbahar / Soru 16)\n---- the promising prospects that carbon capture and storage technology offers to prevent air pollution, it is still a rather new technique requiring much more research before it can be utilized on a large scale.",
            options = listOf("A) Owing to", "B) Rather than", "C) In spite of", "D) Similar to", "E) Except for"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2016 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 113,
            questionText = "(2016 İlkbahar / Soru 1)\nÖSYM Bu tes e 80 soru vardır. As we learn more about the neural mechanisms of intelligence, ---- for enhancing intelligence become more likely.",
            options = listOf("A) precautions", "B) substitutions", "C) necessities", "D) prospects", "E) permissions"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 114,
            questionText = "(2016 İlkbahar / Soru 2)\nFrom the early 1800s scientists began to gather ---- amounts of data about marine life, paving the way for future knowledge about the importance of the planet's oceans.",
            options = listOf("A) immense", "B) predictable", "C) equivalent", "D) relevant", "E) sustainable"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 115,
            questionText = "(2016 İlkbahar / Soru 3)\nReduction in cholesterol, body fat and oxidation is believed to help slow the ageing process ----.",
            options = listOf("A) doubtfully", "B) reflectively", "C) externally", "D) obscurely", "E) considerably"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 116,
            questionText = "(2016 İlkbahar / Soru 4)\nTrade between people depends on a uniform set of weights and measures that can be used by both sides of the transaction to ---- that the amount obtained or handed over is correct.",
            options = listOf("A) disapprove", "B) pretend", "C) ensure", "D) realise", "E) estimate"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 117,
            questionText = "(2016 İlkbahar / Soru 5)\n1. - 6.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. Despite its problems, the Space Shuttle has been a major step forward in spaceflight, ---- more than one hundred successful missions and pointing the way for future reusable spacecraft.",
            options = listOf("A) standing for", "B) carrying out", "C) running into", "D) calling for", "E) putting aside"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 118,
            questionText = "(2016 İlkbahar / Soru 6)\nFrom the beginning of human history , innovators have experimented with all kinds of elements, from the ordinary to the invisible, trying to ---- new, improved materials.",
            options = listOf("A) come up with", "B) do away with", "C) cut down on", "D) get along with", "E) make up for"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 119,
            questionText = "(2016 İlkbahar / Soru 7)\nDiğer sayfaya geçiniz.1 ÖSYM With the development of agriculture, humans ---- to transform more and more extensively the environments in which they ----.",
            options = listOf("A) had begun / had been living", "B) are beginning / were living", "C) began / lived", "D) have begun / were going to live", "E) would begin / have been living"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 120,
            questionText = "(2016 İlkbahar / Soru 8)\nAny student who ---- four years in high school or college attempting to learn a second language ---- the struggle of trying to memorize vocabulary, verb conjugation or tenses.",
            options = listOf("A) was spending / had to appreciate", "B) spends / has to appreciate", "C) had spent / should have appreciated", "D) has spent / can appreciate", "E) is spending / used to appreciate"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 121,
            questionText = "(2016 İlkbahar / Soru 9)\nFor many consumers from all over the world, the Internet is the first place ---- for useful information that ---- them about what they buy.",
            options = listOf("A) to look / will inform", "B) looking / has informed", "C) to have looked / informs", "D) to be looking / is informing", "E) having looked / will have informed"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 122,
            questionText = "(2016 İlkbahar / Soru 10)\n7. - 16.  sorularda, cümlede boş bırakılan yerlere uygun düşen sözcük veya ifadeyi bulunuz. In 1971, construction began on a vast hydroelectric project to dam the rivers that flow ---- James Bay and Hudson Bay, generating electricity ---- use in Canada and the US.",
            options = listOf("A) through / in", "B) by / with", "C) along / about", "D) at / on", "E) into / for"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 123,
            questionText = "(2016 İlkbahar / Soru 11)\nBy the middle of the 19 th century, the growing acceptance that microbes can kill us had once more focused people’s attention ---- a world only visible ---- a microscope.",
            options = listOf("A) on / through", "B) to / upon", "C) by / over", "D) against / in", "E) of / for"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 124,
            questionText = "(2016 İlkbahar / Soru 12)\nAstronomers discover thousands of new members of the solar system every month, most of which, ----, are insignificant bodies like small asteroids or comets.",
            options = listOf("A) however", "B) therefore", "C) otherwise", "D) accordingly", "E) in other words"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 125,
            questionText = "(2016 İlkbahar / Soru 13)\n---- sustainable technologies usually cost a lot of money to set up, they save money in the long run.",
            options = listOf("A) Even if", "B) After", "C) Just as", "D) Unless", "E) Once"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 126,
            questionText = "(2016 İlkbahar / Soru 14)\nDiğer sayfaya geçiniz.2 ÖSYM With normal ocean waves, only the surface of the water body is in motion; a tsunami, ----, brings not only the surface into motion but lifts and then drops an entire water column in the ocean.",
            options = listOf("A) namely", "B) though", "C) for example", "D) similarly", "E) hence"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 127,
            questionText = "(2016 İlkbahar / Soru 15)\nThe basic principles of good diets are ---- simple ---- one can summarize them in just ten words: eat less, move more, eat lots of fruits and vegetables.",
            options = listOf("A) neither / nor", "B) the more / the less", "C) whether / or", "D) such / as", "E) so / that"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 128,
            questionText = "(2016 İlkbahar / Soru 16)\nThe henna, which may have spiritual significance in various cultures, is applied ---- different graphic rules, with different symbolic relations.",
            options = listOf("A) due to", "B) except for", "C) unlike", "D) according to", "E) prior to"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2016 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 129,
            questionText = "(2017 Sonbahar / Soru 1)\nÖSYM Some ethnic minority groups of students within the US, such as African Americans and Hispanic Americans, achieve below the national average of all students; however, one ---- is the high educational achievements demonstrated by Asian American students.",
            options = listOf("A) aspiration", "B) defect", "C) exception", "D) influence", "E) complaint"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 130,
            questionText = "(2017 Sonbahar / Soru 2)\nWithout artificial fertilisers and pesticides, there would not be enough food grown on Earth to satisfy our needs, even with equal ---- of agricultural output.",
            options = listOf("A) recognition", "B) deterioration", "C) distribution", "D) fluctuation", "E) reduction"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 131,
            questionText = "(2017 Sonbahar / Soru 3)\nAn important reason to re-evaluate how we are raising the next generation grows out of an incredibly exciting discovery about brain development: during adolescence, the brain’s potential to change through experience is ----. tremendous",
            options = listOf("A) frustrating", "B) debatable", "C) redundant", "D) exhausted", "E) A) B) C)"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 132,
            questionText = "(2017 Sonbahar / Soru 4)\nChildren and adolescents with attention deficit or hyperactivity disorder frequently experience difficulties in school settings, most ---- in the areas of academic achievement and interpersonal relationships.",
            options = listOf("A) appropriately", "B) urgently", "C) subtly", "D) compulsorily", "E) notably"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 133,
            questionText = "(2017 Sonbahar / Soru 5)\nChildren who grow up in two-parent homes where the parents are non-traditional in their own gender roles ---- less gender-stereotypic behaviour than do children whose parents are traditional in their role enactment.",
            options = listOf("A) display", "B) alter", "C) achieve", "D) reject", "E) eradicate"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 134,
            questionText = "(2017 Sonbahar / Soru 6)\nWhen Columbus sailed west from Spain in 1492 in pursuit of the riches of the Far East, he ---- recent advances in navigation and age-old geographical knowledge. kept off drew on",
            options = listOf("A) put forward", "B) gave away", "C) brought about", "D) A) B) C)", "E) ÖSYM"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 135,
            questionText = "(2017 Sonbahar / Soru 7)\nIn 1517, the Italian physician Girolamo Fracastoro was probably the first person ---- that fossils are animal remains; however, it was not until the 18th century that scientists ---- to realise that fossils can tell us a great deal about the history of living things.",
            options = listOf("A) suggesting / had begun", "B) being suggested / were beginning", "C) to have suggested / have begun", "D) to suggest / began", "E) having suggested / were going to begin"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 136,
            questionText = "(2017 Sonbahar / Soru 8)\nThe technological advancements that once made nations prosperous, such as the internal combustion engine, ---- to shatter empires during the First World War, on a scale few people ---- before the outbreak of the war.",
            options = listOf("A) had been used / should have imagined", "B) should have been used / used to imagine", "C) would have been used / might have imagined", "D) were used / could have imagined", "E) must have been used / can imagine"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 137,
            questionText = "(2017 Sonbahar / Soru 9)\nTomatoes are so widely consumed that they represent a vehicle ---- beneficial nutrients to those who ---- expensive seasonal berries.",
            options = listOf("A) having introduced / would not afford", "B) introducing / could not afford", "C) to have introduced / may not afford", "D) to introduce / cannot afford", "E) being introduced / might not afford"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 138,
            questionText = "(2017 Sonbahar / Soru 10)\nEarly mastery of fire offered many benefits to humankind, including protection ---- wild animals, heat that enabled them to spread ---- cooler regions, and the ability to cook food.",
            options = listOf("A) against / into", "B) from / by", "C) to / over", "D) for / along", "E) on / towards"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 139,
            questionText = "(2017 Sonbahar / Soru 11)\nAnschluss, the political union of Germany and Austria, was specifically prohibited ---- the Versailles Treaty, but was carried out by Hitler in March 1938 ---- any resistance from the victors of the First World War. across / through",
            options = listOf("A) under / without", "B) for / on", "C) from / behind", "D) to / about", "E) ÖSYM"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 140,
            questionText = "(2017 Sonbahar / Soru 12)\nHome-grown produce tastes better than grocery store produce ---- it is freshly picked and perfectly ripe, which shines through even when cooked or preserved.",
            options = listOf("A) although", "B) whereas", "C) whether", "D) because", "E) unless"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 141,
            questionText = "(2017 Sonbahar / Soru 13)\n---- there have been dozens of proposals for gender-neutral third-person pronouns in English over the past two centuries, none has gained acceptance.",
            options = listOf("A) Now that", "B) As long as", "C) In case", "D) Once", "E) Even though"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 142,
            questionText = "(2017 Sonbahar / Soru 14)\nThe story of the cat’s domestication is one of mutual appreciation: early farming communities benefited from cats’ rodent-catching skills ---- cats won themselves protection and shelter without losing their independence.",
            options = listOf("A) even if", "B) only when", "C) as soon as", "D) while", "E) before"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 143,
            questionText = "(2017 Sonbahar / Soru 15)\nIn most cultures around the world, men and women typically differ in a number of ways ---- physical appearance, personality traits, and occupational preferences. in case of in spite of",
            options = listOf("A) such as", "B) similar to", "C) as well as", "D) A) B) C)", "E) A) B) C)"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 144,
            questionText = "(2017 Sonbahar / Soru 16)\n19th-century scientists fell into a bitter debate as to ---- intelligence lay in anatomy ---- a vital force was responsible for thoughts. as / as",
            options = listOf("A) neither / nor", "B) so / that", "C) whether / or", "D) not only / but also", "E) ÖSYM"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 145,
            questionText = "(2017 İlkbahar / Soru 1)\nÖSYM The ageing of population, also known as 'demographic ageing', is a term used to describe ---- in the age distribution of a population from the young towards people of older ages.",
            options = listOf("A) opportunities", "B) regulations", "C) shifts", "D) assumptions", "E) conflicts"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 146,
            questionText = "(2017 İlkbahar / Soru 2)\nLarge collections of books are often unusable without careful attention to classification, so providing easy access to library materials using such labels as author, title, and subject, is essential for proper ---- of any library.",
            options = listOf("A) violation", "B) justification", "C) abandonment", "D) utilisation", "E) elimination"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 147,
            questionText = "(2017 İlkbahar / Soru 3)\nDuring  the investigation of a lethal or an easily transmitted disease, the necessary precautions must be taken to protect health staff, because they are ---- to catching the disease in question. committed adaptable",
            options = listOf("A) entitled", "B) vulnerable", "C) accessible", "D) A) B) C)", "E) A) B) C)"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 148,
            questionText = "(2017 İlkbahar / Soru 4)\nA) B) C) IQ tests are often faulted for ignoring cultural or social biases, particularly with regard to schoolchildren, and critics claim they cannot ---- predict a person’s future performance.",
            options = listOf("A) initially", "B) accurately", "C) conventionally", "D) narrowly", "E) strictly"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 149,
            questionText = "(2017 İlkbahar / Soru 5)\nParents who are responsive, non-authoritarian, and who manifest empathetic and caring behaviours can ---- the development of empathy in their children.",
            options = listOf("A) delay", "B) acknowledge", "C) relieve", "D) enhance", "E) surpass"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 150,
            questionText = "(2017 İlkbahar / Soru 6)\nWorld War II is an important turning point in that it ---- the beginning of the end of colonial empires. made out handed down brought about took over",
            options = listOf("A) put back", "B) A) B) C)", "C) A) B) C)", "D) A) B) C)", "E) ÖSYM"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 151,
            questionText = "(2017 İlkbahar / Soru 7)\nNew research ---- that mother monkeys ---- to other females to help share the burden of raising increasingly dependent offspring.",
            options = listOf("A) had suggested / were turning", "B) suggests / had turned", "C) suggested / have turned", "D) has suggested / turn", "E) will suggest / are turning"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 152,
            questionText = "(2017 İlkbahar / Soru 8)\nPatients with implants or electronic devices put inside their bodies ---- using magnetic resonance imaging (MRI) because the machine’s magnet ---- these objects within the body, causing damage.",
            options = listOf("A) should not be examined / must move", "B) could not be examined / had to move", "C) may not be examined / used to move", "D) cannot be examined / could move", "E) must not be examined / ought to move"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 153,
            questionText = "(2017 İlkbahar / Soru 9)\nIn the age of steam, with new railroads ---- across Europe and the US, engineers began ---- even more applications for the steam engine.",
            options = listOf("A) to spread / finding", "B) having spread / to have found", "C) spreading / to find", "D) to have spread / find", "E) spread / having found"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 154,
            questionText = "(2017 İlkbahar / Soru 10)\nMore than 80 percent of the dry land will be affected if temperatures continue to increase ---- the present rate, but ---- very different extents.",
            options = listOf("A) on / for", "B) at / to", "C) by / with", "D) in / about", "E) from / over"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 155,
            questionText = "(2017 İlkbahar / Soru 11)\nStarting ---- 800 AD, many agricultural communities emerged ---- the Mississippi and in other fertile river valleys in North America. for / by over / about on / with",
            options = listOf("A) at / in", "B) around / along", "C) A) B) C)", "D) A) B) C)", "E) ÖSYM"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 156,
            questionText = "(2017 İlkbahar / Soru 12)\n70 percent of the Earth's surface is liquid, ---- water scarcity affects more than a billion people each year.",
            options = listOf("A) as if", "B) yet", "C) given that", "D) instead", "E) thus"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 157,
            questionText = "(2017 İlkbahar / Soru 13)\nAlphabetic writing systems are easy to learn and maximally efficient for transcribing any human language, ---- they are considered one of the major achievements of civilisation.",
            options = listOf("A) otherwise", "B) but", "C) so", "D) whether", "E) as"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 158,
            questionText = "(2017 İlkbahar / Soru 14)\n---- historians cannot agree on when gold was first discovered, there is some evidence to suggest that the Egyptians were the first to mine it. Now that Just as Even though",
            options = listOf("A) As long as", "B) In case", "C) A) B) C)", "D) A) B) C)", "E) A) B) C)"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 159,
            questionText = "(2017 İlkbahar / Soru 15)\nWheat, which has been a staple food for centuries, can turn out to be bad for some people ---- because they are allergic to it ---- because they have an autoimmune disorder.",
            options = listOf("A) so / that", "B) neither / nor", "C) as / as", "D) the more / the more", "E) either / or"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 160,
            questionText = "(2017 İlkbahar / Soru 16)\n---- its similarities with other Italian cities, it is important to emphasise that Venice's aquatic environment and associations with foreign lands via the sea endowed it with a uniqueness. Due to By means of",
            options = listOf("A) In terms of", "B) In case of", "C) Despite", "D) A) B) C)", "E) ÖSYM"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2017 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 161,
            questionText = "(2018 Sonbahar / Soru 1)\nOSYM001 For smokers who are under increased pressure to give up smoking, one of the easiest ---- is that quitting smoking makes people more likely to put on weight.",
            options = listOf("A) incentives", "B) attempts", "C) purposes", "D) excuses", "E) features"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 162,
            questionText = "(2018 Sonbahar / Soru 2)\nThe primary ---- of an organisation’s accounting department are to process financial information and to prepare financial statements at the end of the accounting period.",
            options = listOf("A) advancements", "B) compensations", "C) obstacles", "D) objectives", "E) classifications"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 163,
            questionText = "(2018 Sonbahar / Soru 3)\nScholars and historians have offered possible locations for the mythical island Atlantis, even in the face of ---- scientific evidence that it does not exist.",
            options = listOf("A) compelling", "B) doubtful", "C) erroneous", "D) refutable", "E) ambiguous"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 164,
            questionText = "(2018 Sonbahar / Soru 4)\nThe Big Bang theory is the explanation most commonly ---- by astronomers for the origin of the universe.",
            options = listOf("A) discovered", "B) accepted", "C) regulated", "D) conducted", "E) influenced"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 165,
            questionText = "(2018 Sonbahar / Soru 5)\nThe relationship between sport and aggression has been studied ---- for decades, yet researchers still have a limited understanding of the link between the two.",
            options = listOf("A) severely", "B) suspiciously", "C) uniquely", "D) extensively", "E) instantly"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 166,
            questionText = "(2018 Sonbahar / Soru 6)\nSense of control refers to the degree to which people believe that they can deliberately ---- desired outcomes and avoid undesirable ones in their environment.",
            options = listOf("A) fill out", "B) bring about", "C) switch off", "D) turn down", "E) hand over"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 167,
            questionText = "(2018 Sonbahar / Soru 7)\nFor a long time, scientists ---- aware that the Earth’s atmosphere is not static, but is in constant motion, producing areas of ever-changing pressure around the globe, but from 1700 onward, scientists ---- to discover how and why large-scale atmospheric movements occur.",
            options = listOf("A) had been / have begun", "B) would have been / had begun", "C) have been / began", "D) would be / were beginning", "E) were / would have begun"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 168,
            questionText = "(2018 Sonbahar / Soru 8)\nScience ---- our every question, but it ---- humanity’s best tool yet for tackling our greatest challenges.",
            options = listOf("A) may not answer / had remained", "B) must not answer / has remained", "C) should not answer / will remain", "D) cannot answer / remained", "E) might not answer / remains"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 169,
            questionText = "(2018 Sonbahar / Soru 9)\nFive of the Solomon Islands ---- whole by rising sea levels, ---- a glimpse into the future of other low-lying nations, such as the Netherlands and Italy.",
            options = listOf("A) are being swallowed / having offered", "B) had been swallowed / being offered", "C) will be swallowed / having been offered", "D) were swallowed / offered", "E) have been swallowed / offering"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 170,
            questionText = "(2018 Sonbahar / Soru 10)\nResearch ---- media has primarily examined the effects of media on children ---- a developmental perspective with a psychological focus on the correlation or causal variables between the media and children’s behaviour.",
            options = listOf("A) against / under", "B) on / from", "C) through / across", "D) in / beyond", "E) at / over"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 171,
            questionText = "(2018 Sonbahar / Soru 11)\nIdentifying the specific effects of beneficial microbes that thrive ---- the surface of our bodies and deep ---- our tissues, researchers are gaining a new view of how our bodies function.",
            options = listOf("A) at / over", "B) in / along", "C) by / down", "D) on / within", "E) from / through"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 172,
            questionText = "(2018 Sonbahar / Soru 12)\nMost cheesemakers believe that the brilliant nuances of flavour found in raw milk, with its naturally present ‘good’ bacteria, simply cannot be duplicated in a pasteurised milk cheese ---- some well-respected cheeses, including British Stilton, are made only from pasteurised milk.",
            options = listOf("A) now that", "B) after", "C) although", "D) because", "E) only if"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 173,
            questionText = "(2018 Sonbahar / Soru 13)\nSurprisingly, the symbol for zero emerged later than the concepts for other numbers, and ---- the Babylonians used a symbol for zero, it was merely a placeholder and not used for computational purposes.",
            options = listOf("A) just as", "B) as if", "C) in case", "D) because", "E) even though"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 174,
            questionText = "(2018 Sonbahar / Soru 14)\nStudies have found that the effects of a cup of coffee or a glass of cola are noticeable after just 10 minutes ---- the peak caffeine concentration in the blood occurs after 45 minutes.",
            options = listOf("A) since", "B) but", "C) provided that", "D) as long as", "E) unless"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 175,
            questionText = "(2018 Sonbahar / Soru 15)\nAnimals are hunted by humans ---- for their meat ---- for parts of their bodies that are used to create medicines, clothes, and jewellery.",
            options = listOf("A) neither / nor", "B) such / that", "C) not only / but also", "D) the more / the more", "E) as / as"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 176,
            questionText = "(2018 Sonbahar / Soru 16)\n---- its notoriety as a naval weapon, the first modern torpedo was developed in landlocked Austria, or rather in what was then the Austrian Empire stretching down to the Adriatic.",
            options = listOf("A) Along with", "B) In terms of", "C) Despite", "D) Due to", "E) Instead of"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 177,
            questionText = "(2018 İlkbahar / Soru 1)\nGender studies is a multifaceted field of inquiry into social structures and social relations that has important ---- for the study of violence, peace and conflict.",
            options = listOf("A) challenges", "B) divisions", "C) implications", "D) drawbacks", "E) requirements"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 178,
            questionText = "(2018 İlkbahar / Soru 2)\nNano-tech products can potentially save lives as well as give us hundreds of new conveniences from enhanced drug delivery and disease ---- to fabric that will not stain.",
            options = listOf("A) progression", "B) manipulation", "C) detection", "D) transmission", "E) inheritance"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 179,
            questionText = "(2018 İlkbahar / Soru 3)\nThe thin, invisible layer of gas surrounding the Earth, which is called the atmosphere, shields us from the vacuum of space and protects us from ---- solar radiation.",
            options = listOf("A) delicate", "B) excessive", "C) vigorous", "D) elaborate", "E) swift"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 180,
            questionText = "(2018 İlkbahar / Soru 4)\nArchitectural analysis is not only a ---- academic pursuit, done for its own sake, but it can be informative and entertaining as well.",
            options = listOf("A) mutually", "B) convincingly", "C) drastically", "D) purely", "E) deniably"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 181,
            questionText = "(2018 İlkbahar / Soru 5)\nChildcare is a broad term that ---- services which protect the health, safety, and well-being of children who require custodial care by adults other than their own parents for a temporary period of time.",
            options = listOf("A) hinders", "B) encompasses", "C) creates", "D) eliminates", "E) suspends"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 182,
            questionText = "(2018 İlkbahar / Soru 6)\nTaking a break, and distracting your mind for a while, not only gives you the spare time to be creative, but it can also give your brain the space it needs to ---- creative solutions to problems you have been struggling with.",
            options = listOf("A) make up for", "B) get away from", "C) fight back against", "D) look up to", "E) come up with"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 183,
            questionText = "(2018 İlkbahar / Soru 7)\nA number of studies have concluded that a given level of carbon dioxide in the atmosphere ---- less warming than previously ----.",
            options = listOf("A) is producing / to think", "B) has produced / thinking", "C) produces / thought", "D) has been producing / having thought", "E) had produced / being thought"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 184,
            questionText = "(2018 İlkbahar / Soru 8)\nAnyone who ---- unusual reactions to antihistamines (medicines that relieve or prevent the symptoms of some kinds of allergy) in the recent past ---- his or her physician know before taking the drugs again.",
            options = listOf("A) used to have / might let", "B) had had / must have let", "C) was having / could let", "D) has had / should let", "E) had / might have let"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 185,
            questionText = "(2018 İlkbahar / Soru 9)\nBy 2.5 million years ago, when they began ---- stone tools, early humans had understood that they ---- the natural world to their own advantage.",
            options = listOf("A) to have made / had to alter", "B) to make / used to alter", "C) making / could alter", "D) having made / should have altered", "E) to have been making / must have altered"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 186,
            questionText = "(2018 İlkbahar / Soru 10)\nDramatists and scriptwriters could place their characters ---- the centre of a terrifying human conflict, and may allow us to watch these characters suffer the pains of avoiding a collision ---- the conflict.",
            options = listOf("A) on / for", "B) over / in", "C) at / with", "D) to / about", "E) by / from"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 187,
            questionText = "(2018 İlkbahar / Soru 11)\n---- the problems of obesity and disordered eating growing around the world, public health professionals have focused research efforts on identifying potential causes and treatments ---- these related problems. About / in",
            options = listOf("A) On / towards", "B) With / for", "C) Through / from", "D) Among / at", "E) A) B) C)"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 188,
            questionText = "(2018 İlkbahar / Soru 12)\n---- there is no consensus among folklorists on how to define folklore nor how to explain the issues of the meaning and the function of it, folklore generally refers to cultural expressions, such as narratives, music, dance, beliefs and festivals.",
            options = listOf("A) Once", "B) While", "C) Until", "D) As", "E) In case"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 189,
            questionText = "(2018 İlkbahar / Soru 13)\nIndustrial nations consume nearly 75 to 80 percent of the fossil fuels burned each year; ----, they are responsible for the majority of greenhouse gas emissions.",
            options = listOf("A) instead", "B) on the contrary", "C) as a result", "D) for example", "E) however"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 190,
            questionText = "(2018 İlkbahar / Soru 14)\nBuildings such as the Hagia Sophia in Istanbul, Turkey date back to the sixth century and yet are still standing ---- they are located in earthquake-prone areas. as long as",
            options = listOf("A) unless", "B) as if", "C) although", "D) since", "E) A) B) C)"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 191,
            questionText = "(2018 İlkbahar / Soru 15)\nIn statistics, ---- the standard deviation allows us to see how much individuals vary within a sample, ---- the standard error allows us to estimate how much samples will vary within a population.",
            options = listOf("A) whether / or", "B) no sooner / than", "C) rather / than", "D) hardly / when", "E) just as / so"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 192,
            questionText = "(2018 İlkbahar / Soru 16)\nThe idea of the Internet was initially to provide redundancy of communications ---- a catastrophic event like a nuclear blast, which might destroy a single connection or computer but not the entire network.",
            options = listOf("A) such as", "B) on behalf of", "C) in terms of", "D) in addition to", "E) in case of"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2018 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 193,
            questionText = "(2019 Sonbahar / Soru 1)\nResearch has found that the typical brain is a ‘mosaic’ combining some features that are more common in males and some that appear more frequently in females, pointing to the ---- that human brains do not belong to two distinct types categorised by gender.",
            options = listOf("A) violation", "B) conclusion", "C) development", "D) compulsion", "E) obstacle"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 194,
            questionText = "(2019 Sonbahar / Soru 2)\nMany scientists and research advocates contend that animal experiments are crucial for learning about basic biology and disease mechanisms, and are necessary for testing the ---- of new medicines.",
            options = listOf("A) scarcity", "B) urgency", "C) ambiguity", "D) efficacy", "E) uniformity"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 195,
            questionText = "(2019 Sonbahar / Soru 3)\nBecause the functions and disturbances of smell and taste are nearly ----, disturbances of one affect the other. inconvenient",
            options = listOf("A) unremarkable", "B) inexplicable", "C) unsophisticated", "D) inseparable", "E) A) B) C)"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 196,
            questionText = "(2019 Sonbahar / Soru 4)\nMaps of the ocean are rare as the vastness and depth of the ocean make it ---- difficult to study.",
            options = listOf("A) admirably", "B) notoriously", "C) questionably", "D) properly", "E) incidentally"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 197,
            questionText = "(2019 Sonbahar / Soru 5)\nChildren with autism spectrum conditions often have trouble ---- the emotional states of people around them, struggling to distinguish a happy face from a sad one, for example.",
            options = listOf("A) overcoming", "B) ignoring", "C) provoking", "D) identifying", "E) improving"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 198,
            questionText = "(2019 Sonbahar / Soru 6)\nHuman accomplishments ---- our ability to acquire knowledge from others and to use that communal store of experience to devise novel solutions to life’s challenges .",
            options = listOf("A) call off", "B) stem from", "C) bring down", "D) take out", "E) figure out"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 199,
            questionText = "(2019 Sonbahar / Soru 7)\nFor the first time, doctors ---- that temporarily opening the protective barrier of the human brain ---- to boost the delivery of cancer medication to brain tumours.",
            options = listOf("A) are showing / helped", "B) have shown / helps", "C) showed / is helping", "D) will have shown / was helping", "E) will be showing / has been helping"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 200,
            questionText = "(2019 Sonbahar / Soru 8)\nThe Martian atmosphere is so thin, and the planet’s temperature so low that liquid water ---- there, and if it ever did in the past, conditions ---- very different.",
            options = listOf("A) might not have existed / were to be", "B) could not exist / may be", "C) would not exist / can be", "D) cannot exist / must have been", "E) must not exist / should have been"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 201,
            questionText = "(2019 Sonbahar / Soru 9)\nA tsunami damaged emergency generators that ---- power to keep the nuclear reactors at Fukushima in Japan cool; however, the earthquake ---- to the tsunami also caused the cooling systems to fail.",
            options = listOf("A) should provide / to lead", "B) could have provided / to have led", "C) would have provided / leading", "D) must have provided / having led", "E) might provide / led"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 202,
            questionText = "(2019 Sonbahar / Soru 10)\n---- the 17th century, committed Anglicans produced a steady flow of religious and devotional literature that aimed to inspire holiness ---- readers.",
            options = listOf("A) By / about", "B) During / through", "C) Throughout / among", "D) From / against", "E) Across / over"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 203,
            questionText = "(2019 Sonbahar / Soru 11)\nThe word adolescence is Latin ---- origin, derived from the verb adolescere, which means ‘to grow ---- adulthood’.",
            options = listOf("A) through / on", "B) from / to", "C) at / beyond", "D) in / into", "E) with / over"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 204,
            questionText = "(2019 Sonbahar / Soru 12)\n---- immigrants to North America's new colonies were primarily British in the 17th and 18th centuries, significant numbers of people of other nationalities also established a presence in the Americas.",
            options = listOf("A) Because", "B) While", "C) As long as", "D) Provided that", "E) Once"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 205,
            questionText = "(2019 Sonbahar / Soru 13)\nNot much had been accomplished with the phenomena of magnetism and static ---- the Chinese began to use the magnetic compass for navigation around 1000 AD.",
            options = listOf("A) in case", "B) while", "C) until", "D) if", "E) as soon as"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 206,
            questionText = "(2019 Sonbahar / Soru 14)\nLiquid water covers more than two-thirds of the Blue Planet's surface, ---- exactly how it got there has always been puzzling.",
            options = listOf("A) so", "B) instead", "C) but", "D) otherwise", "E) as"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 207,
            questionText = "(2019 Sonbahar / Soru 15)\nPersonality is ---- a crucial aspect of psychology ---- every main branch of psychological research has attempted to contribute to the existing knowledge in this area.",
            options = listOf("A) such / that", "B) whether / or", "C) as much / as", "D) the more / the more", "E) neither / nor"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 208,
            questionText = "(2019 Sonbahar / Soru 16)\nHaving a geopolitical significance ---- its unique aspect of dividing two continents, the Bosphorus stands among distinguished landmarks of Istanbul.",
            options = listOf("A) similar to", "B) thanks to", "C) in place of", "D) in spite of", "E) contrary to"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 209,
            questionText = "(2019 İlkbahar / Soru 1)\nLike the rest of the animal kingdom, mammals need food for energy and the ---- of bodily processes such as growth and reproduction.",
            options = listOf("A) suspension", "B) deterioration", "C) maintenance", "D) elaboration", "E) persistence"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 210,
            questionText = "(2019 İlkbahar / Soru 2)\nWith rapid advancements in technology, there are new ----, already seen in countries such as Myanmar and Sri Lanka where social media apps have been instrumental in spreading fake news and violence.",
            options = listOf("A) measures", "B) adjustments", "C) incentives", "D) threats", "E) obligations"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 211,
            questionText = "(2019 İlkbahar / Soru 3)\nAlthough empirical studies into the brain’s left and right hemispheric participation in language acquisition are ---- and differ from each other, some observational studies indicate that adults might benefit from right-brain-oriented activities in the foreign language classroom.",
            options = listOf("A) unavailable", "B) indispensible", "C) indestructible", "D) inconclusive", "E) unprecedented"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 212,
            questionText = "(2019 İlkbahar / Soru 4)\nThe foundations of international law as it is understood today lie ---- in the development of Western culture and political organisation.",
            options = listOf("A) eligibly", "B) instantly", "C) adequately", "D) firmly", "E) convertibly"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 213,
            questionText = "(2019 İlkbahar / Soru 5)\nThere is a link between sunlight and the chemical serotonin, which ---- our mood and is important in reducing anxiety disorders.",
            options = listOf("A) initiates", "B) detects", "C) reveals", "D) hinders", "E) boosts"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 214,
            questionText = "(2019 İlkbahar / Soru 6)\nParkinson’s disease is a movement disorder that ---- the death of neurons producing dopamine, a neurochemical that dispatches messages to parts of the brain that control motor skills and coordination.",
            options = listOf("A) takes over", "B) stems from", "C) makes up", "D) pins down", "E) gets through"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 215,
            questionText = "(2019 İlkbahar / Soru 7)\nIn its early stage of development, ecotourism ---- as a completely new concept; however, today, it ---- a significant portion of the tourism industry in general.",
            options = listOf("A) was going to be regarded / is becoming", "B) had been regarded / will become", "C) was being regarded / is going to become", "D) was regarded / has become", "E) has been regarded / becomes"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 216,
            questionText = "(2019 İlkbahar / Soru 8)\nAs two-thirds of homes in the US owned radio receivers by the end of the 1920s, people no longer ---- to a concert, play, or sporting event to be entertained; instead, they ---- many forms of entertainment from the comfort of their homes.",
            options = listOf("A) should have gone / must have enjoyed", "B) may go / were able to enjoy", "C) used to go / may have enjoyed", "D) had to go / could enjoy", "E) would go / ought to have enjoyed"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 217,
            questionText = "(2019 İlkbahar / Soru 9)\nHumanity’s extraordinary success ---- due to our ingenuity in devising cultural means ---- our physical limitations.",
            options = listOf("A) has been / to overcome", "B) was / having overcome", "C) had been / overcoming", "D) is / overcome", "E) will be / to have overcome"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 218,
            questionText = "(2019 İlkbahar / Soru 10)\nThe geographical spread of English is unique ---- the languages of the world, and it is an official language in about 50 countries, where it is used in addition to the indigenous first languages ---- a variety of public and personal functions.",
            options = listOf("A) from / at", "B) to / on", "C) through / with", "D) among / for", "E) about / in"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 219,
            questionText = "(2019 İlkbahar / Soru 11)\nWeather is defined as the state of the atmosphere ---- a given location and ---- a relatively short period of time.",
            options = listOf("A) along / on", "B) towards / in", "C) at / over", "D) from / against", "E) for / about"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 220,
            questionText = "(2019 İlkbahar / Soru 12)\nRenaissance art evolved from a common set of principles, ---- it took many directions and changed considerably in the following centuries.",
            options = listOf("A) instead", "B) provided that", "C) but", "D) for", "E) so"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 221,
            questionText = "(2019 İlkbahar / Soru 13)\n---- palaeontologists still like to argue about what role the asteroid played in the dinosaur extinction, there really is not much of a mystery left.",
            options = listOf("A) Once", "B) In case", "C) Given that", "D) Although", "E) As"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 222,
            questionText = "(2019 İlkbahar / Soru 14)\nTo psychology professionals, the name Anne Anastasi is synonymous with psychometrics, ---- it was she who pioneered understanding how psychological traits are influenced, developed, and measured.",
            options = listOf("A) so", "B) even if", "C) while", "D) yet", "E) as"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 223,
            questionText = "(2019 İlkbahar / Soru 15)\nMusic is a very small word to encompass something that takes ---- many forms ---- there are cultural and subcultural identities.",
            options = listOf("A) either / or", "B) both / and", "C) as / as", "D) such / that", "E) not only / but also"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 224,
            questionText = "(2019 İlkbahar / Soru 16)\nAlthough genetically modified seed is more expensive than conventional equivalents, the extra cost can be seen as an insurance policy against crop losses ---- weeds or pests.",
            options = listOf("A) contrary to", "B) due to", "C) in terms of", "D) despite", "E) along with"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2019 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 225,
            questionText = "(2020 Sonbahar / Soru 1)\nTwenty-fiv e hundred years ago, ancient Greek philosophers turned their highly  sophisticated ---- away from the whims of the gods  and toward questions of the natural  world.",
            options = listOf("A) inquiries", "B) fallacies", "C) incentives", "D) complaints", "E) precautions"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 226,
            questionText = "(2020 Sonbahar / Soru 2)\nThe mis sion control experts ca nnot tell if the space junk  is going to hit the space station or not, but they are sure that a ---- would knock a hole in the body and cause all air i nsid e it to qui ckl y escape into space.",
            options = listOf("A) succession", "B) collision", "C) conversion", "D) fluctuation", "E) deviation"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 227,
            questionText = "(2020 Sonbahar / Soru 3)\nWhile newspapers have been in dra matic decli ne in muc h of the developed West, the indus try is ---- and stil l grow ing i n many of Asia’s booming c ities.",
            options = listOf("A) fragile", "B) profitable", "C) confidential", "D) peculiar", "E) notorious"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 228,
            questionText = "(2020 Sonbahar / Soru 4)\nAs the DNA of two unrelated people only differs b y about one in every 1,000 base pairs, hu mans show ---- little genetic div ersi ty.",
            options = listOf("A) remarkably", "B) elaborately", "C) ambiguously", "D) sufficiently", "E) promptly"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 229,
            questionText = "(2020 Sonbahar / Soru 5)\nBiolog ists  have created a molecul e that ---- the connections between brain cells , called neurons, acting exactly lik e the steel bars in reinforce d concrete.",
            options = listOf("A) penetrates", "B) overcomes", "C) implements", "D) fortifies", "E) receives"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 230,
            questionText = "(2020 Sonbahar / Soru 6)\nInternet us ers are increasingly ---- cyberchond ria, a mental condition in which easy access to inform ation on medical iss ues causes increased feelings  of anxiety over health.",
            options = listOf("A) making up for", "B) cutting down on", "C) getting away with", "D) looking around for", "E) coming down with"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 231,
            questionText = "(2020 Sonbahar / Soru 7)\nSo far, only two types of mental exertion ---- to improve overall cognitive a bility : one is mus ical traini ng, the other is  learning a new language or practisin g a second one you ----.",
            options = listOf("A) were shown / will have already learned", "B) had been shown / have already been learning", "C) have been shown / have already learned", "D) will be shown / already learned", "E) are shown / had already learned"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 232,
            questionText = "(2020 Sonbahar / Soru 8)\nIf an age could ever be rightly  describe d as ‘d ark’ in European history , it ---- the two centurie s that ---- the collapse of Roman authority in Brita in at the beginning of the fifth  century.",
            options = listOf("A) may be / follow", "B) would be / followed", "C) used to be / had followed", "D) must be / have followed", "E) had to be / were following"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 233,
            questionText = "(2020 Sonbahar / Soru 9)\nWall paintings previous ly ---- in three Spanish caves have now been dated to 65,000 years ago – some 20,000 years before Hom o sapiens is thought ---- in Europe.",
            options = listOf("A) to have been discovered / to arrive", "B) being discovered / having arrived", "C) discovered / to have arrived", "D) having been discovered / to be arriving", "E) to be discovered / arriving"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 234,
            questionText = "(2020 Sonbahar / Soru 10)\nA compound called ‘hyloins’ that can be found in the frog's  lymph and skin gl ands increases the frog' s brig htness ---- around  20 percent ---- a full moon.",
            options = listOf("A) by / during", "B) in / under", "C) at / over", "D) to / along", "E) from / through"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 235,
            questionText = "(2020 Sonbahar / Soru 11)\nThe scientific s tudy of the dynamic  relationship ---- the celestial bodies of the solar system and the motion of human-made objects ---- outer space, suc h as spacecraft and satelli tes, is called orbital mechanics .",
            options = listOf("A) about / on", "B) between / at", "C) with / of", "D) among / in", "E) beyond / without"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 236,
            questionText = "(2020 Sonbahar / Soru 12)\n---- electric ity and heat account for 41 percent of global carbon diox ide emiss ions today, curbing cli mate change will  requi re satisfy ing that muc h demand with renewables rather than fossil  fuel s.",
            options = listOf("A) Since", "B) While", "C) Until", "D) Unless", "E) As if"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 237,
            questionText = "(2020 Sonbahar / Soru 13)\n---- all dog s show signs  of having ‘theory of mind’, which enables them to gras p that we think diffe rently from them, it is unlike ly that they are capable of extending this  to knowing the reason why one person behaves differe ntly to another.",
            options = listOf("A) In case", "B) Only if", "C) As far as", "D) Given that", "E) Even though"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 238,
            questionText = "(2020 Sonbahar / Soru 14)\n---- there are hundreds  of school- and community-based aggre ssi on prevention and social skills  promotion programm es, only a handfu l of these appear to be effecti ve.",
            options = listOf("A) Provided that", "B) Since", "C) Although", "D) Just as", "E) Unless"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 239,
            questionText = "(2020 Sonbahar / Soru 15)\nFinding ammonia on the surface  of Pluto could be a hint of more complex organic  chemistry on the planet, although i t is ---- cold ---- there is almost defi nitely no life there.",
            options = listOf("A) not only / but also", "B) both / and", "C) neither / nor", "D) such / that", "E) so / that"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 240,
            questionText = "(2020 Sonbahar / Soru 16)\n---- the Sun’s c onstant stream of energy, water molecules are continually evaporating from  the surfa ces of oceans and lakes, adding to the water vapour in the air.",
            options = listOf("A) Rather than", "B) Thanks to", "C) As opposed to", "D) In terms of", "E) Unlike"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2020 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 241,
            questionText = "(2021 Sonbahar / Soru 1)\nAttaining ---- in the current job is a basic career strategy, given that organisations make promotion decisions, at least in part, on an employee’s present performance.",
            options = listOf("A) assurance", "B) competence", "C) balance", "D) recession", "E) insurance"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 242,
            questionText = "(2021 Sonbahar / Soru 2)\nDespite its being a remote and harsh environment, there is ---- about ownership of the North Pole as there could be rich natural resources beneath the ice.",
            options = listOf("A) discrimination", "B) substitution", "C) exposure", "D) controversy", "E) neglect"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 243,
            questionText = "(2021 Sonbahar / Soru 3)\nThe reasons for an urban climate are heat storage, trapping of radiation, increasing roughness and less evaporation, which are seen in cities worldwide but are most ---- in densely built-up megacities.",
            options = listOf("A) evident", "B) arbitrary", "C) convenient", "D) constructive", "E) mediocre"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 244,
            questionText = "(2021 Sonbahar / Soru 4)\nThe population of koalas dropped ---- during the early part of the 20th century because they were over-hunted for their fur.",
            options = listOf("A) strictly", "B) drastically", "C) cautiously", "D) ardently", "E) merely"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 245,
            questionText = "(2021 Sonbahar / Soru 5)\nWhen neurological issues like aphasia and dyslexia arise, they often ---- themselves in the things we say and how we say them.",
            options = listOf("A) alienate", "B) improve", "C) manifest", "D) diminish", "E) receive"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 246,
            questionText = "(2021 Sonbahar / Soru 6)\nWhen you cook meat, a chemical reaction turns creatine into a group of compounds called heterocyclic amines and there is some evidence that these compounds ---- cancer in high concentrations.",
            options = listOf("A) rely on", "B) break into", "C) pass for", "D) call off", "E) lead to"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 247,
            questionText = "(2021 Sonbahar / Soru 7)\nRecently, nutritional scientists ---- strong evidence that the eating, drinking, and exercise habits of the Mediterranean people ---- a major role in their low risk for heart disease.",
            options = listOf("A) uncover / are playing", "B) are uncovering / had been playing", "C) have uncovered / play", "D) may uncover / have played", "E) uncovered / had played"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 248,
            questionText = "(2021 Sonbahar / Soru 8)\nThere are some people who ---- objects from 6 metres away with the same sharpness that a normal-sighted person ---- in to 4.5 metres to achieve.",
            options = listOf("A) may view / had to move", "B) must view / could move", "C) can view / would have to move", "D) ought to view / should have moved", "E) might view / can move"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 249,
            questionText = "(2021 Sonbahar / Soru 9)\nWhile  many people welcome the chance ---- exotic foods or novel flavours, others do not even consider ---- foods beyond their usual repertoire.",
            options = listOf("A) to be tasting / having consumed", "B) tasting / to have consumed", "C) to have tasted / to be consuming", "D) having tasted / to consume", "E) to taste / consuming"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 250,
            questionText = "(2021 Sonbahar / Soru 10)\nPeople intuitively tend to equate happiness ---- freedom, however without obstacles ---- our desires it is harder to know what we really want, let alone fulfilling them.",
            options = listOf("A) between / on", "B) with / to", "C) at / into", "D) in / among", "E) for / from"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 251,
            questionText = "(2021 Sonbahar / Soru 11)\nPeople who feel strongly that they do not want to be awake and alert ---- certain procedures may not be good candidates ---- local or regional anaesthesia.",
            options = listOf("A) through / at", "B) by / with", "C) during / for", "D) upon / to", "E) against / about"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 252,
            questionText = "(2021 Sonbahar / Soru 12)\n---- social media has become widely integrated into everyday life, there is a growing interest in understanding its impact and the norms of online conduct.",
            options = listOf("A) Supposing that", "B) Although", "C) Now that", "D) As much as", "E) While"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 253,
            questionText = "(2021 Sonbahar / Soru 13)\nFor many years, social researchers regarded gossip as unworthy of scientific investigation; ----, sociologists have recently begun to recognise gossip as an important feature of social life.",
            options = listOf("A) accordingly", "B) in other words", "C) however", "D) as a result", "E) for example"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 254,
            questionText = "(2021 Sonbahar / Soru 14)\nIn diabetic patients, even though food intake may be increased, weight loss can occur ---- muscles and fat stores may shrink as they are not getting the necessary glucose.",
            options = listOf("A) because", "B) given that", "C) as long as", "D) although", "E) in case"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 255,
            questionText = "(2021 Sonbahar / Soru 15)\n---- you are a long-time fan ---- casual follower of the series of Street Fighter, you are already well-aware that it is constantly updated with new characters, costumes, and story content.",
            options = listOf("A) Both / and", "B) Neither / nor", "C) Rather / than", "D) Whether / or", "E) Not only / but also"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 256,
            questionText = "(2021 Sonbahar / Soru 16)\n---- many individual cases of malicious data leaks online that have caught the public eye, there has been very little research examining the scale of the problem.",
            options = listOf("A) Similar to", "B) Due to", "C) As a result of", "D) In accordance with", "E) Despite"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 Sonbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 257,
            questionText = "(2021 İlkbahar / Soru 1)\nThis  test consis ts of 80 question s. The most pow erful ---- to parachuti ng is  fear, but one should a lso take its  hig h cost in to account, as a total  outfit  for parachuting can be extremely expensive.",
            options = listOf("A) resemblance", "B) adjustment", "C) deterrent", "D) submission", "E) adherence"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 258,
            questionText = "(2021 İlkbahar / Soru 2)\nPeanut m ay very well be the most com mon food allergy in some populati ons, but th e ---- of a partic ular food allergy varies accordi ng to age and group.",
            options = listOf("A) utilisation", "B) withdrawal", "C) precaution", "D) termination", "E) prevalence"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 259,
            questionText = "(2021 İlkbahar / Soru 3)\nHeating and cooling of the Earth are not ----, as it takes time  for land, water, and air to eith er absorb heat and warm up or release stored heat and cool down.",
            options = listOf("A) hospitable", "B) convertible", "C) instantaneous", "D) detrimental", "E) preliminary"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 260,
            questionText = "(2021 İlkbahar / Soru 4)\nSince the mid-20th c entury, plastic  pollu tion has increased ----, and resultin g pol lution  has become a glob al environmental iss ue.",
            options = listOf("A) exponentially", "B) conveniently", "C) alternatively", "D) precisely", "E) fruitfully"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 261,
            questionText = "(2021 İlkbahar / Soru 5)\nThe most basic  path  to compu ter lite racy is to ---- competence in usi ng compu ters to  perform personal or vocational tas ks.",
            options = listOf("A) exclude", "B) relieve", "C) deteriorate", "D) restrict", "E) attain"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 262,
            questionText = "(2021 İlkbahar / Soru 6)\nMaking video s should  be a lot of fu n, but it can also be a bit of a minefield, as lots of people ---- proble ms and lose momentum before they even get started.",
            options = listOf("A) hand over", "B) look for", "C) turn down", "D) give up", "E) run into"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Kelime Bilgisi"
        ),
        Question(
            id = 263,
            questionText = "(2021 İlkbahar / Soru 7)\nA semi nal study  ---- that people  who ---- less than seven hours a night a re at increased ris k of mortality .",
            options = listOf("A) revealed / will sleep", "B) has revealed / sleep", "C) reveals / will be sleeping", "D) will reveal / have slept", "E) had revealed / had been sleeping"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 264,
            questionText = "(2021 İlkbahar / Soru 8)\nIdeally, the end  of the  Cold War between the United States and the  Soviet Union ---- a sub stantial lessening of security  concerns in the world; however, in practice , the focus ---- to terroris m and sub national groups .",
            options = listOf("A) might have signified / will have moved", "B) would have signified / used to move", "C) must have signified / had moved", "D) could have signified / had been moving", "E) should have signified / moved"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 265,
            questionText = "(2021 İlkbahar / Soru 9)\nThe recent discov ery of a toe made  of wood and leather ---- to th e mumm ified  body of an Egyptia n noblewoman in Cairo, approximately 3,000 years old, ---- that artificia l li mbs  are nothin g new.",
            options = listOf("A) attached / proves", "B) being attached / had proven", "C) attach / has proven", "D) attaching / proved", "E) to be attached / used to prove"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Dil Bilgisi"
        ),
        Question(
            id = 266,
            questionText = "(2021 İlkbahar / Soru 10)\nAnorexia nervosa is a severe eating dis order, usu ally involving excessive weigh t los s ---- self-sta rvation, most ofte n found ---- teenage girls .",
            options = listOf("A) at / with", "B) from / of", "C) for / between", "D) by / on", "E) through / among"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 267,
            questionText = "(2021 İlkbahar / Soru 11)\nWith co ncerns ---- th e rate of energy demand, the role of renewable energy, which  is generated ---- sources that are natural ly replenished, such as wind and sunlight,  is becoming inc reasingl y sig nific ant.",
            options = listOf("A) at / upon", "B) in / for", "C) to / through", "D) about / from", "E) over / into"),
            correctOptionIndex = 3,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap D seçeneğidir.",
            category = "Edatlar"
        ),
        Question(
            id = 268,
            questionText = "(2021 İlkbahar / Soru 12)\n---- certain types of fungi ha ve been used throughout his tory for a variety of beneficia l pu rposes, others have been found  to contain dangerous to xins that are pois onous to humans.",
            options = listOf("A) Once", "B) Although", "C) Since", "D) Provided that", "E) Only when"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 269,
            questionText = "(2021 İlkbahar / Soru 13)\n---- such an intima te connection  existe d between agric ultura l inte nsifica tion and th e appearance of citi es, it is  not surpris ing th at the  earlies t eviden ce for ci ties  comes from regions  with ancient agric ultura l tradi tions .",
            options = listOf("A) Because", "B) As if", "C) Before", "D) Although", "E) While"),
            correctOptionIndex = 0,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap A seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 270,
            questionText = "(2021 İlkbahar / Soru 14)\n---- children  can be easy targets for e xploitati on and victimiz ation, supervisio n is a necessary component of any Internet safety.",
            options = listOf("A) Even if", "B) Although", "C) Since", "D) Before", "E) Unless"),
            correctOptionIndex = 2,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap C seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 271,
            questionText = "(2021 İlkbahar / Soru 15)\nThe conventional view of dinosaur origins hol ds th at they were endowed with --- - superior s peed, agili ty, metabol ism  and intellige nce ---- as soon as they debuted they qui ckl y spread across the  globe.",
            options = listOf("A) either / or", "B) both / and", "C) the more / the more", "D) whether / or", "E) such / that"),
            correctOptionIndex = 4,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap E seçeneğidir.",
            category = "Bağlaçlar"
        ),
        Question(
            id = 272,
            questionText = "(2021 İlkbahar / Soru 16)\nBooks conti nue to be a major medium for communicating s cholarly works in the fi eld of his tory, ---- many other social sciences, where journal article s are far more importa nt.",
            options = listOf("A) with the help of", "B) in contrast to", "C) due to", "D) such as", "E) on the basis of"),
            correctOptionIndex = 1,
            explanation = "Bu soru 2021 İlkbahar YDS sınavında çıkmıştır. Doğru cevap B seçeneğidir.",
            category = "Bağlaçlar"
        )
    )
}
