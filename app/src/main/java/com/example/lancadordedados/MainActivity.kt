package com.example.lancadordedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado1 = findViewById<ImageView>(R.id.dado1)
        val dado2 = findViewById<ImageView>(R.id.dado2)
        val jogar = findViewById<Button>(R.id.button)

        val images = listOf(R.drawable.dice_1,R.drawable.dice_2,
            R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)

        jogar.setOnClickListener {
            dado1.setImageResource(images.random())
            dado2.setImageResource(images.random())
        }
    }

   private fun randomnum() : Int{
       val rand = (0..5).random()
       return rand
   }
}

