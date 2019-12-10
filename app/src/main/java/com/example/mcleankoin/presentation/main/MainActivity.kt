package com.example.mcleankoin.presentation.main

import android.os.Bundle
import com.example.mcleankoin.R
import com.example.mcleankoin.databinding.ActivityMainBinding
import com.example.mcleankoin.presentation.base.BaseActivity
import org.koin.android.architecture.ext.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getLayoutResId() = R.layout.activity_main

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainViewModel.getPosts()

        binding.lifecycleOwner = this


    }
}
