package com.shourov.wirenews.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.repository.HomeRepository
import java.text.SimpleDateFormat
import java.util.Calendar

class HomeViewModel(private val repository: HomeRepository) : ViewModel() {

    private val calendar = Calendar.getInstance()

    private val _topNewsCategoryLiveData = MutableLiveData<List<String>>()
    val topNewsCategoryLiveData: LiveData<List<String>> get() = _topNewsCategoryLiveData

    fun getTopNewsCategory() = _topNewsCategoryLiveData.postValue(repository.getTopNewsCategory().toList())


    private val _newsLiveData = MutableLiveData<List<NewsModel>>()
    val newsLiveData: LiveData<List<NewsModel>> get() = _newsLiveData

    fun getNews(categoryName: String) = _newsLiveData.postValue(repository.getNews(categoryName))


    fun getCurrentDate(): String {
        return SimpleDateFormat("MMM").format(calendar.time) + " " + String.format("%02d", calendar.get(Calendar.DAY_OF_MONTH)) + ", " + SimpleDateFormat("EEEE").format(calendar.time)
    }
}