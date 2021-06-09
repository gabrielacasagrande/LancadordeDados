package com.example.lancadordedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dado1 = findViewById<TextView>(R.id.text_dado1)
        val dado2 = findViewById<TextView>(R.id.text_dado2)
        val jogar = findViewById<Button>(R.id.button)

        jogar.setOnClickListener {
            dado1.text = randomnum().toString()
            dado2.text = randomnum().toString()
        }
    }

   private fun randomnum() : Int{
       val rand = (1..6).random()
       return rand
   }
}

