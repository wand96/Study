package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.util.rangeTo
import androidx.core.widget.addTextChangedListener
import com.example.study_first.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.editText.addTextChangedListener {
            Log.d("EditText", "현재 입력된 값 = ${it.toString()}")
        }

    }
}
