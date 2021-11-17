  package com.example.study_first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.SeekBar
import android.widget.Toast
import androidx.core.util.rangeTo
import androidx.core.widget.addTextChangedListener
import com.example.study_first.databinding.ActivityMainBinding
import kotlin.concurrent.thread

  class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this, SubActivity::class.java)
        intent.putExtra("from1", "Hello Bundle")
        intent.putExtra("from2", 2021)

        binding.btnStart.setOnClickListener { startActivityForResult(intent, 99) }
//        메인 액티비티에서 서브 액티비티를 호출한 후 값을 돌려받고 싶을 때는 startActivity()가 아니라 startActivityForResult()메서드를 사용해야한다
//        startActivityForResult()메서드의 두번째 파라미터는 서브 액티비티를 호출하는 버튼이 여러 개 있을 때 어떤 버튼에서 호출된 거인지를 구분하는 용도

    }

      override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
          super.onActivityResult(requestCode, resultCode, data)

          if (resultCode == RESULT_OK) {
              when (requestCode) {
                  99 -> {
                      val message = data?.getStringExtra("returnValue")
                      Toast.makeText(this, message, Toast.LENGTH_LONG).show()
                  }
              }
          }
      }
  }