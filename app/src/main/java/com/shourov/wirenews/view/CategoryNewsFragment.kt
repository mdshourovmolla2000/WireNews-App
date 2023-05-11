package com.shourov.wirenews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.shourov.wirenews.R
import com.shourov.wirenews.adapter.NewsListAdapter
import com.shourov.wirenews.databinding.FragmentCategoryNewsBinding
import com.shourov.wirenews.`interface`.NewsItemClickListener
import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.repository.CategoryNewsRepository
import com.shourov.wirenews.view_model.CategoryNewsViewModel

class CategoryNewsFragment : Fragment(), NewsItemClickListener {

    private lateinit var binding: FragmentCategoryNewsBinding

    private var categoryName = ""

    private lateinit var viewModel: CategoryNewsViewModel

    private val categoryNewsList = ArrayList<NewsModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCategoryNewsBinding.inflate(inflater, container, false)

        binding.backIcon.setOnClickListener { findNavController().popBackStack() }

        categoryName = arguments?.getString("CATEGORY_NAME").toString()

        binding.titleTextview.text = categoryName

        viewModel = ViewModelProvider(this, CategoryNewsViewModelFactory(CategoryNewsRepository()))[CategoryNewsViewModel::class.java]

        viewModel.getCategoryNews(categoryName)

        observerList()

        binding.categoryNewsRecyclerview.adapter = NewsListAdapter(categoryNewsList, this@CategoryNewsFragment)

        return binding.root
    }

    private fun observerList() {
        viewModel.categoryNewsLiveData.observe(viewLifecycleOwner) {
            categoryNewsList.clear()
            if (it.isNullOrEmpty()) {
                binding.categoryNewsRecyclerview.visibility = View.GONE
                binding.noNewsAvailableTextview.visibility = View.VISIBLE
            } else {
                categoryNewsList.addAll(it)
                binding.noNewsAvailableTextview.visibility = View.GONE
                binding.categoryNewsRecyclerview.visibility = View.VISIBLE
            }

            binding.categoryNewsRecyclerview.adapter?.notifyDataSetChanged()
        }
    }

    override fun onNewsItemClick(currentItem: NewsModel) {
        val bundle = bundleOf(
            "COVER_IMAGE" to currentItem.coverImage,
            "CATEGORY_NAME" to currentItem.categoryName,
            "NEWS_TITLE" to currentItem.newsTitle,
            "FULL_NEWS" to currentItem.fullNews
        )
        findNavController().navigate(R.id.action_categoryNewsFragment_to_fullNewsFragment, bundle)
    }
}


class CategoryNewsViewModelFactory(private val repository: CategoryNewsRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        CategoryNewsViewModel(repository) as T
}