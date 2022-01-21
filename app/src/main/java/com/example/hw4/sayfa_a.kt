package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw4.databinding.FragmentSayfaABinding

class sayfa_a : Fragment() {

    lateinit var binding : FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSayfaABinding.inflate(inflater,container,false)
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_sayfa_a_to_sayfa_b)
        }
        return binding.root
    }


}