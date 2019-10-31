package com.example.demo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        //val plain = findViewById<EditText>(R.id.editText2)
        val intent = getIntent()


        val imageUrlList = intent.getStringArrayListExtra("list")

        //plain.setText(intent.getStringExtra("word"))
        //val imageView = findViewById<ImageView>(R.id.ImageView)
        val recycler = findViewById<RecyclerView>(R.id.recyclerview).apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(baseContext,2)
            adapter = RecyclerAdapter(context,imageUrlList)

        }


        /*
        Glide.with(this)
            .load(imageUrlList.get(0))
            .into(imageView)
         */


        

    }


}
