package com.corona.lockdown

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       button_show_toast.setOnClickListener {
//           Log.i("MainActivity","button is pressed")
//           Toast.makeText(this,"button is pressed",Toast.LENGTH_LONG).show()
//       }
        button_submit.setOnClickListener {
            val msg1: String = edit_view_user_frist_name.text.toString()
            val msg2: String = edit_view_user_last_name.text.toString()
            val msg3: String = edit_view_user_mobile_no.text.toString()
            Toast.makeText(this, "form fill sucessfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Secound_activity::class.java)
            intent.putExtra("user_frist_name", msg1)
            intent.putExtra("user_secound_name", msg2)
            intent.putExtra("user_mobile_no", msg3)
            startActivity(intent)
        }

    }
}
