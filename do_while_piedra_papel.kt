package com.example.firstapp
import java.util.Random
import java.util.concurrent.atomic.AtomicInteger

class do_while_piedra_papel {
}
fun main() {
    println("Ingrese el número de vidas: ")
    val vidas = readLine()!!.toInt()

    val contador = AtomicInteger(0)

    do {
        println("Elige:\n1. Piedra\n2. Tijera\n3. Papel")
        val eleccion = readLine()!!.toInt()
        val nAleatorioMachine = Random().nextInt(3) + 1

        when {
            eleccion == nAleatorioMachine -> println("Empate")
            (eleccion == 1 && nAleatorioMachine == 2) ||
                    (eleccion == 2 && nAleatorioMachine == 3) ||
                    (eleccion == 3 && nAleatorioMachine == 1) -> println("Ganaste")
            else -> println("Perdiste")
        }
        contador.incrementAndGet()
    } while (contador.get() < vidas)
}