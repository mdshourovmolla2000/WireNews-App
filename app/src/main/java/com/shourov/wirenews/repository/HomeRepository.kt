package com.shourov.wirenews.repository

import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.utils.DemoData

class HomeRepository {
    fun getTopNewsCategory(): Array<String> = DemoData().topNewsCategoryData()

    fun getNews(categoryName: String): List<NewsModel> {
        return if (categoryName == "All") {
            DemoData().newsItemData()
        } else {
            ArrayList(DemoData().newsItemData().filter { it.categoryName == categoryName })
        }
    }
}