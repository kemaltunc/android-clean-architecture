package com.example.mcleankoin.domain

import com.example.mcleankoin.data.model.BaseResponse
import com.example.mcleankoin.data.model.Post
import com.example.mcleankoin.domain.usecase.PostUseCase
import com.example.mcleankoin.domain.usecase.base.UseCaseResponse

class UseCaseManager constructor(
    private val postUseCase: PostUseCase
) {

    fun getPost(useCaseResponse: UseCaseResponse<BaseResponse<List<Post>>>) {
        suspend { postUseCase.getPosts(useCaseResponse) }
    }

}