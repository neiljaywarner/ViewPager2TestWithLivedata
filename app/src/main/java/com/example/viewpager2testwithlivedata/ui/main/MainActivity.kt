package com.example.viewpager2testwithlivedata.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2testwithlivedata.R
import com.example.viewpager2testwithlivedata.ui.main.ui.main.WizardParentFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, WizardParentFragment.newInstance())
                .commitNow()
        }
    }
}