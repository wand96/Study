package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun newFunction(name: String, age: Int = 29, weight:Double = 65.5) {
            Log.d("fun", "name의 값은 ${name}입니다.")
            Log.d("fun", "age의 값은 ${age}입니다.")
            Log.d("fun", "weight의 값은 ${weight}입니다.")
        }

        newFunction("Hello")
    }
}