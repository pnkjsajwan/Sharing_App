package com.corona.lockdown.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.corona.lockdown.adaptors.HobbiesAdaptor
import com.corona.lockdown.R
import com.corona.lockdown.models.Supplier
import kotlinx.android.synthetic.main.hobbies_activity.*

class HobbiesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hobbies_activity)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        rv_hobbies.layoutManager = layoutManager

        val adaptor = HobbiesAdaptor(
            this,
            Supplier.hobbies
        )
        rv_hobbies.adapter = adaptor
    }

}
