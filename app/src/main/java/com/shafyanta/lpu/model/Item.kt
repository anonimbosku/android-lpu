package com.shafyanta.lpu.model
import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("title") var title: String,
    @SerializedName("imageUrl") var imageUrl: String
)