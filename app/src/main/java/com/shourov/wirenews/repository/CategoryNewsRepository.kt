package com.shourov.wirenews.repository

import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.utils.DemoData

class CategoryNewsRepository {
    fun getCategoryNews(categoryName: String): ArrayList<NewsModel>{
        return ArrayList(DemoData().newsItemData().filter { it.categoryName == categoryName })
    }
}