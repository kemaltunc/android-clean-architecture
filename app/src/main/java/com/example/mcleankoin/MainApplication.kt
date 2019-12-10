package com.example.mcleankoin

import android.app.Application
import androidx.multidex.MultiDex
import com.example.mcleankoin.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)

        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            listOf(
                appModule,
                viewModule,
                useCaseModule,
                networkModule,
                repositoryModule
            )
        }
    }
}