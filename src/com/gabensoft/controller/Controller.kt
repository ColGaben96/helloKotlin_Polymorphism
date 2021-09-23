package com.gabensoft.controller

import com.gabensoft.model.VehicleContainer
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

    }
}

fun main() {
    Controller().console()
}