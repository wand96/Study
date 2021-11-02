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
        //run: 스코프 함수 안에서 호출한 대상을 this로 사용할 수 있습니다.
        //클래스 내부의 함수를 사용하는 것과 동일한 효과이기 때문에 this는 생략하고 메서드나 프로퍼티를 바로 사용할 수 있다.
        var list = mutableListOf("Scope", "Function")
        list.run {
            val listSize = size
            println("리스트의 길이 run = $listSize")
        }

    }
}
