package com.example.demo

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        /*
        val imageView = findViewById<ImageView>(R.id.ImageView)
        val intent = getIntent()
        val imageUrlList = intent.getIntegerArrayListExtra("list")
        Glide.with(this)
            .load(imageUrlList.get(0))
            .into(imageView)

         */
    }
}
