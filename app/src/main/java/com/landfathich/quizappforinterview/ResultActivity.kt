package com.landfathich.quizappforinterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.landfathich.quizappforinterview.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding
    private var resultQuestions: BooleanArray? = null
    private var correctAnswers: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater).also { setContentView(it.root) }

        resultQuestions = intent.getBooleanArrayExtra(Constants.RESULT)
        correctAnswers = intent.getIntExtra(Constants.RIGHT_ANSWERS, 0)

        retrieveResult()

        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun retrieveResult() {
            val resViews = ArrayList<ImageView>()
            resViews.add(binding.resultQuestionIv1)
            resViews.add(binding.resultQuestionIv2)
            resViews.add(binding.resultQuestionIv3)
            resViews.add(binding.resultQuestionIv4)
            resViews.add(binding.resultQuestionIv5)
            resViews.add(binding.resultQuestionIv6)
            resViews.add(binding.resultQuestionIv7)
            resViews.add(binding.resultQuestionIv8)
            resViews.add(binding.resultQuestionIv9)
            resViews.add(binding.resultQuestionIv10)

            for (i in resultQuestions!!.indices) {
                when (resultQuestions!![i]) {
                    false -> resViews[i].setImageResource(R.drawable.wrong)
                    else -> true
                }
            }

            binding.tvScore.text = "Your score is $correctAnswers out of 10"

    }
}