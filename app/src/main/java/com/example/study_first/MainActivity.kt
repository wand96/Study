  package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import androidx.core.util.rangeTo
import androidx.core.widget.addTextChangedListener
import com.example.study_first.databinding.ActivityMainBinding
import kotlin.concurrent.thread

  class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        thread(start=true) {        //서브스레드
            Thread.sleep(3000)
            runOnUiThread {
                showProgress(false)     //메인스레드
            }
        }
    }

    fun showProgress(show: Boolean) {
        binding.progressLayout.visibility = if(show) View.VISIBLE else View.GONE
//
//        if(show) {
//            binding.progressLayout.visibility = View.VISIBLE
//        } else {
//            binding.progressLayout.visibility = View.GONE
//        }

    }
}
  //thread() 함수는 서브스레드임 -> 그래서 서브스레드에서 3초가 멈춘 후에
  // runOnUiThread를 이용 메인 메서드에서 showProgress를 이용 showProgress함수를 false로 해주면 메인 은 살아있음