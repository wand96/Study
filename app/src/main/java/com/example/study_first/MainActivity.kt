package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //안전한 호출: ?.
        //변수 다음에 ?.을 사용하면 해당 변수가 null일 경우 ?.을 사용해서 null 체크를 좀 더 간결하게 사용 가능
        fun testSafeCall(str: String?): Int? {
            //str이 null이면 length를 체크하지 않고 null을 반환합니다.
            var resultNull: Int? = str?.length

            return resultNull;
        }
    }
}
