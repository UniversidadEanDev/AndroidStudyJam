package ean.taller

import ean.collections.ArrayQueue
import ean.collections.IQueue
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

internal class EdificioTest{
    @Test
fun prueba1(){
        var e=Edificio(1,10,30)
        println(e)
        assertEquals(10,e.pisos)
        var b=Edificio(1,10,30)
        assertTrue(b==e)
        assertFalse(b===e)
    }
    @Test
    fun prueba2(){
    var conj=conjunto("las margaritas")
    conj.construirEdificio(Edificio(1,10,20))
    conj.construirEdificio(Edificio(2,20,100))
    conj.construirEdificio(Edificio(3,15,300))
    conj.construirEdificio(Edificio(4,12,40))
    assertEquals(4,conj.numEdificios())
    var juancho=conj.EdificiomasAlto()
    assertEquals(2,juancho!!.torre)



}
    @Test
    fun prueba3() {
        var conj = conjunto("las margaritas")
        conj.construirEdificio(Edificio(1, 10, 20))
        conj.construirEdificio(Edificio(2, 20, 100))
        conj.construirEdificio(Edificio(3, 15, 300))
        conj.construirEdificio(Edificio(4, 12, 40))
        assertEquals(460, conj.totalaptos())
    }
    @Test
    fun prueba4() {
        var conj :IQueue<Edificio> = ArrayQueue()
        conj.enqueue(Edificio(1, 10, 20))
        conj.enqueue(Edificio(2, 20, 100))
        conj.enqueue(Edificio(3, 15, 300))
        conj.enqueue(Edificio(4, 12, 40))
        assertEquals(115.0, numpromediosaptos(conj))

    }





}