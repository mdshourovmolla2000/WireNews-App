package com.shourov.wirenews.`interface`

import com.shourov.wirenews.model.NewsModel

interface NewsItemClickListener {

    fun onNewsItemClick(currentItem: NewsModel)

}