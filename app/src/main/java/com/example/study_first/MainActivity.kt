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
        //let: 함수 영역 안에서 호출한 대상을 it으로 사용할 수 있습니다.
        var list = mutableListOf("Scope", "Function")
        list.let { //it -> 생략된 형태. it -> 대신에 target -> 등으로 변경 가능합니다.
            val listSize = it.size //모든 속성과 함수를 it.멤버로 사용할 수 있습니다.
            println("리스트의 길이 let = $listSize")
        }
    }
}
