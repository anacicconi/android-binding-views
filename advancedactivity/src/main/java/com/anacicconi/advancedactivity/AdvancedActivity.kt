package com.anacicconi.advancedactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.anacicconi.advancedactivity.databinding.ActivityAdvancedBinding

class AdvancedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityAdvancedBinding = DataBindingUtil.setContentView(this, R.layout.activity_advanced)

        binding.dataBinding.dataBindingText.text = "I use data binding"
        binding.viewBinding.viewBindingText.text = "I use view binding"
    }
}
