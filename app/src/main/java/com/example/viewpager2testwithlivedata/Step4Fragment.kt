package com.example.viewpager2testwithlivedata

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2testwithlivedata.databinding.Step4FragmentBinding
import com.example.viewpager2testwithlivedata.ui.main.Step3ViewModel

class Step4Fragment : Fragment() {

    companion object {
        fun newInstance() = Step4Fragment()
    }

    private lateinit var viewModel: Step4ViewModel

    private lateinit var binding: Step4FragmentBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?) : View {
        binding = Step4FragmentBinding
                .inflate(inflater, container, false)
                .apply {


                }
        Log.e("NJW", "onCreateView-step4fragment")

        return binding.root
}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("NJW", "onViewCreated-step4fragment")
        this@Step4Fragment.viewModel = ViewModelProvider(this).get(Step4ViewModel::class.java)

        binding.apply {
            viewModel = this@Step4Fragment.viewModel
            lifecycleOwner = viewLifecycleOwner
            viewModel?.data?.observe(viewLifecycleOwner) {
                Log.e("NJW", "value of data changed to $it")
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("NJW", "-onActivityCreated-step4fragment")
        // TODO: Use the ViewModel
    }

}