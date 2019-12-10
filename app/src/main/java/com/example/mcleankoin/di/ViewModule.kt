package com.example.mcleankoin.di

import com.example.mcleankoin.domain.usecase.base.UseCase
import com.example.mcleankoin.presentation.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module


val viewModule = module {
    viewModel { UseCase(get()) }
    viewModel { MainViewModel(get()) }
}
