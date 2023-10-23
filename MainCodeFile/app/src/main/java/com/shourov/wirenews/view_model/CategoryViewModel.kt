package com.shourov.wirenews.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shourov.wirenews.model.CategoryModel
import com.shourov.wirenews.repository.CategoryRepository

class CategoryViewModel(private val repository: CategoryRepository) : ViewModel() {

    private val _categoryLiveData = MutableLiveData<List<CategoryModel>>()
    val categoryLiveData: LiveData<List<CategoryModel>> get() = _categoryLiveData

    fun getCategory() = _categoryLiveData.postValue(repository.getCategory())

}