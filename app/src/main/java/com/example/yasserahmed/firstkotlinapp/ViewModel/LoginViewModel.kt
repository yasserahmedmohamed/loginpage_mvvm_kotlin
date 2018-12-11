package com.example.yasserahmed.firstkotlinapp.ViewModel

import android.arch.lifecycle.ViewModel
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.example.yasserahmed.firstkotlinapp.Interface.LoginResultCallback
import com.example.yasserahmed.firstkotlinapp.Model.User


class LoginViewModel(private val listener: LoginResultCallback) : ViewModel() {
    private val user: User

    init {
       this.user = User("", "")
    }

    //set email to user after enter it
    val emailTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setusername(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

        }

    //set password to user after enter it
    val passwordTextWatcher: TextWatcher
        get() = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                user.setpassword(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

        }


    //fun will happen after button login clicked
    fun onloginclicked(v: View) {
        listener.Loginstatus("1")
    }

}