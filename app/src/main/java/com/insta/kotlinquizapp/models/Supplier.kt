package com.insta.kotlinquizapp.models

object Supplier {
    val questions = listOf<Question>(
        Question("What is the capital of Chile?", "Santiago", "Nigeria", "Alberta", "New York", "a"),
        Question(" What is the highest mountain in Britain?", "Ben Nevis", "Kilimanjaro", "Everest", "kumbi", "a"),
        Question("What is the smallest country in the world?", "Vatican City", "Kenya", "Djbouti", "Senegal", "a"),
        Question("Alberta is a province of which country?", "Canada", "Us", "Uk", "Nigeria", "a"),
        Question("What Is Your Wife's Name", "Adebayo", "Segun", "Dewunmi", "Sunday", "a")
    )

    const val NUM_PAGES = 5

}