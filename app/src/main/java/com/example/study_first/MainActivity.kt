package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //2.companion object 안의 코드 사용하기
        Pig.name = "Linda"
        Pig.printName()

        //3. companion object 밖의 코드 사용하기
        val cutePig = Pig()
        cutePig.walk()
    }
}

//1. 컴패니언 오브젝트(companion object): companion object 블록으로 감싸주면 생성 과정없이 오브젝트처럼 사용가능
class Pig {
    companion object {
        var name: String = "None"
        fun printName() {
            Log.d("class", "Pig의 이름은 ${name}입니다.")
        }
    }
    fun walk() {
        Log.d("class", "Pig가 걸어갑니다.")
    }
}