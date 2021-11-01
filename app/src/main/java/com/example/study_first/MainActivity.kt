package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        class Person {
            lateinit var name: String
            init {
                name = "Lionel"
            }
            fun process() {
                name.plus("Messi")
                print("이름의 길이 = ${name.length}")
                print("이름의 첫 글자 = ${name.substring(0,1)}")
            }
        }

    }
}
