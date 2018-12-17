package com.shafyanta.lpu.adapter.items

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.shafyanta.lpu.R
import com.shafyanta.lpu.model.Item
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_name.view.*

class ItemAdapter(private val context: Context?, private val listItem: ArrayList<Item>, listener: ItemListener)
    : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private val bridge = listener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_name, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(listItem[position], bridge)
    }

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
        fun bindItem(item: Item, listener: ItemListener) {
            containerView.tv_item.text = item.title
            Glide.with(containerView).load(item.imageUrl).into(containerView.iv_item)
            containerView.btn_item.setOnClickListener { listener.onItemClicked(item) }
        }
    }
}