package com.example.yasserahmed.firstkotlinapp.View

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.yasserahmed.firstkotlinapp.Interface.LoginResultCallback
import com.example.yasserahmed.firstkotlinapp.Model.errorcodes
import com.example.yasserahmed.firstkotlinapp.R
import com.example.yasserahmed.firstkotlinapp.ViewModel.LoginViewModel
import com.example.yasserahmed.firstkotlinapp.ViewModel.LoginViewModelFactory
import com.example.yasserahmed.firstkotlinapp.databinding.ActivityMainBinding
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity(), LoginResultCallback {
    override fun Loginstatus(status: String) {
        Toasty.success(this, "test", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val asdd = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        asdd.viewModel = ViewModelProviders
            .of(this, LoginViewModelFactory(this))
            .get(LoginViewModel::class.java)

    }
}
