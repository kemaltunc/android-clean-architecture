package com.example.mcleankoin.data.repository

import com.example.mcleankoin.data.model.BaseResponse
import com.example.mcleankoin.data.model.Post
import com.example.mcleankoin.data.remote.ApiService
import com.example.mcleankoin.domain.repository.PostRepository

class PostsRepositoryImp(private val apiService: ApiService) : PostRepository {

    override suspend fun getPosts(): BaseResponse<List<Post>> {
        return apiService.getPosts()
    }

}