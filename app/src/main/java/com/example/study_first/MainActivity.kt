package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var students = IntArray(10)
        var longArray = LongArray(10)
        var CharArray = CharArray(10)
        var FloatArray = FloatArray(10)
        var DoubleArray = DoubleArray(10)

        var intArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)

        var stringArray = Array(10, {item->""})
        var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        students[0] = 90
        students[1] = 91
        students[2] = 92
        students[3] = 93
        students[4] = 94

        students.set(5, 95)
        students.set(6, 96)
        students.set(7, 97)
        students.set(8, 98)
        students.set(9, 99)

        intArray[6] = 137
        intArray.set(9, 200)

        var seventhValue = intArray[6]
        Log.d("Array", "여덟 번째 intARray의 값은 ${seventhValue}입니다.")
        var tenthValue = intArray.get(9)
        Log.d("Array", "열 번째 intARray의 값은 ${tenthValue}입니다.")

    }