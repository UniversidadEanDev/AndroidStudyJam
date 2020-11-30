package ean.taller

import ean.collections.ArrayQueue
import ean.collections.IQueue

data class Edificio(var torre:Int,var pisos:Int,var aptos:Int)
class conjunto{
    var nombre=""
    val torres:IQueue<Edificio> = ArrayQueue()
    constructor()
    constructor(nom:String){
        nombre=nom
    }
    //construir una torre:recibe un edificio y lo agrega al final de la cola
    fun construirEdificio(edificio:Edificio){
        torres.enqueue(edificio)
    }
    //determinar el numero de edificios que tiene el conjunto
    fun numEdificios():Int{
        val copia=torres.copy()
        var c=0
        while(!copia.isEmpty){
            c++
            copia.dequeue()
        }
        return c
    }
    //Determinar el edificio mal alto del conjunto.retorne lull si no hay
    fun EdificiomasAlto():Edificio?{
        if(torres.isEmpty){
            return null
        }
        var e=torres.front
        var copia=torres.copy()
        while(!copia.isEmpty){
            val edif=copia.front
            if(edif.pisos>e.pisos){
                e=edif
            }
            copia.dequeue()

        }
        return e

    }
    //numero total de aptos que hay en el conjunto
    fun totalaptos():Int{
        if(torres.isEmpty){
            return 0
        }
        var e=0
        var copia=torres.copy()
        while (!copia.isEmpty){
            var b=copia.front
            e=e+b.aptos
            copia.dequeue()

        }
        return e



        }

    }


//funcion externa que determine el numero promedio de aptos por torre
//de un conjunto residencial
fun numpromediosaptos(Edificios:IQueue<Edificio>):Double{
    var c=Edificios.copy()
    var x=0
    var y=0
    while(!c.isEmpty){
        var d=c.front
        x=x+d.aptos
        c.dequeue()
        y++
    }
    return (x/y).toDouble()
}
