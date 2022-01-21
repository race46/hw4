package com.example.hw4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw4.databinding.FragmentAnasayfaBinding


class anasayfa : Fragment() {

    lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_anasayfa_to_sayfa_a)
        }
        binding.button2.setOnClickListener{
            findNavController().navigate(R.id.action_anasayfa_to_sayfa_x)
        }
        return binding.root
    }

}