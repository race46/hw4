package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw4.databinding.FragmentSayfaXBinding

class sayfa_x : Fragment() {

    lateinit var binding: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSayfaXBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_sayfa_x_to_sayfa_y)
        }
        return binding.root
    }


}