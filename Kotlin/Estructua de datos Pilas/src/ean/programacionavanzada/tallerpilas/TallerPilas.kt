/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Proyecto EAN Kotlin Collections
 * Autor: Universidad EAN 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.tallerpilas

import ean.collections.ArrayList
import ean.collections.ArrayStack
import ean.collections.IList
import ean.collections.IStack
import ean.collections.LinkedStack
import kotlin.math.abs

/**
 * Obtener el fondo de la pila
 */
fun <T> IStack<T>.bottom(): T {
    require(!this.isEmpty)

    var c = this.peek()
    val p = this.copy()

    while (!p.isEmpty) {
        c = p.peek()
        p.pop()
    }

    return c
}


/**
 * Función para determinar cuál es el número más grande de dos cifras que hay
 * en una pila de números. Si no existe  ningún número de dos cifras, retorne
 * null
 */
fun mayorDeDosCifras(pila: IStack<Int>): Int? {
    var copia= pila.copy()
    var mayor= Int.MIN_VALUE

    while (!copia.isEmpty){
        var x=copia.peek()
        if(abs(x) in 10..99 && x>mayor){
            mayor=x
        }
        copia.pop()
    }
    return if(mayor== Int.MIN_VALUE) null else mayor
}

/**
 * Hacer una función externa que permita guardar un elemento en el fondo
 * de la pila. GEnérica
 */
fun <T> guardarEnElFondo(p: IStack<T>, elem: T): Unit {
    var aux=LinkedStack<T>()
    while(!p.isEmpty){
        var top=p.peek()
        aux.push(top)
        p.pop()
    }
    p.push(elem)
    while (!aux.isEmpty){
        var toppo=aux.peek()
        p.push(toppo)
        aux.pop()
    }
}

/**
 * Usar una pila de letras para Determinar si una frase es palindrome o no
 */
fun palindrome(frase: String): Boolean {
    var aux=LinkedStack<Char>()
    for (i in frase){
        aux.push(i.toLowerCase())
    }
    var aux2=aux.copy()
    var aux3=LinkedStack<Char>()
    while ( !aux2.isEmpty ){
        var p=aux2.peek()
        aux3.push(p)
        aux2.pop()
    }
    return igulesPilas(aux,aux3)
}

/**
 * Usar una pila para retornar una lista invertida de otra lista
 */
fun <T> invertirLista(unaLista: IList<T>): IList<T> {
    var aux = ArrayStack<T>()
    var lista2 = ArrayList<T>()
    for ( i in unaLista ){
        aux.push(i)
    }
    while ( !aux.isEmpty ){
        var x = aux.peek()
        lista2.add(x)
        aux.pop()
    }
    return lista2
}

/**
 * Determinar si dos pilas son iguales
 */
fun <T> igulesPilas(pila1: IStack<T>, pila2: IStack<T>): Boolean {
    var c1=pila1.copy()
    var c2=pila2.copy()
    while (!c1.isEmpty && !c2.isEmpty){
        if (c1.peek()!=c2.peek()){
            return false
        }
        c1.pop()
        c2.pop()
    }
    return true
}
//tamaño
fun<T> tamaño(pila1: IStack<T>):Int{
    var p=pila1.copy()
    var c=0
    while(!p.isEmpty){
        p.pop()
        c++
    }
    return c
}
//penultimo
fun <T> penultimo(p: IStack<T>):T{
    var c1=p.copy()
   for (x in tamaño(p)-1..tamaño(p)-2){
       p.pop()
    }
    return p.peek()
}

/**
 * Evaluar una expresión en notación postfija. Cada elemento de la expresión es un elemento de la lista
 */
fun evaluarPostfija(expresion: IList<String>): Int {
    var p=LinkedStack<Int>()


    for (i in expresion){

        when (i) {
            "+" -> {

                var x=p.peek()
                if (tamaño(p)>2){
                    var y= penultimo(p)
                    var z= x+y
                    while(!p.isEmpty){
                        p.pop()
                    }
                    p.push(z)
                }
                else{
                    var y = p.bottom()
                    var z= x+y
                    while(!p.isEmpty){
                        p.pop()
                    }
                    p.push(z)
                }

            }
            "-" -> {
                var x=p.peek()
                var y=p.bottom()
                var z= y-x
                while(!p.isEmpty){
                    p.pop()
                }
                p.push(z)
            }
            "*" -> {
                var x=p.peek()
                var y=p.bottom()
                var z= y*x
                while(!p.isEmpty){
                    p.pop()
                }
                p.push(z)
            }
            "/" -> {
                var x=p.peek()
                var y=p.bottom()
                var z= y/x
                while(!p.isEmpty){
                    p.pop()
                }
                p.push(z)
            }
            "%" -> {
                var x=p.peek()
                var y=p.bottom()
                var z= y%x
                while(!p.isEmpty){
                    p.pop()
                }
                p.push(z)
            }

            else->{
                p.push(i.toInt())
            }
        }
    }
    return (p.peek())
}


