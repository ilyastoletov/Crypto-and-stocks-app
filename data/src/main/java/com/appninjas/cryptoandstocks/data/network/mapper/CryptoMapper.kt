package com.appninjas.cryptoandstocks.data.network.mapper

import com.appninjas.cryptoandstocks.data.network.dto.CryptoDto
import com.appninjas.cryptoandstocks.domain.model.Crypto

class CryptoMapper {

    fun dtoToModel(dtoArray: Array<CryptoDto>): ArrayList<Crypto> = dtoArray.map { d -> Crypto(
        name = d.name,
        shortName = d.shortName,
        tickerState = d.tickerStatus,
        imageURL = d.imageUrl,
        rate = d.rate,
        dayChange = d.dayChange
    ) }.toCollection(ArrayList())

}