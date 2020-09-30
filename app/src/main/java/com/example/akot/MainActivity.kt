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
        btn.setOnClickListener {
            var berat: Double = berat.text.toString().toDouble()
            var tinggi: Double = tinggi.text.toString().toDouble()


            var bmi : Double = (berat*703)/(berat*berat)
            Log.i("msg", "+++berat is = ${berat}, tinggi is ${berat}, BMI is ${bmi} ")

        }

    }
}
//
//bmi = b*703/hsqr
//
//UndeWeight = <18.5
//NormalWeight = 18.5 - 24.9
//OverWeight = 25 - 29.9
//Obesity = BMI of 30 or greater