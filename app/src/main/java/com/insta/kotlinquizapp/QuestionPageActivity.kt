package com.insta.kotlinquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.insta.kotlinquizapp.adapters.ScreenSlidePagerAdapter
import com.insta.kotlinquizapp.databinding.ActivityMainBinding
import com.insta.kotlinquizapp.models.Supplier.NUM_PAGES

class QuestionPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPager = binding.pager
        val pagerAdapter = ScreenSlidePagerAdapter(this)
        viewPager.adapter = pagerAdapter
        initListeners()

    }

    private fun initListeners() {
        binding.btnNext.setOnClickListener {
            if (viewPager.currentItem == NUM_PAGES) {
                Toast.makeText(this, "Thats all", Toast.LENGTH_LONG).show();

            } else {
                viewPager.currentItem = viewPager.currentItem + 1
            }
        }

        binding.btnPrevious.setOnClickListener{
            if (viewPager.currentItem == 0) {
                Toast.makeText(this, "No More", Toast.LENGTH_LONG).show();
            } else {
                viewPager.currentItem = viewPager.currentItem - 1
            }
        }
    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }

}