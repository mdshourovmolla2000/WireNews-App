package com.shourov.wirenews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.shourov.wirenews.R
import com.shourov.wirenews.databinding.FragmentFullNewsBinding
import com.shourov.wirenews.utils.loadImage

class FullNewsFragment : Fragment() {

    private lateinit var binding: FragmentFullNewsBinding

    private var coverImage = R.drawable.image_placeholder
    private var categoryName = ""
    private var newsTitle = ""
    private var fullNews = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFullNewsBinding.inflate(inflater, container, false)

        coverImage = arguments?.getInt("COVER_IMAGE")!!
        categoryName = arguments?.getString("CATEGORY_NAME").toString()
        newsTitle = arguments?.getString("NEWS_TITLE").toString()
        fullNews = arguments?.getString("FULL_NEWS").toString()

        binding.backIcon.setOnClickListener { findNavController().popBackStack() }

        binding.coverImageImageview.loadImage(coverImage)
        binding.categoryNameTextview.text = categoryName
        binding.newsTitleTextview.text = newsTitle
        binding.fullNewsTextview.text = fullNews

        return binding.root
    }
}