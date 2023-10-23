package com.shourov.wirenews.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.repository.SearchRepository

class SearchViewModel(private val repository: SearchRepository) : ViewModel() {
    private val _searchResultLiveData = MutableLiveData<List<NewsModel>>()
    val searchResultLiveData : LiveData<List<NewsModel>> get() = _searchResultLiveData

    fun searchNews(title: String) = _searchResultLiveData.postValue(repository.searchNews(title))
}