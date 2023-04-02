package com.appninjas.cryptoandstocks.domain.repository

import com.appninjas.cryptoandstocks.domain.model.Crypto

interface CryptoRepository {
    suspend fun getCryptoCourses(): ArrayList<Crypto>
}