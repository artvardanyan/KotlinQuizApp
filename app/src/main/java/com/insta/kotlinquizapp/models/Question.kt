package com.insta.kotlinquizapp.models

data class Question(
    var currentQuestion: String,
    var optionA: String,
    var optionB: String,
    var optionC: String,
    var optionD: String,
    var answer: String
)
