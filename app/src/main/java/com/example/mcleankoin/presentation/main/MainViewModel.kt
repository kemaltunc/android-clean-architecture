package com.example.mcleankoin.presentation.main

import com.example.mcleankoin.data.model.BaseResponse
import com.example.mcleankoin.data.model.ErrorModel
import com.example.mcleankoin.data.model.Post
import com.example.mcleankoin.domain.UseCaseManager
import com.example.mcleankoin.domain.usecase.base.UseCaseResponse
import com.example.mcleankoin.presentation.base.BaseViewModel

class MainViewModel constructor(private val useCaseManager: UseCaseManager) : BaseViewModel() {

    fun getPosts() {
        useCaseManager.getPost(object : UseCaseResponse<BaseResponse<List<Post>>> {
            override fun onSuccess(result: BaseResponse<List<Post>>?) {

            }

            override fun onError(errorModel: ErrorModel) {

            }

        })
    }

}