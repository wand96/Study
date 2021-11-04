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
        //it으로 사용되는 스코프 함수: let, also
        var list = mutableListOf("Scope", "Function")
        list.let { target -> //it을 target 등과 같이 다른 이름으로 변경가능합니다.
            val listSize = target.size //target으로 변경했기 때문에 멤버 접근은 target.속성입니다.
            println("리스트의 길이 let = $listSize")
        }

        list.also {
            val listSize = it.size
            println("리스트의 길이 also = $listSize")
        }
    }
}
