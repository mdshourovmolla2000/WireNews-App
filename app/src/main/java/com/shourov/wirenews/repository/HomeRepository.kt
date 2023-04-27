package com.shourov.wirenews.repository

import com.shourov.wirenews.DemoData

class HomeRepository {
    fun getTopNewsCategory(): Array<String> = DemoData().topNewsCategoryData()
}