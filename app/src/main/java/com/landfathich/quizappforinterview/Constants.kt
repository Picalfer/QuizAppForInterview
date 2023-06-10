package com.landfathich.quizappforinterview

object Constants {

    fun getQuestions() :ArrayList<Question> {
        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,
            "Навсегда ничего не бывает.",
            R.drawable.maktub,
            R.drawable.voina_i_mir,
            R.drawable.portre_doriana,
            R.drawable.voina_i_mir
        )
        questionList.add(que1)

        return questionList
    }
}