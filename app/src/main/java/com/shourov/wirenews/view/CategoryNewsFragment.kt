package com.shourov.wirenews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shourov.wirenews.databinding.FragmentCategoryNewsBinding

class CategoryNewsFragment : Fragment() {

    private lateinit var binding: FragmentCategoryNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCategoryNewsBinding.inflate(inflater, container, false)

        return binding.root
    }
}