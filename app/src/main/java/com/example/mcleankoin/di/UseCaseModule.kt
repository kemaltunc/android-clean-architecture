package com.example.mcleankoin.di

import com.example.mcleankoin.domain.UseCaseManager
import com.example.mcleankoin.domain.usecase.PostUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { UseCaseManager(get()) }
    single { PostUseCase(get(), get()) }
}