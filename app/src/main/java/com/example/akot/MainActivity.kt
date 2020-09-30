package com.example.akot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener{
//            mengambil nilai berat dari edit text dan mengubahnya ke bentuk meter
            val b = berat.text.toString().toFloat()/100
//            mengambul nilai tinggi dari edit text saja
            val t = tinggi.text.toString().toFloat()
//            menuliskan rumus untuk ditampilkan di hasil
            val has = b/(t*t)
            hasil.text = "%.2f".format(has)

        }
    }

}
