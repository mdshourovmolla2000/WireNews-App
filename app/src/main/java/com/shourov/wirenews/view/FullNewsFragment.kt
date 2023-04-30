package com.shourov.wirenews.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shourov.wirenews.R
import com.shourov.wirenews.databinding.FragmentFullNewsBinding

class FullNewsFragment : Fragment() {

    private lateinit var binding: FragmentFullNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFullNewsBinding.inflate(inflater, container, false)


        return binding.root
    }
}