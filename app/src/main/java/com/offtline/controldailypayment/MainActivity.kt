package com.offtline.controldailypayment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
    }

    fun open_navigation(view: View) {
        Toast.makeText(applicationContext,"Hello",Toast.LENGTH_SHORT).show()
    }
}