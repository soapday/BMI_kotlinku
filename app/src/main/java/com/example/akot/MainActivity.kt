package com.example.akot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        info.visibility  = View.INVISIBLE
        btn.setOnClickListener{
            var berat : Double = berat.text.toString().toDouble()
            var tinggi : Double = tinggi.text.toString().toDouble()

            Log.i("msg","berat anda = ${berat}, berat ${berat} ")
        }

    }

}
