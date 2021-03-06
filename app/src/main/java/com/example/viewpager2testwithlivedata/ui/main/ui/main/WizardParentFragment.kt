package com.example.viewpager2testwithlivedata.ui.main.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2testwithlivedata.R
import com.example.viewpager2testwithlivedata.ui.main.SectionsPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.koin.android.viewmodel.ext.android.viewModel

class WizardParentFragment : Fragment() {

    companion object {
        fun newInstance() = WizardParentFragment()
    }

    val viewModel: MainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.activity_main, container, false)
        val sectionsPagerAdapter = SectionsPagerAdapter(requireActivity())

        val viewPager: ViewPager2 = view.findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter

        val fab: FloatingActionButton = view.findViewById(R.id.fab)

        fab.setOnClickListener { view ->
            viewPager.currentItem++
        }
        return view
    }


}