package com.example.yasserahmed.firstkotlinapp.Model

import  android.databinding.BaseObservable
import android.text.TextUtils
import android.util.Patterns
import java.util.regex.Pattern

class User(private var username: String, private var password: String) : BaseObservable() {
    fun getpasssword(): String {
        return this.password
    }

    fun getusername(): String {
        return this.username
    }

    fun setpassword(password: String) {
        this.password = password
    }

    fun setusername(username: String) {
        this.username = username
    }

    fun isvalidData(): errorcodes {

        if (TextUtils.isEmpty(password))
            return errorcodes.passwordempty
        else if (TextUtils.isEmpty(username))
            return errorcodes.username_empty
        else if (password.length < 5)
            return errorcodes.invalid_password_length_less5
        else if (!Patterns.EMAIL_ADDRESS.matcher(username).matches())

            return errorcodes.username_not_in_format
        else
            return errorcodes.valid
    }

}
