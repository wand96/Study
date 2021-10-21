package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //함수의 리턴 타입에도 물음표를 붙여서 null 허용 여부를 설정할 수 있습니다.
        fun nullReturn(): String? {
            return null
        }
    }
}
