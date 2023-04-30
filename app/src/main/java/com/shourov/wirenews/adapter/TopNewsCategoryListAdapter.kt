package com.shourov.wirenews.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.shourov.wirenews.R
import com.shourov.wirenews.databinding.SingleTopNewsCategoryItemLayoutBinding
import com.shourov.wirenews.`interface`.TopNewsCategoryItemClickListener

class TopNewsCategoryListAdapter(
    private var itemList: ArrayList<String>,
    currentTopNewsCategoryPosition: Int,
    private val itemClickListener: TopNewsCategoryItemClickListener
) :
    RecyclerView.Adapter<TopNewsCategoryListAdapter.ItemViewHolder>() {

    private var currentIndex = currentTopNewsCategoryPosition

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_top_news_category_item_layout, parent, false)

        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind(itemList[position], position)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = SingleTopNewsCategoryItemLayoutBinding.bind(itemView)

        @SuppressLint("SetTextI18n")
        fun onBind(currentItem: String, position: Int) {

            //selecting bg color of current selected item
            if (currentIndex == position) {
                binding.categoryNameCardView.setCardBackgroundColor(ContextCompat.getColor(itemView.context, R.color.themeColor))
                binding.categoryNameTextview.setTextColor(ContextCompat.getColor(itemView.context, R.color.white))
            } else {
                binding.categoryNameCardView.setCardBackgroundColor(Color.parseColor("#EEEEEE"))
                binding.categoryNameTextview.setTextColor(ContextCompat.getColor(itemView.context, R.color.black))
            }

            binding.categoryNameTextview.text = currentItem

            itemView.setOnClickListener {
                when(currentItem) {
                    "More" -> itemClickListener.onTopNewsCategoryItemClick(currentItem, position)
                    else -> {
                        currentIndex = position
                        itemClickListener.onTopNewsCategoryItemClick(currentItem, position)
                        notifyDataSetChanged()
                    }
                }
            }

        }

    }
}