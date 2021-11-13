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

        binding.checkApple.setOnCheckedChangeListener { checkBox, isChecked ->
            if(isChecked) Log.d("CheckBox", "사과가 선택되었습니다.")
            else Log.d("CheckBox", "사과가 선택 해제되었습니다.")
        }

    }
}
