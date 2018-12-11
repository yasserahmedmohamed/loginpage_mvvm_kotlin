package com.example.yasserahmed.firstkotlinapp.ViewModel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.yasserahmed.firstkotlinapp.Interface.LoginResultCallback


class LoginViewModelFactory(private val listener: LoginResultCallback) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(listener) as T
    }
}