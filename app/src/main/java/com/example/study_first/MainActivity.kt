package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //오류가 날 수 밖에 없는 상황
        //one이 One의 형식으로 생성되었지만 생성자를 호출해서 저장되지는 않음
        //1>2가 false라서 비어있는 상태로 one변수는 null임 
        var one: One
        if (1 > 2) {
            one = One()
        }
        one.print()
    }
}

class One {
    fun print() {
        Log.d("null_safety", "can you call me?")
    }
}