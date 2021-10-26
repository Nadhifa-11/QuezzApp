package com.nadhifa.quezzapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.R
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.nadhifa.quezzapp.R.layout.activity_main)

        drawerLayout = findViewById(com.nadhifa.quezzapp.R.id.drawer_layout)

        val navController = this.findNavController(com.nadhifa.quezzapp.R.id.NavHostFragment)
        val navView: NavigationView = findViewById(com.nadhifa.quezzapp.R.id.nav_view)
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        NavigationUI.setupWithNavController(navView, navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(com.nadhifa.quezzapp.R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(com.nadhifa.quezzapp.R.id.NavHostFragment)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}