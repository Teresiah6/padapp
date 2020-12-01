package com.example.android.padapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.android.padapp.R
import com.example.android.padapp.databinding.ActivityLoginBinding
import com.example.android.padapp.databinding.ActivitySplashBinding

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)




        startActivity(Intent(this@LoginActivity, SignupActivity::class.java))
        finish()


    }
}