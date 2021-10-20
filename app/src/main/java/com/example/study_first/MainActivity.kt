package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //부모 클래스의 프로퍼티와 메서드 사용하기
        open class Parent {
            var hello: String = "안녕하세요."
            fun sayHello() {
                Log.d("inheritance", "${hello}")
            }
        }

        class Child: Parent() {
            fun myHello() {
                hello = "Hello!"
                sayHello()
            }
        }

        val a = Parent()
        val b = Child()

        a.sayHello()
        b.myHello()
    }
}
