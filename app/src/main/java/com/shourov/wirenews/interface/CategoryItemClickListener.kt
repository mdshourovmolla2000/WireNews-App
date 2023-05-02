package com.shourov.wirenews.`interface`

import com.shourov.wirenews.model.CategoryModel

interface CategoryItemClickListener {
    fun onCategoryItemClick(currentItem: CategoryModel)
}