package com.insta.kotlinquizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.insta.kotlinquizapp.databinding.FragmentQuestionPageBinding
import com.insta.kotlinquizapp.models.Question
import com.insta.kotlinquizapp.models.Supplier

class QuestionPageFragment(val position: Int) : Fragment() {

    private var binding: FragmentQuestionPageBinding? = null
    private lateinit var question: Question

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuestionPageBinding.inflate(inflater, container, false)

        question = Supplier.questions[position]

        initViews(question);

        return binding?.root
    }

    private fun initViews(question: Question) {

        binding?.apply {
            tvQuestion.text = question.currentQuestion
            tvOptionA.text = question.optionA
            tvOptionB.text = question.optionB
            tvOptionC.text = question.optionC
            tvOptionD.text = question.optionD
        }

        binding?.tvOptionA?.setOnClickListener {
            getResult("a")
        }
        binding?.tvOptionB?.setOnClickListener {
            getResult("b")
        }
        binding?.tvOptionC?.setOnClickListener {
            getResult("c")
        }
        binding?.tvOptionD?.setOnClickListener {
            getResult("d")
        }
    }

    private fun getResult(selection: String) {
        if (selection.equals(question.answer, ignoreCase = true)) {
            Toast.makeText(activity, "You Are Correct", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(activity, "You Are Wrong", Toast.LENGTH_LONG).show();
        }
    }

}