package com.example.viewpager2testwithlivedata.ui.main

import Step4Fragment
import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2testwithlivedata.R

private val FRAGMENTS = arrayOf(
        Step1Fragment(), Step2Fragment(), Step3Fragment(), Step4Fragment(),
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(activity: FragmentActivity)
    : FragmentStateAdapter(activity) {


    override fun getItemCount(): Int = FRAGMENTS.size

    override fun createFragment(position: Int): Fragment {
        return FRAGMENTS[position]
    }
}