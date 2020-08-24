package com.example.viewpager2testwithlivedata.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.viewpager2testwithlivedata.MyService

class Step1ViewModel : BaseViewModel() {
    // TODO: Implement the ViewModel

}

open class BaseViewModel : ViewModel() {
    val data : LiveData<String> = MyService.data

}