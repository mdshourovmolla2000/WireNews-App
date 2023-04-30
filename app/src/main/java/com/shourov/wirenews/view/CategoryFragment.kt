package com.shourov.wirenews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.shourov.wirenews.adapter.CategoryListAdapter
import com.shourov.wirenews.databinding.FragmentCategoryBinding
import com.shourov.wirenews.`interface`.CategoryItemClickListener
import com.shourov.wirenews.model.CategoryModel
import com.shourov.wirenews.repository.CategoryRepository
import com.shourov.wirenews.view_model.CategoryViewModel

class CategoryFragment : Fragment(), CategoryItemClickListener {

    private lateinit var binding: FragmentCategoryBinding

    private lateinit var viewModel: CategoryViewModel

    private var categoryList = ArrayList<CategoryModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCategoryBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(this, CategoryViewModelFactory(CategoryRepository()))[CategoryViewModel::class.java]

        viewModel.getCategory()

        observerList()

        binding.categoryRecyclerview.apply {
            adapter = CategoryListAdapter(categoryList, this@CategoryFragment)
        }

        binding.backIcon.setOnClickListener { findNavController().popBackStack() }

        return binding.root
    }

    private fun observerList() {
        viewModel.categoryLiveData.observe(viewLifecycleOwner) {
            categoryList.clear()
            categoryList.addAll(ArrayList(it))
            binding.categoryRecyclerview.adapter?.notifyDataSetChanged()
        }
    }

    override fun onCategoryItemClick(currentItem: CategoryModel) {

    }
}



class CategoryViewModelFactory(private val repository: CategoryRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = CategoryViewModel(repository) as T
}