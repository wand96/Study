package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mutableList = mutableListOf("MON", "TUE", "WED")

        //동적으로 리스트의 공간 증가
        mutableList.add("THU")

        //get: 리스트에 입력된 값 사용하기
        var variable = mutableList.get(1)

        //set: 리스트값 수정하기
        mutableList.set(1, "수정할 값")

        //removeAt
        mutableList.removeAt(1)

        //빈 리스트 사용하기
        //빈 리스트 사용하기 - 생성
        var stringList = mutableListOf<String>()

        //빈 리스트 사용하기 - 입력
        stringList.add("월")
        stringList.add("화")

        //빈 리스트 사용하기 - 사용
        Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")

        //빈 리스트 사용하기 - 수정
        stringList.set(1, "수정된 값")

        //빈 리스트 사용하기 - 삭제
        stringList.removeAt(1)

       }

}