package com.example.navigation_component

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializer

data class FackBackResponse(
    @SerializedName("id") // 9c6617566115bdc3455bfe24d79dae7a
    val id: String,
    @SerializedName("language") // en
    val language: String,
    @SerializedName("permalink") // https://uselessfacts.jsph.pl/api/v2/facts/9c6617566115bdc3455bfe24d79dae7a
    val permalink: String,
    @SerializedName("source") // djtech.net
    val source: String,
    @SerializedName("source_url") // http://www.djtech.net/humor/useless_facts.htm
    val source_url: String,
    @SerializedName("text") // There is a seven letter word in the English language that contains ten words without rearranging any of its letters, \"therein\": the, there, he, in, rein, her, here, ere, therein, herein.
    val text: String
)