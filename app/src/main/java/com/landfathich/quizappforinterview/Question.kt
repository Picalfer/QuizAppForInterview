package com.landfathich.quizappforinterview

data class Question(
    val id: Int,
    val question: String,
    val imageOne: Int,
    val imageTwo: Int,
    val imageThree: Int,
    val correctImage: Int,
)