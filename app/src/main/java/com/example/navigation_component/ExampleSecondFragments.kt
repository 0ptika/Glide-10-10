package com.example.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.databinding.FragmentExampleFirstBinding
import com.example.navigation_component.databinding.FragmentExampleSecondFragmentsBinding

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
    }


}