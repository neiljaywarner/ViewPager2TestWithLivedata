package com.example.viewpager2testwithlivedata

import androidx.lifecycle.MutableLiveData

object MyService {
    val data : MutableLiveData<String> = MutableLiveData("Initial value from singleton instantiation")
}