package com.appninjas.cryptoandstocks.presentation.di

import com.appninjas.cryptoandstocks.presentation.screens.crypto.CryptoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        CryptoViewModel(getCryptoCoursesUseCase = get())
    }
}