package com.example.lancadordedados

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.lancadordedados.databinding.FragmentMainActivityBinding
import com.example.lancadordedados.databinding.FragmentRegisterUserBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivityFragment : Fragment() {
    var binding : FragmentMainActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMainActivityBinding.inflate(inflater,container,false)

        val dado1 = binding?.dado1
        val dado2 = binding?.dado2
        val jogar = binding?.button
        val text2 = binding?.textView2
        val sharebutton = binding?.share

        val player = "playername"

        text2?.text = getString(R.string.message,player)


        val images = listOf(R.drawable.dice_1,R.drawable.dice_2,
            R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)

        jogar?.setOnClickListener {
            dado1?.setImageResource(images.random())
            dado2?.setImageResource(images.random())

            Log.i("CICLO DE VIDA", "ON CREATE")
        }

        sharebutton?.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.setPackage("com.whatsapp")
            intent.putExtra(Intent.EXTRA_TEXT,"Você é sortudo !")
            intent.type = "text/plain"

            activity?.packageManager?.run {
                if (intent.resolveActivity(this) != null){
                    startActivity(intent)
                }else{
                     Toast.makeText(context,"Você não tem o whatsapp intalado", Toast.LENGTH_LONG).show()
                }
            }

        }


        return binding?.root
    }

    private fun randomnum() : Int{
        val rand = (0..5).random()
        return rand
    }


}