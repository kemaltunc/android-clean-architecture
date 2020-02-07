package com.example.mcleankoin.domain.usecase.base

import com.example.mcleankoin.data.model.BaseResponse
import com.example.mcleankoin.data.model.ErrorModel
import com.example.mcleankoin.data.remote.ApiErrorHandle
import com.example.mcleankoin.presentation.base.BaseViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import retrofit2.HttpException

open class UseCase(private val apiErrorHandle: ApiErrorHandle?) : BaseViewModel() {

    fun <T : BaseResponse<*>> invoke(
        onResult: UseCaseResponse<T>,
        service: T

    ) {

        val backgroundJob = scope.async { service }

        scope.launch {
            backgroundJob.await().let {
                try {
                    when (it.code) {
                        200 -> onResult.onSuccess(it)
                        else -> onResult.onError(
                            ErrorModel(
                                "Bir sorun oluştu",
                                it.code,
                                ErrorModel.ErrorStatus.NOT_DEFINED
                            )
                        )
                    }
                } catch (e: HttpException) {
                    onResult.onError(apiErrorHandle?.traceErrorException(e)!!)
                }
            }
        }

    }
}


