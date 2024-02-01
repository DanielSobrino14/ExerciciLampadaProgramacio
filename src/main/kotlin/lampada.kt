package models

class Lampara {
    private var encendida: Boolean = false
    private var color: String = "blanco"
    private var intensidad: Int = 0
    internal var identificador: String = ""

    constructor(encendida: Boolean, identificador: String, intensidad: Int, color: String) {
        this.encendida = encendida
        this.identificador = identificador
        this.color = color
        this.intensidad = intensidad
    }

    fun encendre() {
        encendida = true
    }

    fun apagar() {
        encendida = false
    }
    fun canviarColor(nuevoColor: String) {
        color = nuevoColor

    }
    fun canviarIntensitat(nuevaIntensidad: Int) {
        if (nuevaIntensidad in 0..5) {
            intensidad = nuevaIntensidad
        } else {
            println("Fallo: La intensidad debe estar entre 0 y 5.")
        }
    }
    override fun toString(): String {
        return ("Estado: ${if (encendida) "Encendida" else "Apagada"} -> Color: $color -> Intensidad: $intensidad")
    }
}