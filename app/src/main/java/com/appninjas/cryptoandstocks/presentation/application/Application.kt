package com.appninjas.cryptoandstocks.presentation.application

import com.appninjas.cryptoandstocks.presentation.di.appModule
import com.appninjas.cryptoandstocks.presentation.di.dataModule
import com.appninjas.cryptoandstocks.presentation.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@Application)
            modules(listOf(appModule, dataModule, domainModule))
        }
    }

}