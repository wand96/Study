package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //반환값과 입력값이 있는 함수의 정의
        fun square(x: Int): Int {
            return x * x
        }

        //반환값이 없는 함수의 정의
        fun printSum(x: Int, y: Int) {
            Log.d("fun", "x + y = ${x+y}")
        }

        //입력값 없이 반환값만 있는 함수의 정의
        fun getPi(): Double {
            return 3.14
        }

        //반환값과 입력값이 있는 함수의 호출
        var squareResult = square(30)
        Log.d("fun", "30의 제곱은 ${squareResult}입니다.")

        //반환값이 없는 함수의 호출
        printSum(3, 5)

        //입력값이 없는 함수의 호출
        val PI = getPi()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI}입니다.")

    }
}