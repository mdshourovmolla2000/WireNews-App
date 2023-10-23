package com.shourov.wirenews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.shourov.wirenews.R
import com.shourov.wirenews.adapter.NewsListAdapter
import com.shourov.wirenews.databinding.FragmentSearchBinding
import com.shourov.wirenews.interfaces.NewsItemClickListener
import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.repository.SearchRepository
import com.shourov.wirenews.view_model.SearchViewModel

class SearchFragment : Fragment(), NewsItemClickListener {

    private lateinit var binding: FragmentSearchBinding

    private lateinit var viewModel: SearchViewModel

    private var newsList = ArrayList<NewsModel>()
    private var searchText = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false)

        binding.backIcon.setOnClickListener { findNavController().popBackStack() }

        viewModel = ViewModelProvider(this, SearchViewModelFactory(SearchRepository()))[SearchViewModel::class.java]

        observerList()

        binding.searchNewsRecyclerview.adapter = NewsListAdapter(newsList, this@SearchFragment)

        binding.clearIcon.setOnClickListener { binding.searchTitleEdittext.text.clear() }

        binding.searchTitleEdittext.doOnTextChanged { text, _, _, _ ->
            searchText = text.toString()
            if (searchText.isNotEmpty()){
                viewModel.searchNews(searchText)
            } else {
                newsList.clear()
                binding.searchNewsRecyclerview.adapter?.notifyDataSetChanged()
                binding.nothingFoundLayout.visibility = View.GONE
            }
        }

        return binding.root
    }

    private fun observerList() {
        viewModel.searchResultLiveData.observe(viewLifecycleOwner) {
            if (it.isNullOrEmpty()) {
                binding.searchNewsRecyclerview.visibility = View.GONE
                binding.nothingFoundLayout.visibility = View.VISIBLE
            } else {
                binding.nothingFoundLayout.visibility = View.GONE
                binding.searchNewsRecyclerview.visibility = View.VISIBLE

                newsList.clear()
                newsList.addAll(ArrayList(it).asReversed())

                binding.searchNewsRecyclerview.adapter?.notifyDataSetChanged()
            }
        }
    }

    override fun onNewsItemClick(currentItem: NewsModel) {
        val bundle = bundleOf(
            "COVER_IMAGE" to currentItem.coverImage,
            "CATEGORY_NAME" to currentItem.categoryName,
            "NEWS_TITLE" to currentItem.newsTitle,
            "FULL_NEWS" to currentItem.fullNews
        )
        findNavController().navigate(R.id.action_searchFragment_to_fullNewsFragment, bundle)
    }
}


class SearchViewModelFactory(private val repository: SearchRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = SearchViewModel(repository) as T
}