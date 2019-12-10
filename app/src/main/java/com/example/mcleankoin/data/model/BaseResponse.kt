package com.example.mcleankoin.data.model

class BaseResponse<T> {

    var code: Int = 0
        private set
    var data: T? = null
        private set

    var error: String? = null
        private set

    fun setCode(code: Int): BaseResponse<T> {
        this.code = code
        return this
    }

    fun setData(data: T?): BaseResponse<T> {
        this.data = data
        return this
    }

    fun setError(error: String): BaseResponse<T> {
        this.error = error
        return this
    }

}

