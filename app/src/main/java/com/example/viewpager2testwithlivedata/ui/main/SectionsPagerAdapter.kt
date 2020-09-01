package com.example.viewpager2testwithlivedata.ui.main

import Step4Fragment
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2testwithlivedata.R
import java.lang.Exception

/*
private val FRAGMENTS = arrayOf(
        Step1Fragment(), Step2Fragment(), Step3Fragment(), Step4Fragment(),
)

 */

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(activity: FragmentActivity)
    : FragmentStateAdapter(activity) {


    override fun getItemCount(): Int = 4
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0-> Step1Fragment()
            1-> Step2Fragment()
            2-> Step3Fragment()
            3-> Step4Fragment()
            else -> throw Exception()
        }
    }
}