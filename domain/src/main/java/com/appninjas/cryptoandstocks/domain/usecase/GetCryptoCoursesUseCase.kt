package com.appninjas.cryptoandstocks.domain.usecase

import com.appninjas.cryptoandstocks.domain.model.Crypto
import com.appninjas.cryptoandstocks.domain.repository.CryptoRepository

class GetCryptoCoursesUseCase(private val repository: CryptoRepository) {
    suspend fun invoke(): ArrayList<Crypto> = repository.getCryptoCourses()
}