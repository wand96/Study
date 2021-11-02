package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //lazy
        //lazy는 읽기 전용 변수 val을 사용하는 지연 초기화 입니다.
        class Person{
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

        class Company {
            val person: Person by lazy{Person()}
            init {
                //lazy는 선언 시에 초기화를 하기 때문에 초기화 과정이 필요 없습니다.
            }
            fun process() {
                print("person의 이름은 ${person.name}")
            }
        }
    }
}
