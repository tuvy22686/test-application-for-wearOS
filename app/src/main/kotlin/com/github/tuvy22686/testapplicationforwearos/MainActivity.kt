package com.github.tuvy22686.testapplicationforwearos

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import androidx.databinding.DataBindingUtil
import com.github.tuvy22686.testapplicationforwearos.databinding.ActivityMainBinding

class MainActivity : WearableActivity() {

    private val binding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.text.text = "Hello World"

        // Enables Always-on
        setAmbientEnabled()
    }
}
