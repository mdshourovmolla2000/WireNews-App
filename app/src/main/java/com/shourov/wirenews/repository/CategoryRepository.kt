package com.shourov.wirenews.repository

import com.shourov.wirenews.utils.DemoData
import com.shourov.wirenews.model.CategoryModel

class CategoryRepository {
    fun getCategory(): List<CategoryModel> = DemoData().categoryItemData()
}