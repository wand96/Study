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
        //호출 대상인 this 자체를 반환하는 스코프 함수: apply, also
        var list = mutableListOf("Scope", "Function")

        val afterApply = list.apply {
            add("Apply")
            count()
        }
        println("반환값 apply = $afterApply")

        val afterAlso = list.also {
            it.add("Also")
            it.count()
        }
        println("반환값 also = $afterAlso")
    }
}
