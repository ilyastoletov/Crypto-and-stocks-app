package com.appninjas.cryptoandstocks.data.network.client

import com.appninjas.cryptoandstocks.data.network.dto.CryptoDto
import retrofit2.http.GET

interface ApiClient {

    @GET("getCrypto")
    suspend fun getCrypto(): Array<CryptoDto>

}