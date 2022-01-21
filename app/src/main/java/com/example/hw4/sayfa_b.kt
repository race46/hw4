package com.example.hw4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw4.databinding.FragmentSayfaBBinding


class sayfa_b : Fragment() {

    lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSayfaBBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_sayfa_b_to_sayfa_y)
        }
        return binding.root
    }


}