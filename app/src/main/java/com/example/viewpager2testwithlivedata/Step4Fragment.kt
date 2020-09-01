import com.example.viewpager2testwithlivedata.Step4ViewModel

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2testwithlivedata.databinding.Step4FragmentBinding
import com.example.viewpager2testwithlivedata.ui.main.Step3ViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class Step4Fragment : Fragment() {

    companion object {
        fun newInstance() = Step4Fragment()
    }

    val viewModel: Step4ViewModel by viewModel()

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

        binding.apply {
            viewModel = this@Step4Fragment.viewModel
            lifecycleOwner = viewLifecycleOwner
            viewModel?.data?.observe(viewLifecycleOwner) {
                Log.e("NJW", "value of data changed to $it")
            }
        }
    }



}