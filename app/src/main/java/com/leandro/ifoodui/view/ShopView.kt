package com.leandro.ifoodui.view

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.leandro.ifoodui.databinding.ShopItemBinding
import com.leandro.ifoodui.model.Shop
import com.squareup.picasso.Picasso

class ShopView(viewGroup: ViewGroup) : ATViewHolder<Shop, ShopItemBinding>(
    ShopItemBinding::inflate, viewGroup
) {
    override fun bind(item: Shop) {
        Picasso.get().load(item.shopUrl).into(binding.imgShop)
        binding.txtTitle.text = item.name
    }

}