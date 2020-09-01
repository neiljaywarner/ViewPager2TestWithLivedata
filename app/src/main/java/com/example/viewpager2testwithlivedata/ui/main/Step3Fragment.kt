package com.example.viewpager2testwithlivedata.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2testwithlivedata.R
import org.koin.android.viewmodel.ext.android.viewModel

class Step3Fragment : Fragment() {

    companion object {
        fun newInstance() = Step3Fragment()
    }

    val viewModel: Step3ViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.step3_fragment, container, false)
    }

}