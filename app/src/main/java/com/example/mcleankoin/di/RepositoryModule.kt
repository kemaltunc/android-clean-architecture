package com.example.mcleankoin.di

import com.example.mcleankoin.data.remote.ApiService
import com.example.mcleankoin.data.repository.PostsRepositoryImp
import com.example.mcleankoin.domain.repository.PostRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { createPostRepository(get()) }
}

fun createPostRepository(apiService: ApiService): PostRepository {
    return PostsRepositoryImp(apiService)
}
