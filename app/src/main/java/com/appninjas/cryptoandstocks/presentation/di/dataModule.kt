package com.appninjas.cryptoandstocks.presentation.di

import com.appninjas.cryptoandstocks.data.network.client.ApiClient
import com.appninjas.cryptoandstocks.data.network.mapper.CryptoMapper
import com.appninjas.cryptoandstocks.data.repository.CryptoRepositoryImpl
import com.appninjas.cryptoandstocks.domain.repository.CryptoRepository
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val dataModule = module {

    single<CryptoRepository> {
        CryptoRepositoryImpl(
            apiClient = get(),
            mapper = CryptoMapper()
        )
    }

    single<Retrofit> {
        provideRetrofit()
    }

    single<ApiClient> {
        provideClient(retrofit = get())
    }

}

fun provideRetrofit(): Retrofit = Retrofit.Builder()
    .baseUrl("http://192.168.1.37:5000/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

fun provideClient(retrofit: Retrofit): ApiClient = retrofit.create(ApiClient::class.java)