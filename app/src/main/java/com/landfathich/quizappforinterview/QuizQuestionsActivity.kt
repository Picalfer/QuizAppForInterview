package com.landfathich.quizappforinterview

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.landfathich.quizappforinterview.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity : AppCompatActivity(), OnClickListener {

    private lateinit var binding: ActivityQuizQuestionsBinding

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0

    var resultQuestions: BooleanArray = BooleanArray(10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            ActivityQuizQuestionsBinding.inflate(layoutInflater).also { setContentView(it.root) }

        mQuestionsList = Constants.getQuestions()
        Log.i("Questions size", "${mQuestionsList!!.size}")

        setQuestion()

        binding.apply {
            option1.setOnClickListener(this@QuizQuestionsActivity)
            option2.setOnClickListener(this@QuizQuestionsActivity)
            option3.setOnClickListener(this@QuizQuestionsActivity)
            btnNext.setOnClickListener(this@QuizQuestionsActivity)
        }

        for (i in 0..9) {
            resultQuestions[i] = false
        }
    }

    private fun setQuestion() {
        val question = mQuestionsList!![mCurrentPosition - 1]

        defaultOptionsView()

        binding.apply {
            tvQuestion.text = question.question
            option1.setImageResource(question.imageOne)
            option2.setImageResource(question.imageTwo)
            option3.setImageResource(question.imageThree)
        }
    }

    private fun defaultOptionsView() {
        val options = ArrayList<ImageView>()
        options.add(0, binding.option1)
        options.add(1, binding.option2)
        options.add(2, binding.option3)

        for (option in options) {
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.option1 -> {
                selectedOptionView(binding.option1, 1)
            }

            R.id.option2 -> {
                selectedOptionView(binding.option2, 2)
            }

            R.id.option3 -> {
                selectedOptionView(binding.option3, 3)
            }

            R.id.btn_next -> {
                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionsList!!.size -> {
                            setQuestion()
                        }

                        else -> {
                            val intent = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.RESULT, resultQuestions)
                            intent.putExtra(Constants.RIGHT_ANSWERS, mCorrectAnswers)
                            startActivity(intent)
                            finish()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.correctImage != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        resultQuestions[mCurrentPosition - 1] = false
                    } else {
                        mCorrectAnswers++
                        resultQuestions[mCurrentPosition - 1] = true
                    }
                    answerView(question.correctImage, R.drawable.correct_option_border_bg)

                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> binding.option1.background = ContextCompat.getDrawable(this, drawableView)

            2 -> binding.option2.background = ContextCompat.getDrawable(this, drawableView)

            3 -> binding.option3.background = ContextCompat.getDrawable(this, drawableView)
        }
    }


    private fun selectedOptionView(iv: ImageView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        iv.background = ContextCompat.getDrawable(
            this,
            R.color.yellow
        )
    }
}