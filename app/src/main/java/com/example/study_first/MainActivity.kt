package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //함수의 파라미터가 null을 허용하려면 해당 파라미터에 대해서 null 체크를 먼저 해야함
        fun nullParameter(str: String?) {
            if(str != null) {
                var length2 = str.length
            }
        }
    }
}
