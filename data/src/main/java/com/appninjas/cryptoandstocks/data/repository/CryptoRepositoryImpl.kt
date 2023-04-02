package com.appninjas.cryptoandstocks.data.repository

import com.appninjas.cryptoandstocks.data.network.client.ApiClient
import com.appninjas.cryptoandstocks.data.network.mapper.CryptoMapper
import com.appninjas.cryptoandstocks.domain.model.Crypto
import com.appninjas.cryptoandstocks.domain.repository.CryptoRepository

class CryptoRepositoryImpl(private val apiClient: ApiClient, private val mapper: CryptoMapper) : CryptoRepository {

    override suspend fun getCryptoCourses(): ArrayList<Crypto> = mapper.dtoToModel(apiClient.getCrypto())

}