package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testStringExtension()
    }

    //String 익스텐션 테스트 하기
    fun testStringExtension() {
        var original = "Hello"
        var added = "Guys~"
        //plus 메서드를 사용해서 문자열을 더할 수 있습니다.
        Log.d("Extension", "added를 더한 값은 ${original.plus(added)}입니다.")
    }
}

fun String.plus(word: String): String {
    return this + word }