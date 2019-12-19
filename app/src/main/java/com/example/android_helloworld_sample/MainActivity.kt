package com.example.android_helloworld_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text_view2 = findViewById<TextView>(R.id.text_view_2)
        text_view2.text = "Hello World!"

    }
}
