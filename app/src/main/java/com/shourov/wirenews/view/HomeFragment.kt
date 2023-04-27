package com.shourov.wirenews.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.shourov.wirenews.R
import com.shourov.wirenews.adapter.TopNewsCategoryListAdapter
import com.shourov.wirenews.databinding.FragmentHomeBinding
import com.shourov.wirenews.`interface`.TopNewsCategoryItemClickListener
import com.shourov.wirenews.repository.HomeRepository
import com.shourov.wirenews.view_model.HomeViewModel

class HomeFragment : Fragment(), TopNewsCategoryItemClickListener {

    private lateinit var binding: FragmentHomeBinding

    private lateinit var viewModel: HomeViewModel

    private var topNewsCategoryList = ArrayList<String>()
    private var currentTopNewsCategoryPosition = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        viewModel = ViewModelProvider(this, HomeViewModelFactory(HomeRepository()))[HomeViewModel::class.java]

        binding.currentDateTextview.text = viewModel.getCurrentDate()

        viewModel.getTopNewsCategory()

        observerList()

        binding.topNewsCategoryRecyclerview.apply { adapter = TopNewsCategoryListAdapter(requireContext(), topNewsCategoryList, currentTopNewsCategoryPosition, this@HomeFragment) }

        return binding.root
    }


    private fun observerList() {
        viewModel.topNewsCategoryLiveData.observe(viewLifecycleOwner) {
            topNewsCategoryList.clear()
            topNewsCategoryList.addAll(ArrayList(it))
            binding.topNewsCategoryRecyclerview.adapter?.notifyDataSetChanged()
        }
    }


    override fun onTopNewsCategoryItemClick(currentItem: String, currentItemPosition: Int) {
        when(currentItem) {
            "More" -> findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
            else -> {
                currentTopNewsCategoryPosition = currentItemPosition
            }
        }
    }
}



class HomeViewModelFactory(private val repository: HomeRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = HomeViewModel(repository) as T
}