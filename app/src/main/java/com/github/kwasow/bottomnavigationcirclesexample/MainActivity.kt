package com.github.kwasow.bottomnavigationcirclesexample

import android.graphics.Color
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat
import com.github.kwasow.bottomnavigationcircles.BottomNavigationCircles
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val container = findViewById<RelativeLayout>(R.id.mainConatiner)

        val bottomNavigation = findViewById<BottomNavigationCircles>(R.id.bottomNavigation)
        bottomNavigation.circleColor = Color.BLUE

        bottomNavigation.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_1 -> { container.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.white)) }
                R.id.action_2 -> { container.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.teal_700)) }
                R.id.action_3 -> { container.setBackgroundColor(ContextCompat.getColor(applicationContext,R.color.black)) }
            }
            true
        })


        bottomNavigation.selectedItemId = R.id.action_2

        // bottomNavigation.backgroundShape = BottomNavigationCircles.Shape.RoundedRectangle
    }
}
