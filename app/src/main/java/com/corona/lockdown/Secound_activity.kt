package com.corona.lockdown

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.secound_activity.*

class Secound_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.secound_activity)

        val bundle: Bundle? = intent.extras
        val msg1 = bundle!!.getString("user_frist_name")
        val msg2 = bundle!!.getString("user_secound_name")
        val msg3 = bundle!!.getString("user_mobile_no")
        tv_name.text = "welcome $msg1 $msg2"
        tv_no.text = "This is your mobile no :- $msg3"

        btn_send_data.setOnClickListener {
            val message = tv_name.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent,"send to :"))
        }

    }
}