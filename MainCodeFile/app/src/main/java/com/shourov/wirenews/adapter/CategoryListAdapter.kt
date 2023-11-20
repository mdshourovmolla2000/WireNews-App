package com.shourov.wirenews.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shourov.wirenews.R
import com.shourov.wirenews.databinding.SingleCategoryItemLayoutBinding
import com.shourov.wirenews.interfaces.CategoryItemClickListener
import com.shourov.wirenews.model.CategoryModel
import com.shourov.wirenews.utils.loadImage

class CategoryListAdapter(private val itemList: ArrayList<CategoryModel>, private val itemClickListener: CategoryItemClickListener) : RecyclerView.Adapter<CategoryListAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_category_item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) = holder.onBind(itemList[position])

    override fun getItemCount(): Int = itemList.size

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = SingleCategoryItemLayoutBinding.bind(itemView)

        @SuppressLint("SetTextI18n")
        fun onBind(currentItem: CategoryModel) {
            binding.apply {
                categoryImageImageview.loadImage(currentItem.categoryImage)
                categoryNameTextview.text = currentItem.categoryName
                categoryCardView.setOnClickListener { itemClickListener.onCategoryItemClick(currentItem) }
            }
        }
    }
}