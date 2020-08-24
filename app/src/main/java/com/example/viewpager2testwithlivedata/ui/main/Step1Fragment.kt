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

class Step1Fragment : Fragment() {

    companion object {
        fun newInstance() = Step1Fragment()
    }

    private lateinit var viewModel: Step1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.step1_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Step1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onPause() {
        super.onPause()
        Log.e("NJW", "onPause step1, updating data")
        MyService.data.value = "onPauserStep1"
    }

}