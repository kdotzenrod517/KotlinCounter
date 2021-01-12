package com.kdotz.kotlinfun

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    fun count(view: View) {
       textView.text = (Integer.valueOf(textView.text.toString()) + 1).toString()
    }

    fun reset(view: View) {
        textView.text = "0"
    }
}
