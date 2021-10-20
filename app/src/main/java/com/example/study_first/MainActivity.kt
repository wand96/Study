package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //추상화: walk는 걷다가 맞지만 move는 상속받을 자식 클래스의 속성에 따라 바뀜
        abstract class Animal {
            fun walk() {
                Log.d("abstract", "걷습니다.")
            }
            abstract fun move()
        }

        class Bird: Animal() {
            override fun move() {
                Log.d("abstract", "날아서 이동합니다.")
            }
        }
    }
}
