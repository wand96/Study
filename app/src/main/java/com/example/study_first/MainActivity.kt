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
        //마지막 실행 코드를 반환하는 스코프 함수: let, run, with
        var list = mutableListOf("Scope", "Function")

        val lastCount = list.let {
            it.add("Run")
            it.count()
        }
        println("반환값 let = $lastCount")

        val lastItem = list.run {
            add("Run")
            get(size-1)
        }
        println("반환값 run = $lastItem")

        val lastItemWith = with(list) {
            add("with")
            get(size-1)
        }
        println("반환값 with = $lastItemWith")
    }
}
