package com.landfathich.quizappforinterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        binding.apply {
            if (resultQuestions?.get(0) == false) {
                resultQuestionIv1.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(1) == false) {
                resultQuestionIv2.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(2) == false) {
                resultQuestionIv3.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(3) == false) {
                resultQuestionIv4.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(4) == false) {
                resultQuestionIv5.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(5) == false) {
                resultQuestionIv6.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(6) == false) {
                resultQuestionIv7.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(7) == false) {
                resultQuestionIv8.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(8) == false) {
                resultQuestionIv9.setImageResource(R.drawable.wrong)
            }
            if (resultQuestions?.get(9) == false) {
                resultQuestionIv10.setImageResource(R.drawable.wrong)
            }


            tvScore.text = "Your score is $correctAnswers out of 10"
        }

    }
}