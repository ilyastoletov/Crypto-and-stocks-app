package com.appninjas.cryptoandstocks.presentation.di

import com.appninjas.cryptoandstocks.domain.usecase.GetCryptoCoursesUseCase
import org.koin.dsl.module

val domainModule = module {
    factory {
        GetCryptoCoursesUseCase(repository = get())
    }
}