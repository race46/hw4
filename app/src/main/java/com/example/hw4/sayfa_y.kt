package com.example.hw4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw4.databinding.FragmentSayfaYBinding


class sayfa_y : Fragment() {

    lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSayfaYBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

}