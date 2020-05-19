package com.corona.lockdown

import android.content.Context
import android.widget.Toast
//we'll use this function as a behalf of Toast function again and again and Context class is a super class of activity class
fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}