package com.example.testecarrefour.application

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import org.koin.android.ext.koin.androidContext
import org.koin.core.KoinApplication
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level


class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val koin = KoinApplication.init()
            .printLogger(Level.ERROR)
            .modules(modules)
            .androidContext(this)
        startKoin(koin)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

}