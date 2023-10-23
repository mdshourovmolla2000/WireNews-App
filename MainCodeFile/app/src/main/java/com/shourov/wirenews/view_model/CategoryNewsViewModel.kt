package com.shourov.wirenews.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.repository.CategoryNewsRepository

class CategoryNewsViewModel(private val repository: CategoryNewsRepository) : ViewModel() {
    private val _categoryNewsLiveData = MutableLiveData<List<NewsModel>>()
    val categoryNewsLiveData: LiveData<List<NewsModel>> get() = _categoryNewsLiveData

    fun getCategoryNews(categoryName: String) = _categoryNewsLiveData.postValue(repository.getCategoryNews(categoryName))
}