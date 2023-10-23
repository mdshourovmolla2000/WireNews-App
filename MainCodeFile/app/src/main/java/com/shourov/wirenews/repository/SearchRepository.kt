package com.shourov.wirenews.repository

import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.utils.DemoData

class SearchRepository {
    fun searchNews(title: String): List<NewsModel> = DemoData().newsItemData().filter { it.newsTitle.lowercase().contains(title.lowercase()) }
}