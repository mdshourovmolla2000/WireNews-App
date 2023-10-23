package com.shourov.wirenews.interfaces

import com.shourov.wirenews.model.CategoryModel

interface CategoryItemClickListener {
    fun onCategoryItemClick(currentItem: CategoryModel)
}