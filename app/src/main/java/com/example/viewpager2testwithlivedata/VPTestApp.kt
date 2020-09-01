package com.example.viewpager2testwithlivedata

import android.app.Application
import android.util.Log
import com.example.viewpager2testwithlivedata.ui.main.Step1ViewModel
import com.example.viewpager2testwithlivedata.ui.main.Step2ViewModel
import com.example.viewpager2testwithlivedata.ui.main.Step3ViewModel
import com.example.viewpager2testwithlivedata.ui.main.ui.main.MainViewModel
import com.example.viewpager2testwithlivedata.ui.main.ui.main.WizardParentFragment
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class VPTestApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d("NJW", "app oncreate")
        startKoin {
            androidLogger()
            androidContext(this@VPTestApp)

            modules(viewModelModule)
        }
    }


}

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { Step1ViewModel() }
    viewModel { Step2ViewModel() }
    viewModel { Step3ViewModel() }
    viewModel { Step4ViewModel() }


}
