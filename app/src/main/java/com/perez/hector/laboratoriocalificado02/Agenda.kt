package com.perez.hector.laboratoriocalificado02

class Agenda {
    private val contactos = mutableListOf<Contacto>()

    fun agregarContacto(contacto: Contacto) {
        contactos.add(contacto)
        println("Contacto agregado: ${contacto.nombre}")
    }

    fun listarContactos() {
        if (contactos.isEmpty()) {
            println("No hay contactos en la agenda.")
        } else {
            println("Lista de contactos:")
            contactos.forEachIndexed { index, contacto ->
                println("${index + 1}. ${contacto.nombre} - Tel: ${contacto.telefono}")
            }
        }
    }

    fun buscarContacto(nombre: String) {
        val encontrados = contactos.filter { it.nombre.contains(nombre, ignoreCase = true) }
        if (encontrados.isEmpty()) {
            println("No se encontró ningún contacto con el nombre \"$nombre\"")
        } else {
            println("Contactos encontrados con \"$nombre\":")
            encontrados.forEach {
                println("- ${it.nombre} - Tel: ${it.telefono}")
            }
        }
    }
}

fun main() {
    val agenda = Agenda()
    while (true) {
        println("\n--- Agenda de Contactos ---")
        println("1. Agregar un contacto")
        println("2. Listar todos los contactos")
        println("3. Buscar un contacto por nombre")
        println("4. Salir")
        print("Selecciona una opción: ")

        when (readLine()?.trim()) {
            "1" -> {
                print("Nombre: ")
                val nombre = readLine()?.trim().orEmpty()
                print("Teléfono: ")
                val telefono = readLine()?.trim().orEmpty()

                if (nombre.isNotEmpty() && telefono.isNotEmpty()) {
                    agenda.agregarContacto(Contacto(nombre, telefono))
                } else {
                    println("Error: Todos los campos deben estar completos.")
                }
            }
            "2" -> {
                agenda.listarContactos()
            }
            "3" -> {
                print("Nombre a buscar: ")
                val nombreBuscado = readLine()?.trim().orEmpty()
                if (nombreBuscado.isNotEmpty()) {
                    agenda.buscarContacto(nombreBuscado)
                } else {
                    println("Error: Debes ingresar un nombre para buscar.")
                }
            }
            "4" -> {
                println("Saliendo de la agenda. ¡Hasta luego!")
                break
            }
            else -> {
                println("Opción no válida, intenta de nuevo.")
            }
        }
    }
}

