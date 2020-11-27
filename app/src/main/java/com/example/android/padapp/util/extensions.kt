@file:Suppress("DEPRECATION")

package com.example.android.padapp.util

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import android.widget.Toast
import com.example.android.padapp.R
import com.google.android.material.snackbar.Snackbar

fun animate(context: Context, resId: Int): LayoutAnimationController {
    return AnimationUtils.loadLayoutAnimation(context, resId)
}

fun loadAnimation(context: Context, resId: Int): Animation {
    return AnimationUtils.loadAnimation(context, resId)
}

/**
* Toast message
* */
fun Context.toast(message: String) {
    Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).apply {
        show()
    }
}

/**
 * SnackBar
 * */
fun View.snackbar(msg: String) {
    Snackbar.make(this, msg, Snackbar.LENGTH_LONG).also { snackbar ->
        snackbar.setActionTextColor(Color.WHITE)
        snackbar.setBackgroundTint(resources.getColor(R.color.colorPrimary))
        snackbar.setAction("okay") {
            snackbar.dismiss()
        }
    }.show()
}