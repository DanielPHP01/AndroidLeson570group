package com.example.androidleson570group

import android.content.Context
import android.widget.Button
import android.widget.Toast

fun Context.showToastShort(message: String) {
    Toast.makeText(this, "Вы нажали на $message", Toast.LENGTH_LONG).show()
}

fun Context.showToastLong(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Button.setOnClickWithShowToast(context: Context,message: String) {
    this.setOnClickListener {
        context.showToastShort(message)
    }
}