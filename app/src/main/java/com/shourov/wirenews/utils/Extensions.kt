package com.shourov.wirenews.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImage(url: String?) = Glide.with(this.context).load(url).into(this)

fun ImageView.loadImage(resource: Int?) = Glide.with(this.context).load(resource).into(this)