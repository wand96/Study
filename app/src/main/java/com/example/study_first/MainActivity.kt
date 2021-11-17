  package com.example.study_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CompoundButton
import android.widget.SeekBar
import androidx.core.util.rangeTo
import androidx.core.widget.addTextChangedListener
import com.example.study_first.databinding.ActivityMainBinding
import kotlin.concurrent.thread

  class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            binding.textView.text = "$rating"
        }


    }

  }