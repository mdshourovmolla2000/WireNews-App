package com.shourov.wirenews.repository

import com.shourov.wirenews.DemoData
import com.shourov.wirenews.model.CategoryModel

class CategoryRepository {
    fun getCategory(): ArrayList<CategoryModel> = DemoData().categoryItemData()
}