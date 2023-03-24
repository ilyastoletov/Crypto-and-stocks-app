package com.appninjas.cryptoandstocks.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appninjas.cryptoandstocks.R
import com.appninjas.cryptoandstocks.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        val btNavView: BottomNavigationView = binding.bottomNavView

    }

}