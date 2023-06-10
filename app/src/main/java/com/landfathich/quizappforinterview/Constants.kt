package com.landfathich.quizappforinterview

object Constants {

    const val RESULT: String = "result"
    const val RIGHT_ANSWERS: String = "right_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1,
            "Навсегда ничего не бывает.",
            R.drawable.maktub,
            R.drawable.voina_i_mir,
            R.drawable.portre_doriana,
            2
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2,
            "Если ты знаешь, что человек никогда не будет твоим, то любить его можно бесконечно долго.",
            R.drawable.voina_i_mir,
            R.drawable.maktub,
            R.drawable.portre_doriana,
            3
        )
        questionList.add(que2)


        //3
        val que3 = Question(
            3,
            "Знаешь, когда мы окончательно теряем дорогих нам людей? Когда больше не ощущаем боли от их потери.",
            R.drawable.maktub,
            R.drawable.voina_i_mir,
            R.drawable.prejde_chem,
            3
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4,
            "Не имеет значения, что думают другие – поскольку они в любом случае что-нибудь подумают. Так что расслабься.",
            R.drawable.maktub,
            R.drawable.prejde_chem,
            R.drawable.portre_doriana,
            1
        )
        questionList.add(que4)

        return questionList
    }
}