package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //메서드 오버라이드
        open class BaseClass {
            open fun opened() {}
            fun notOpened() {}
        }

        class ChildClass: BaseClass() {
            override fun opened() {}
        }
    }
}
