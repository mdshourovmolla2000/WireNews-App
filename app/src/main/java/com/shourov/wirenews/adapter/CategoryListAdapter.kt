package com.shourov.wirenews.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shourov.wirenews.R
import com.shourov.wirenews.databinding.SingleCategoryItemLayoutBinding
import com.shourov.wirenews.`interface`.CategoryItemClickListener
import com.shourov.wirenews.model.CategoryModel

class CategoryListAdapter(private val context: Context, private var itemList: ArrayList<CategoryModel>, private val itemClickListener: CategoryItemClickListener) : RecyclerView.Adapter<CategoryListAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.single_category_item_layout, parent, false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = SingleCategoryItemLayoutBinding.bind(itemView)

        @SuppressLint("SetTextI18n")
        fun onBind(currentItem: CategoryModel) {
            Glide.with(context).load(currentItem.categoryImage).into(binding.categoryImageImageview)

            binding.categoryNameTextview.text = currentItem.categoryName

            binding.categoryCardView.setOnClickListener {
                itemClickListener.onCategoryItemClick(currentItem)
            }
        }

    }
}