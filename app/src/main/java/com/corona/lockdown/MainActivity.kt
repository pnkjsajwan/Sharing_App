package com.corona.lockdown

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_show_toast.setOnClickListener {
            Log.w("MainActivity", "Button was clicked")
            Toast.makeText(this, "Welcome Pankaj Sajwan", Toast.LENGTH_SHORT).show()

        }
    }
}
