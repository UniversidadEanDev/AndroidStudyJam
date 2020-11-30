package ean.programacionavanzada.tallerpilas

import ean.collections.ArrayList
import ean.collections.ArrayStack
import ean.collections.IList
import ean.collections.IStack
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class TallerPilasKtTest {
    @Test
    fun pruebamayor() {
        var pila: IStack<Int> = ArrayStack()

        pila.push(414)
        pila.push(-30)
        pila.push(8)
        pila.push(35)
        pila.push(9)
        pila.push(61117)

        var mayor2 = mayorDeDosCifras(pila)
        assertEquals(35, mayor2)
        assertEquals(414, pila.bottom())
        guardarEnElFondo(pila, 1500)
        assertEquals(1500, pila.bottom())
    }

    @Test
    fun pruebapalindrome() {
        var palabra = palindrome("arañara")
        assertEquals(true, palabra)
    }

    @Test
    fun pilasiguales() {
        var pila: IStack<Int> = ArrayStack()

        pila.push(414)
        pila.push(40)
        pila.push(8)
        pila.push(35)
        pila.push(9)
        pila.push(61117)

        var pila2: IStack<Int> = ArrayStack()

        pila2.push(414)
        pila2.push(40)
        pila2.push(8)
        pila2.push(35)
        pila2.push(9)
        pila2.push(61117)

        var fajardios = igulesPilas(pila, pila2)
        assertEquals(true, fajardios)


    }

    @Test
    fun invertirlistas() {
        var lista: IList<Int> = ArrayList()
        lista.add(12)
        lista.add(13)
        lista.add(14)
        lista.add(15)
        lista.add(16)
        lista.add(17)
        println(lista)
        println(invertirLista(lista))
    }
    @Test
    fun fondo(){
        var pila: IStack<Int> = ArrayStack()
        pila.push(414)
        pila.push(40)
        pila.push(8)
        pila.push(35)
        pila.push(9)
        pila.push(61117)
        var fondo= guardarEnElFondo(pila,90)
        println(pila)



    }

    @Test
    fun polacos() {
        var lista: IList<String> = ArrayList()
        lista.add("4")
        lista.add("5")
        lista.add("*")
        lista.add("2")
        lista.add("+")
        lista.add("5")
        lista.add("+")
        var navadios = evaluarPostfija(lista)
        assertEquals(27, navadios)
    }
}