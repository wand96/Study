package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //오브젝트: 클래스와 다르게 앱 전체에 1개만 생성됨
        object Pig {
            var name: String = "Pinky"

            fun printName() {
                Log.d("class", "Pig의 이름은 ${name}입니다.")
            }
        }
        Pig.name = "Micky"
        Pig.printName()
    }
}