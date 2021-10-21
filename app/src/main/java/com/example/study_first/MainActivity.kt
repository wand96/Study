package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //Null 값 대체하기: ?:
        fun testElvis(str: String?): Int {
            //length 오른쪽에 ?:을 사용하면 null일 경우 ?: 오른쪽의 값이 반환됩니다.
            var resultNonNull: Int = str?.length?:0
            return resultNonNull
        }

    }
}
