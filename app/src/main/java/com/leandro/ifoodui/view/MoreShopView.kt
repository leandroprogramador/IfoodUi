package com.leandro.ifoodui.view

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.leandro.ifoodui.R
import com.leandro.ifoodui.databinding.MoreShopBinding
import com.leandro.ifoodui.databinding.ShopItemBinding
import com.leandro.ifoodui.model.MoreShop
import com.leandro.ifoodui.model.Shop
import com.squareup.picasso.Picasso

class MoreShopView(viewGroup: ViewGroup) : ATViewHolder<MoreShop, MoreShopBinding>(
    MoreShopBinding::inflate, viewGroup
) {
    override fun bind(item: MoreShop) {
        Picasso.get().load(item.bannerUrl).into(binding.imgShop)
        binding.txtTitle.text = item.text
        binding.txtStar.text = item.rate.toString()
        binding.txtSubtitle.text = itemView.context.getString(R.string.shop_category, item.category, item.distance)
        binding.txtPrice.text = itemView.context.getString(R.string.shop_price, item.time, item.price)
    }

}