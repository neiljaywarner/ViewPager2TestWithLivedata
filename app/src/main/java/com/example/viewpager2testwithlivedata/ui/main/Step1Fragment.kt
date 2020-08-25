package com.example.viewpager2testwithlivedata.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2testwithlivedata.MyService
import com.example.viewpager2testwithlivedata.R
import com.example.viewpager2testwithlivedata.Step4ViewModel
import com.example.viewpager2testwithlivedata.databinding.Step1FragmentBinding

class Step1Fragment : Fragment() {

    companion object {
        fun newInstance() = Step1Fragment()
    }

    lateinit var binding: Step1FragmentBinding
    private lateinit var viewModel: Step1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this@Step1Fragment.viewModel = ViewModelProvider(this).get(Step1ViewModel::class.java)

        binding = Step1FragmentBinding
            .inflate(inflater, container, false)
            .apply {
                lifecycleOwner = viewLifecycleOwner
                viewModel = this@Step1Fragment.viewModel

            }
        return binding.root
    }
// add koin in.


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }

    override fun onPause() {
        super.onPause()
        Log.e("NJW", "onPause step1..")
    }

}