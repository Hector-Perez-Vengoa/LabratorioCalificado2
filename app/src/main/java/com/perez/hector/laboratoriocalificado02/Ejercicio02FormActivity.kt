package com.perez.hector.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.perez.hector.laboratoriocalificado02.databinding.ActivityEjercicio02FormBinding

class Ejercicio02FormActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02FormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02FormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrar.setOnClickListener {
            if (validarInputs()) {
                val intent = Intent(this, Ejercicio02ResultadoActivity::class.java).apply {
                    putExtra("nombre", binding.etNombreCliente.text.toString().trim())
                    putExtra("numero", binding.etNumeroCliente.text.toString().trim())
                    putExtra("productos", binding.etProductos.text.toString().trim())
                    putExtra("direccion", binding.etDireccion.text.toString().trim())
                    putExtra("ciudad", binding.etCiudad.text.toString().trim())
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validarInputs(): Boolean {
        var valido = true

        if (binding.etNombreCliente.text.toString().trim().isEmpty()) {
            binding.etNombreCliente.error = "Ingrese nombre"
            valido = false
        }

        if (binding.etNumeroCliente.text.toString().trim().isEmpty()) {
            binding.etNumeroCliente.error = "Ingrese número"
            valido = false
        }

        if (binding.etProductos.text.toString().trim().isEmpty()) {
            binding.etProductos.error = "Ingrese productos"
            valido = false
        }

        if (binding.etDireccion.text.toString().trim().isEmpty()) {
            binding.etDireccion.error = "Ingrese dirección"
            valido = false
        }

        if (binding.etCiudad.text.toString().trim().isEmpty()) {
            binding.etCiudad.error = "Ingrese ciudad"
            valido = false
        }

        return valido
    }
}
