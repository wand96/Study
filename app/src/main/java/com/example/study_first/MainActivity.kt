package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //반환값이 없는 함수의 정의
        fun printSum(x: Int, y: Int) {
            Log.d("fun", "x + y = ${x+y}")
        }

        printSum(10, 15)
    }
}