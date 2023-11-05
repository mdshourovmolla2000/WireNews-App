package com.shourov.wirenews.interfaces

import android.view.View
import com.shourov.wirenews.model.NewsModel

interface NewsItemClickListener {
    fun onNewsItemClick(currentItem: NewsModel, view: View)
}