package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //클래스: 프로퍼티 1개, 메서드 1개
        class Pig {
            var name: String = "Pinky"
            fun printName() {
                Log.d("class", "Pig의 이름은 ${name}입니다.")
            }
        }

        //Pig클래스를 생성자로 인스턴스화 해서 변수에 담음
        var pig = Pig()

        //인스턴스가 담긴 pig 변수로 프로퍼티와 메서드를 사용
        pig.name = "Pooh"
        pig.printName()
    }
}