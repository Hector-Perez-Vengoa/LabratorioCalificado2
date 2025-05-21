package com.perez.hector.laboratoriocalificado02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.perez.hector.laboratoriocalificado02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIrAEjercicio.setOnClickListener {
            val intent = Intent(this, Ejercicio01Activity::class.java)
            startActivity(intent)
        }
    }
}

