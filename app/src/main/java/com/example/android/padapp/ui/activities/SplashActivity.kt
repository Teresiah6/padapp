package com.example.android.padapp.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.padapp.R
import com.example.android.padapp.databinding.ActivitySplashBinding
import com.example.android.padapp.util.loadAnimation

class SplashActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**
         * Inflate layout
         * */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        val splashAnimator = loadAnimation(this@SplashActivity, R.anim.splash_animation)

        /**
         * Instead of repeating binding.view_name
         * use apply
         * */
        binding.apply {
            splashImage.startAnimation(splashAnimator)
            splashText.startAnimation(splashAnimator)
        }

        //running on thread
        val timer = object : Thread() {
            override fun run() {
                try {
                    sleep(4000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
                }
            }
        }
        timer.start()

    }
}
