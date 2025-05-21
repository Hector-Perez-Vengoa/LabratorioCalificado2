package com.perez.hector.laboratoriocalificado02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.perez.hector.laboratoriocalificado02.databinding.ActivityEjercicio01aBinding

class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01aBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01aBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicialmente el view verde está oculto (por XML)

        binding.btnMostrar.setOnClickListener {
            binding.viewVerde.visibility = android.view.View.VISIBLE
        }

        binding.btnOcultar.setOnClickListener {
            binding.viewVerde.visibility = android.view.View.GONE
        }
    }
}
