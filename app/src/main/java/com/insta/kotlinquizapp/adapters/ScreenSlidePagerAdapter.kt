package com.insta.kotlinquizapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.insta.kotlinquizapp.QuestionPageFragment
import com.insta.kotlinquizapp.models.Supplier.NUM_PAGES

class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = NUM_PAGES
    override fun createFragment(position: Int): Fragment = QuestionPageFragment(position)
}