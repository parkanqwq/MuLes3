package com.kalabukhov.app.mules3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kalabukhov.app.mules3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigationShits()
    }

    private fun navigationShits() {
        binding.bottomNavigationMenu.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_1 -> {
                    binding.fragmentContainer.setBackgroundColor(Color.RED)
                    true
                }
                R.id.page_2 -> {
                    binding.fragmentContainer.setBackgroundColor(Color.BLUE)
                    true
                }
                else -> {
                    binding.fragmentContainer.setBackgroundColor(Color.RED)
                    true
                }
            }
        }
    }
}