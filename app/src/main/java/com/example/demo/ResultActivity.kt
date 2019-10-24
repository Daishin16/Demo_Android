package com.example.demo

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val plain = findViewById<EditText>(R.id.editText2)
        val intent = getIntent()

        plain.setText(intent.getStringExtra("word"))
        val imageView = findViewById<ImageView>(R.id.ImageView)
        val imageUrlList = intent.getStringArrayListExtra("list")

        Glide.with(this)
            .load(imageUrlList.get(0))
            .into(imageView)

    }
}
