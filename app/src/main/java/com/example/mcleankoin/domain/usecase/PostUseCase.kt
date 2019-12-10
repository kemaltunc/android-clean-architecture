package com.example.mcleankoin.domain.usecase

import com.example.mcleankoin.data.model.BaseResponse
import com.example.mcleankoin.data.model.ErrorModel
import com.example.mcleankoin.data.model.Post
import com.example.mcleankoin.data.remote.ApiErrorHandle
import com.example.mcleankoin.domain.repository.PostRepository
import com.example.mcleankoin.domain.usecase.base.UseCase
import com.example.mcleankoin.domain.usecase.base.UseCaseResponse

class PostUseCase constructor(
    private val postRepository: PostRepository,
    apiErrorHandle: ApiErrorHandle
) : UseCase(apiErrorHandle) {

    suspend fun getPosts(useCaseResponse: UseCaseResponse<BaseResponse<List<Post>>>) {
        this.invoke(
            object : UseCaseResponse<BaseResponse<List<Post>>> {
                override fun onSuccess(result: BaseResponse<List<Post>>?) {
                    useCaseResponse.onSuccess(result)
                }

                override fun onError(errorModel: ErrorModel) {
                    useCaseResponse.onError(errorModel)
                }

            },
            postRepository.getPosts()
        )
    }


}
