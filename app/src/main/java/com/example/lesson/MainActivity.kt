package com.example.lesson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson.databinding.ActivityMainBinding


class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            binding.drawerLayout.openDrawer(binding.nav)
        }

        binding.nav.setNavigationItemSelectedListener { item ->
            binding.drawerLayout.closeDrawer(binding.nav)
            when (item.itemId) {
                R.id.first -> {
                    binding.name.text = item.title
                    binding.email.text = "first_user@gmail.com"
                    true
                }
                R.id.second -> {
                    binding.name.text = item.title
                    binding.email.text = "second_user@gmail.com"

                    true
                }
                R.id.third -> {
                    binding.name.text = item.title
                    binding.email.text = "third_user@gmail.com"

                    true
                }
                R.id.fourth -> {
                    binding.name.text = item.title
                    binding.email.text = "fourth_user@gmail.com"

                    true
                }
                R.id.fifth -> {
                    binding.name.text = item.title
                    binding.email.text = "fifth_user@gmail.com"

                    true
                }
                else -> {
                    false
                }
            }
        }
    }
}