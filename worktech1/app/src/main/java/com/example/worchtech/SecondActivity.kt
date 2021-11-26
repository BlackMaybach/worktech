package com.example.worchtech

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

lateinit var takeImg: ImageView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        takeImg = findViewById(R.id.takeImg)

        val takeImgValue = intent.getIntExtra("img1", 0)

        takeImg.setImageResource(takeImgValue)
    }
}