package com.example.lancadordedados


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lancadordedados.databinding.FragmentRegisterUserBinding


class RegisterUserFragment : Fragment() {

    private var binding : FragmentRegisterUserBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterUserBinding.inflate(inflater,container,false)

        val playername = binding?.etPlayername
        val button2 = binding?.button2

        button2?.setOnClickListener{
            val player = playername?.text.toString()
            /*
            var intent = Intent(this,MainActivityFragment::class.java)
            intent.putExtra("playername",player)
            startActivity(intent)
            */
        }

return binding?.root
}





}