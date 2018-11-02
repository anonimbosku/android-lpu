package com.shafyanta.lpu.adapter.items

import com.shafyanta.lpu.model.Item

interface ItemListener {
    fun onItemClicked(item: Item)
}