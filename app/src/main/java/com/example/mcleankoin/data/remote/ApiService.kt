package com.example.mcleankoin.data.remote

import com.example.mcleankoin.data.model.BaseResponse
import com.example.mcleankoin.data.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("/posts")
    suspend fun getPosts(): BaseResponse<List<Post>>
}