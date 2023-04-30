package com.shourov.wirenews.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.shourov.wirenews.R

fun ImageView.loadImage(resource: Int?, placeholder: Int = R.drawable.image_placeholder) = Glide.with(this.context).load(resource).placeholder(placeholder).error(placeholder).into(this)