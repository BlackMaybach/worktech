package com.example.worchtech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var editText : EditText
    lateinit var sendBtn : Button
    lateinit var logo1 : ImageView
    lateinit var logo2 : ImageView
    lateinit var logo3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        sendBtn = findViewById(R.id.sendBtn)

        sendBtn.setOnClickListener {

            val editText = editText.text.toString()
            getImg(editText)

        }

    }
    private fun getImg(number: String) {
        when(number) {
            "1" -> {
                sendImg(R.drawable.logo1)
            }
            "2" -> {
                sendImg(R.drawable.logo2)
            }
            "3" -> {
                sendImg(R.drawable.logo3)
            }
            else -> {
                sendImg(R.drawable.pngegg)
            }
        }
    }

    fun sendImg(image : Int ) {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("img1", (image))
        startActivity(intent)
    }
}
