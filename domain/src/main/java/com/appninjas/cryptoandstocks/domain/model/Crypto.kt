package com.appninjas.cryptoandstocks.domain.model

data class Crypto(
    val name: String,
    val shortName: String,
    val imageURL: String,
    val rate: String,
    val dayChange: String,
    val tickerState: Boolean
)
