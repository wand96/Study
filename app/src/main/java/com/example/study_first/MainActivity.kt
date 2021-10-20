package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //데이터 클래스: 간단한 값의 저장 용도로 사용
        //*생성자 파라미터 앞에 입력하는 var(또는 val) 키워드는 생략할 수 없음

        //정의 - 주로 코드 블록(클래스 스코프)을 사용하지 않고 간단하게 작성합니다.
        data class UserData(val name: String, var age: Int)
        //생성 - 일반 class의 생성자 함수를 호출하는 것과 동일합니다.
        var userData = UserData("Michael", 21)

        //name은 val로 선언되었기 때문에 변경 불가능
        //age는 var로 선언되었기 때문에 변경 가능
        userData.age = 18
    }
}
