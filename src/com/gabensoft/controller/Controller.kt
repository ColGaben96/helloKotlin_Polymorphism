package com.gabensoft.controller

import com.gabensoft.model.VehicleContainer
import com.gabensoft.model.utils.FuelType
import java.util.*

class Controller {
    private val model: VehicleContainer = VehicleContainer()
    private val sc: Scanner = Scanner(System.`in`)

    fun console() {
        var active = true
        while (active) {
            try {
                print("Ingresa una opcion: ")
                when (sc.nextLine()) {
                    "0" -> active = false
                    "1" -> help()
                    else -> println("Ingresa una opción válida")
                }
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }

    fun help() {
        println("""
            Opción  Descripcion
            0       Salir
            1       Muestra esta ayuda
            2       Crear una persona
            3       Buscar x nombre
            4       Buscar x apellido
            5       Actualizar
            6       Eliminar
        """.trimIndent())
    }

    fun create() {
        model.createBicycle(3, "NO", 1, 0, FuelType.Manual)
    }
}

fun main() {
    Controller().create()
}