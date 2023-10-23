package com.shourov.wirenews.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shourov.wirenews.R
import com.shourov.wirenews.databinding.SingleNewsItemLayoutBinding
import com.shourov.wirenews.interfaces.NewsItemClickListener
import com.shourov.wirenews.model.NewsModel
import com.shourov.wirenews.utils.loadImage

class NewsListAdapter(private val itemList: ArrayList<NewsModel>, private val itemClickListener: NewsItemClickListener) :
    RecyclerView.Adapter<NewsListAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_news_item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) = holder.onBind(itemList[position])

    override fun getItemCount(): Int = itemList.size

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = SingleNewsItemLayoutBinding.bind(itemView)

        @SuppressLint("SetTextI18n")
        fun onBind(currentItem: NewsModel) {
            binding.apply {
                newsCoverImageview.loadImage(currentItem.coverImage)
                categoryNameTextview.text = currentItem.categoryName.uppercase()
                newsTitleTextview.text = currentItem.newsTitle
                itemCardView.setOnClickListener { itemClickListener.onNewsItemClick(currentItem) }
            }
        }

    }
}