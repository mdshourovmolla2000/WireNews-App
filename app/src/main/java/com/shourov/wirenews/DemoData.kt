package com.shourov.wirenews

import com.shourov.wirenews.model.CategoryModel

class DemoData {

    fun topNewsCategoryData(): Array<String> {
        return arrayOf("All", "Economy", "Sports", "Politics", "Science", "More")
    }

    fun categoryItemData(): ArrayList<CategoryModel>{
        val itemList: ArrayList<CategoryModel> = ArrayList()
        itemList.add(CategoryModel(R.drawable.category_image_1,"Politics"))
        itemList.add(CategoryModel(R.drawable.category_image_2,"Economy"))
        itemList.add(CategoryModel(R.drawable.category_image_3,"Technology"))
        itemList.add(CategoryModel(R.drawable.category_image_4,"Entertainment"))
        itemList.add(CategoryModel(R.drawable.category_image_5,"Sports"))
        itemList.add(CategoryModel(R.drawable.category_image_6,"Health"))
        itemList.add(CategoryModel(R.drawable.category_image_7,"Science"))
        itemList.add(CategoryModel(R.drawable.category_image_8,"Education"))
        itemList.add(CategoryModel(R.drawable.category_image_9,"Environment"))
        itemList.add(CategoryModel(R.drawable.category_image_10,"Lifestyle"))
        itemList.add(CategoryModel(R.drawable.category_image_11,"Travel"))
        itemList.add(CategoryModel(R.drawable.category_image_12,"Food"))
        itemList.add(CategoryModel(R.drawable.category_image_13,"Fashion"))
        itemList.add(CategoryModel(R.drawable.category_image_14,"Art"))
        itemList.add(CategoryModel(R.drawable.category_image_15,"Crime"))
        return itemList
    }
}