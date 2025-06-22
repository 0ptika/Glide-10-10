package com.example.navigation_component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.data.MemsRespons
import com.example.navigation_component.data.RetrofitService
import com.example.navigation_component.databinding.FragmentExampleFirstBinding
import kotlinx.coroutines.launch

class ExampleFirstFragment : Fragment() {

    private lateinit var binding: FragmentExampleFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExampleFirstBinding.inflate(layoutInflater,container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      binding.button.setOnClickListener {
          findNavController().navigate(R.id.exampleSecondFragments)
      }
        lifecycleScope.launch {
            try {
                val respons = RetrofitService.apiService.getMems()
                val listMeme  = respons.data.memes
               // val adapter =
            } catch (e: Exception){

            }
        }
    }

}

