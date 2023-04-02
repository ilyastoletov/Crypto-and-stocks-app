package com.appninjas.cryptoandstocks.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.appninjas.cryptoandstocks.R
import com.appninjas.cryptoandstocks.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        val btNav: BottomNavigationView = binding.bottomNavView
        val navControllerFragment = supportFragmentManager.findFragmentById(R.id.nav_controller_fragment) as NavHostFragment
        val navController = navControllerFragment.navController
        val appBarConf = AppBarConfiguration(setOf(R.id.navigation_crypto, R.id.navigation_stocks))

        setupActionBarWithNavController(navController, appBarConf)
        btNav.setupWithNavController(navController)
    }

}