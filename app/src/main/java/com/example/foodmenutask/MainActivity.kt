package com.example.foodmenutask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodmenutask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val menuItems = listOf(
            Food("بيتزا مارغريتا", "جبنة وطماطم", 20.0),
            Food("برجر دجاج", "برجر مع خس وصلصة", 25.0),
            Food("كباب", "لحم مشوي مع بهارات", 30.0)
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = FoodAdapter(menuItems)
    }
}