package com.example.navigation_component.data

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializer

data class Meme(
    @SerializedName("box_count")
    val box_count: Int,
    @SerializedName("captions")
    val captions: Int,
    @SerializedName("heihgt")
    val height: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("width")
    val width: Int
)



