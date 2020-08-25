package com.example.viewpager2testwithlivedata.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viewpager2testwithlivedata.MyService

class Step1ViewModel : BaseViewModel() {
    // TODO: Implement the ViewModel

}

open class BaseViewModel : ViewModel() {
    val data : MutableLiveData<String> = MyService.data

    val _string1 = MutableLiveData("hi")
    var string1: MutableLiveData<String>
        get() {
            Log.e("NJW", "getting: ${_string1.value}")
            return _string1
        }
        set(value) {
            Log.e("NJW", "setting:")
            _string1.value = value.value
        }



}