package com.example.mcleankoin.domain.usecase.base

import com.example.mcleankoin.data.model.ErrorModel

interface UseCaseResponse<T> {

    fun onSuccess(result: T?)

    fun onError(errorModel: ErrorModel)
}