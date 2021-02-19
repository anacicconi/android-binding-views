package com.anacicconi.simpleactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anacicconi.simpleactivity.databinding.ActivitySimpleBinding

class SimpleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivitySimpleBinding = ActivitySimpleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dataBinding.dataBindingText.text = "I use data binding"
        binding.viewBinding.viewBindingText.text = "I use view binding"
    }
}
