package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //프로퍼티 오버라이드
        open class BaseClass2 {
            open var opened: String = "I am"
        }
        class ChildClass2: BaseClass2() {
            override var opened: String = "You are"
        }
    }
}
