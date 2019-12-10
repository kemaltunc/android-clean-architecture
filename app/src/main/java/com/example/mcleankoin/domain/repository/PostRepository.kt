package com.example.mcleankoin.domain.repository

import com.example.mcleankoin.data.model.BaseResponse
import com.example.mcleankoin.data.model.Post

interface PostRepository {
    suspend fun getPosts(): BaseResponse<List<Post>>
}