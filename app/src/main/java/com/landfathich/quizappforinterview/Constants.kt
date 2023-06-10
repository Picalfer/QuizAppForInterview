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

        //5
        val que5 = Question(
            5,
            "Она еще не сдалась, но уже не боролась.",
            R.drawable.prejde_chem,
            R.drawable.lissabon,
            R.drawable.voina_i_mir,
            2
        )
        questionList.add(que5)

        //6
        val que6 = Question(
            6,
            "— Я люблю тебя. И я не собираюсь говорить, что я не могу жить без тебя. Я могу жить без тебя, но я этого не хочу.",
            R.drawable.portre_doriana,
            R.drawable.hodyat_sluhi,
            R.drawable.lissabon,
            2
        )
        questionList.add(que6)

        //7
        val que7 = Question(
            7,
            "Что хочешь помнить, то всегда помнишь.",
            R.drawable.vino,
            R.drawable.voina_i_mir,
            R.drawable.hodyat_sluhi,
            1
        )
        questionList.add(que7)

        //8
        val que8 = Question(
            8,
            "Человек умирает тогда, когда умирает последнее воспоминание о нем.",
            R.drawable.portre_doriana,
            R.drawable.orden_feniks,
            R.drawable.vino,
            2
        )
        questionList.add(que8)

        //9
        val que9 = Question(
            9,
            "Что бы ни случилось, нужно помнить — это всего лишь жизнь, и мы прорвемся!",
            R.drawable.orden_feniks,
            R.drawable.lissabon,
            R.drawable.temnie_reki,
            3
        )
        questionList.add(que9)

        //10
        val que10 = Question(
            10,
            "Немного здравого смысла, немного терпимости, немного чувства юмора, и можно очень уютно устроиться на этой планете…",
            R.drawable.maktub,
            R.drawable.hodyat_sluhi,
            R.drawable.moem,
            3
        )
        questionList.add(que10)

        return questionList
    }
}