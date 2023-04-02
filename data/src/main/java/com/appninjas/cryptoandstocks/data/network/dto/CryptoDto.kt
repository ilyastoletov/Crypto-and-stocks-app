package com.appninjas.cryptoandstocks.data.network.dto

import com.google.gson.annotations.SerializedName

data class CryptoDto(
    @SerializedName("Name")
    val name: String,
    @SerializedName("ShortName")
    val shortName: String,
    @SerializedName("ImageURL")
    val imageUrl: String,
    @SerializedName("Rate")
    val rate: String,
    @SerializedName("DayChange")
    val dayChange: String,
    @SerializedName("TickerStatus")
    val tickerStatus: Boolean
)
