package com.example.navigation_component

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.data.RetrofitService
import com.example.navigation_component.databinding.FragmentExampleSecondFragmentsBinding
import kotlinx.coroutines.launch
import kotlin.math.log

class ExampleSecondFragments : Fragment() {

    private lateinit var binding: FragmentExampleSecondFragmentsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExampleSecondFragmentsBinding.inflate(layoutInflater,container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSecondFragment.setOnClickListener {
            findNavController().navigate(R.id.exampleFirstFragment)
        }


        binding.button3.setOnClickListener {
            lifecycleScope.launch {
                try {
                    val data = RetrofitService.apiService.getFackt()
                    binding.textViewFact.text = data.text
                    binding.textViewID.text = data.language
                }
                catch (e:Exception){
                    Log.d("AAA" , e.message.toString())
                }
            }
        }

    }



}