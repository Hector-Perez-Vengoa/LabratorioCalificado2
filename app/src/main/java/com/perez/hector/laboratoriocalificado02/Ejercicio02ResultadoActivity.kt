package com.perez.hector.laboratoriocalificado02
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.perez.hector.laboratoriocalificado02.databinding.ActivityEjercicio02ResultadoBinding

class Ejercicio02ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02ResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02ResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener datos del Intent
        val nombre = intent.getStringExtra("nombre")
        val numero = intent.getStringExtra("numero")
        val productos = intent.getStringExtra("productos")
        val direccion = intent.getStringExtra("direccion")
        val ciudad = intent.getStringExtra("ciudad")

        // Mostrar datos en los TextViews
        binding.tvNombreCliente.text = nombre
        binding.tvNumeroCliente.text = numero
        binding.tvProductos.text = productos
        binding.tvUbicacion.text = "$direccion, $ciudad"

        // Botón Llamar: mostrar mensaje con info
        binding.btnLlamar.setOnClickListener {
            Toast.makeText(this, "Llamando a $nombre, teléfono: $numero", Toast.LENGTH_LONG).show()
        }

        // Botón WhatsApp: mensaje personalizado
        binding.btnWsp.setOnClickListener {
            Toast.makeText(this, "Hola $nombre. Tus productos: $productos están en camino a la dirección: $direccion", Toast.LENGTH_LONG).show()
        }

        // Botón Maps: mostrar mensaje con ubicación
        binding.btnMaps.setOnClickListener {
            Toast.makeText(this, "Ubicación: $direccion, $ciudad", Toast.LENGTH_LONG).show()
        }
    }
}
