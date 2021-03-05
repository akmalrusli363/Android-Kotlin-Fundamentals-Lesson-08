package com.example.android.marsrealestate.utils

import android.net.Uri
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.android.marsrealestate.R

object ImageLoader {
    @DrawableRes
    private const val LOADING_IMAGE = R.drawable.loading_animation

    @DrawableRes
    private const val BROKEN_IMAGE = R.drawable.ic_broken_image

    fun loadWith(imgUri: Uri, imgView: ImageView) {
        loadWith(imgUri, imgView, LOADING_IMAGE, BROKEN_IMAGE)
    }

    fun loadWith(imgUri: Uri, imgView: ImageView,
                 @DrawableRes loadingDrawable: Int, @DrawableRes brokenDrawable:Int) {
        Glide.with(imgView.context)
                .load(imgUri)
                .apply(RequestOptions()
                        .placeholder(loadingDrawable)
                        .error(brokenDrawable))
                .into(imgView)
    }
}