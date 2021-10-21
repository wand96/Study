package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //null값 허용하기: ?
        //코틀린에서 지정하는 기본 변수는 모두 null이 입력되지 않음
        //null값을 입력하기 위해서는 변수를 선언할 때 타입 뒤에 ?(Nullable)을 입력해야한다.

        var variable: String?
    }
}
