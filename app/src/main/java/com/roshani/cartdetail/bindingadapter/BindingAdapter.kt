package com.roshani.cartdetail.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.roshani.cartdetail.R

object BindingAdapter {
    @JvmStatic
    @BindingAdapter(value = ["imageUrl", "placeholder"], requireAll = false)
    fun setImageUrl(view: ImageView, imageUrl: String?, placeholder: String?) {
        Glide.with(view.context)
            .load(imageUrl)
            .error(R.mipmap.ic_launcher)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(view)
    }


}