package com.example.ydsapp.data

import kotlinx.coroutines.flow.Flow
import java.util.Calendar

class FlashcardRepository(
    private val flashcardDao: FlashcardDao,
    private val ydsDao: YdsDao
) {

    fun getDueFlashcards(): Flow<List<Flashcard>> {
        val currentTime = System.currentTimeMillis()
        return flashcardDao.getDueFlashcards(currentTime)
    }

    suspend fun processReview(card: Flashcard, quality: Int) {
        var newEaseFactor = card.easeFactor + (0.1f - (5 - quality) * (0.08f + (5 - quality) * 0.02f))
        if (newEaseFactor < 1.3f) newEaseFactor = 1.3f
        
        var newInterval = card.interval
        if (quality < 3) {
            newInterval = 1
        } else {
            newInterval = if (card.interval == 0) {
                1
            } else if (card.interval == 1) {
                6
            } else {
                (card.interval * newEaseFactor).toInt()
            }
        }
        
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.DAY_OF_YEAR, newInterval)
        val nextReview = calendar.timeInMillis
        
        val updatedCard = card.copy(
            interval = newInterval,
            easeFactor = newEaseFactor,
            nextReviewDate = nextReview
        )
        flashcardDao.update(updatedCard)
    }

    suspend fun populateMockData() {
        // Prevent duplicate population using the count query
        if (ydsDao.getFlashcardsCount() > 0) return

        val now = System.currentTimeMillis()
        val mockCards = arrayOf(
            Flashcard(word = "Abundant", translation = "Bol, Bereketli", exampleSentence = "The region has abundant natural resources.", synonyms = "Plentiful, Copious", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Mitigate", translation = "Hafifletmek, Azaltmak", exampleSentence = "We need to mitigate the risks of climate change.", synonyms = "Alleviate, Reduce", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Obscure", translation = "Belirsiz, Anlaşılması güç", exampleSentence = "His origins remain obscure despite deep research.", synonyms = "Unclear, Vague", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Profound", translation = "Derin, Çok büyük", exampleSentence = "It had a profound effect on his view of life.", synonyms = "Deep, Intense", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Deteriorate", translation = "Kötüleşmek, Bozulmak", exampleSentence = "Her health began to deteriorate rapidly.", synonyms = "Worsen, Decline", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Advocate", translation = "Savunmak, Desteklemek", exampleSentence = "She advocates for green energy policies.", synonyms = "Support, Defend", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Alleviate", translation = "Hafifletmek, Dindirmek", exampleSentence = "This medicine will alleviate your headache.", synonyms = "Ease, Relieve", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Ambiguous", translation = "Belirsiz, İki anlamlı", exampleSentence = "His answer was ambiguous and confusing.", synonyms = "Vague, Equivocal", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Coherent", translation = "Uyumlu, Tutarlı", exampleSentence = "They failed to present a coherent argument.", synonyms = "Logical, Consistent", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Comply", translation = "Uymak, İtaat etmek", exampleSentence = "We must comply with safety regulations.", synonyms = "Oby, Conform", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Concession", translation = "Taviz, Ödün", exampleSentence = "Neither side was willing to make a concession.", synonyms = "Compromise, Yielding", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Deliberate", translation = "Kasıtlı, Bilerek yapılan", exampleSentence = "It was a deliberate attempt to deceive us.", synonyms = "Intentional, Planned", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Deprive", translation = "Yoksun bırakmak", exampleSentence = "Sleep deprivation can affect your health.", synonyms = "Strip, Rob", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Devastating", translation = "Yıkıcı, Tahrip edici", exampleSentence = "The hurricane had a devastating impact.", synonyms = "Destructive, Ruinous", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Emphasize", translation = "Vurgulamak", exampleSentence = "The teacher emphasized the import of grammar.", synonyms = "Highlight, Stress", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Enhance", translation = "Geliştirmek, Artırmak", exampleSentence = "Good lighting can enhance the photo quality.", synonyms = "Improve, Boost", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Evade", translation = "Kaçınmak, Kaytarmak", exampleSentence = "The suspect managed to evade the police.", synonyms = "Avoid, Elude", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Flourish", translation = "Gelişmek, Büyümek", exampleSentence = "The civilization flourished for centuries.", synonyms = "Thrive, Prosper", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Hazard", translation = "Tehlike, Risk", exampleSentence = "Ice on the roads is a serious driving hazard.", synonyms = "Danger, Peril", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Impede", translation = "Engellemek, Geciktirmek", exampleSentence = "Heavy traffic impeded our progress.", synonyms = "Hinder, Obstruct", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Indifferent", translation = "Kaytarsız, İlgisiz", exampleSentence = "He remained indifferent to their requests.", synonyms = "Apathetic, Unconcerned", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Inevitable", translation = "Kaçınılmaz", exampleSentence = "Change is an inevitable part of life.", synonyms = "Unavoidable, Certain", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Lethal", translation = "Ölümcül", exampleSentence = "These chemicals are lethal if swallowed.", synonyms = "Deadly, Fatal", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Mutual", translation = "Karşılıklı, Ortak", exampleSentence = "Our relationship is based on mutual respect.", synonyms = "Shared, Reciprocal", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Negotiate", translation = "Müzakere etmek", exampleSentence = "They are trying to negotiate a new deal.", synonyms = "Discuss, Bargain", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Novel", translation = "Yeni, Orijinal", exampleSentence = "She suggested a novel approach to the problem.", synonyms = "New, Original", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Obstacle", translation = "Engel", exampleSentence = "Lack of funding is the main obstacle.", synonyms = "Barrier, Hurdle", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Precise", translation = "Kesin, Net", exampleSentence = "We need precise measurements of the area.", synonyms = "Accurate, Exact", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Reluctant", translation = "İsteksiz, Gönülsüz", exampleSentence = "He was reluctant to share his findings.", synonyms = "Unwilling, Hesitant", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Scrutinize", translation = "Titizlikle incelemek", exampleSentence = "The auditor scrutinized the bank accounts.", synonyms = "Examine, Inspect", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Subtle", translation = "İnce, Hafif, Güç algılanan", exampleSentence = "There are subtle differences between them.", synonyms = "Delicate, Elusive", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Sustain", translation = "Sürdürmek, Devam ettirmek", exampleSentence = "We need policies that sustain economic growth.", synonyms = "Maintain, Keep", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Undergo", translation = "Geçirmek, Maruz kalmak", exampleSentence = "The country has undergone massive changes.", synonyms = "Experience, Go through", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Unprecedented", translation = "Eşi benzeri görülmemiş", exampleSentence = "This event is unprecedented in modern history.", synonyms = "Groundbreaking, New", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Vulnerable", translation = "Savunmasız, Hassas", exampleSentence = "Children are vulnerable to diseases.", synonyms = "Defenceless, Susceptible", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Hostile", translation = "Düşmanca", exampleSentence = "They were forced to leave the hostile area.", synonyms = "Unfriendly, Antagonistic", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Implement", translation = "Uygulamaya koymak", exampleSentence = "We will implement the plan next week.", synonyms = "Execute, Enforce", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Prevalent", translation = "Yaygın", exampleSentence = "Flu is highly prevalent during winter.", synonyms = "Widespread, Common", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Resilient", translation = "Dayanıklı, Esnek", exampleSentence = "She is a resilient person who recovers fast.", synonyms = "Strong, Flexible", nextReviewDate = now, interval = 0, easeFactor = 2.5f),
            Flashcard(word = "Terminate", translation = "Sonlandırmak, Bitirmek", exampleSentence = "They decided to terminate the contract.", synonyms = "End, Finish", nextReviewDate = now, interval = 0, easeFactor = 2.5f)
        )

        flashcardDao.insertAll(*mockCards)
    }
}
