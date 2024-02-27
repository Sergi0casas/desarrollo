package com.example.firstapp
import java.util.Random
import java.util.concurrent.atomic.AtomicInteger
class piedraPapeltiejera {
}

fun main(){
    println("Ingrese el numero de vidas: ")
    var vidas = readLine()!!.toInt()
    val contador = AtomicInteger(0)
    while(vidas > contador.toInt()) {
        println("Eliga:\n1.Piedra\n2.Tijera\n3.Papel")
        var eleccion = readLine()!!.toInt()
        var n_aleatorio_machine = Random()
        var num = n_aleatorio_machine.nextInt(3) + 1

        if (eleccion == num) {
            println("Empate")
        }
        if(eleccion == 1 && num == 2){
            println("Ganaste")
        }
        if(eleccion == 1 && num == 3){
            println("Perdiste")
        }
        if(eleccion == 2 && num == 1){
            println("Perdiste")
        }
        if(eleccion == 2 && num == 3){
            println("Ganaste")
        }
        if(eleccion == 3 && num == 1){
            println("Ganaste")
        }
        if(eleccion == 3 && num == 2) {
            println("Perdiste")
        }
        contador.incrementAndGet()
    }
}