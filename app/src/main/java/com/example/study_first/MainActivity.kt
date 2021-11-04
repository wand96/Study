package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //스코프함수
        //this로 사용되는 스코프 함수: run, apply, with
        var list = mutableListOf("Scope", "Function")
        list.apply {
            val listSize = size
            println("리스트의 길이 apply = $listSize")
        }

        with(list) {
            val listSize = size
            println("리스트의 길이 with = $listSize")
        }
    }
}
