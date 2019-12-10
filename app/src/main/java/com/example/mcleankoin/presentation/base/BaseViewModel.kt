package com.example.mcleankoin.presentation.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel

open class BaseViewModel : ViewModel() {

    val scope = CoroutineScope(
        Job() + Dispatchers.Main
    )

    override fun onCleared() {
        super.onCleared()
        scope.cancel()
    }

}