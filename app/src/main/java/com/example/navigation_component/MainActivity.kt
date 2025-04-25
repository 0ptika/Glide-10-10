package com.example.navigation_component

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.navigation_component.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : FragmentActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



         supportFragmentManager.findFragmentById(R.id.new_hots_fragment) as NavHostFragment





    }
}
