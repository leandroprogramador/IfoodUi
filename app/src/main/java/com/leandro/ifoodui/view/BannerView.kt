package com.leandro.ifoodui.view

import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.leandro.ifoodui.databinding.BannerItemBinding
import com.leandro.ifoodui.databinding.CategoryItemBinding
import com.leandro.ifoodui.model.Banner
import com.leandro.ifoodui.model.Category
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception

class BannerView(viewGroup: ViewGroup) : ATViewHolder<Banner, BannerItemBinding>(
    BannerItemBinding::inflate, viewGroup
) {
    override fun bind(item: Banner) {
        Picasso.get().load(item.bannerUrl).into(binding.imgBanner)

    }

}