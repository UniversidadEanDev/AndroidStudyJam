/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Pruebas del Taller Árboles Binarios
 * Fecha: 18 de abril de 2018
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.arbin

import ean.collections.BinTree
import ean.collections.IBinTree
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.*


/**
 * Clases con las pruebas del taller de árboles binarios
 */
internal class PruebasTallerArbin {
    /**
     * Objetos que usaremos en el desarrollo de las pruebas
     */
    lateinit var arbol1: IBinTree<String>
    lateinit var arbol2: IBinTree<Int>
    lateinit var arbol3: IBinTree<Materia>

    /**
     * Configurador. Crea los dos árboles binarios
     */
    @BeforeEach
    fun crearArboles() {
        // Arbol de String: vacio
        val vacioStr: IBinTree<String> = BinTree()

        // Árbol de letras
        arbol1 = BinTree("A",
                BinTree("B",
                        BinTree("D",
                                BinTree("G"),
                                vacioStr),
                        BinTree("E",
                                BinTree("H"),
                                BinTree("I"))),
                BinTree("C",
                        vacioStr,
                        BinTree("F",
                                BinTree("J",
                                        vacioStr,
                                        BinTree("K")),
                                vacioStr)))

        // Arbol de números: vacío
        val vacioInt: IBinTree<Int> = BinTree()

        // Árbol de números
        arbol2 = BinTree(39,
                BinTree(22,
                        BinTree(17,
                                BinTree(3,
                                        vacioInt,
                                        BinTree(10)),
                                BinTree(20)),
                        BinTree(29,
                                BinTree(25),
                                vacioInt)),
                BinTree(71,
                        BinTree(48,
                                BinTree(46),
                                vacioInt),
                        BinTree(99,
                                BinTree(82),
                                BinTree(100))))

        // Arbol vacio de Materias
        val vacioMat: IBinTree<Materia> = BinTree()

        // Creamos el tercer árbol
        arbol3 =
                BinTree(Materia(20, 45.0),
                        BinTree(Materia(10, 65.0),
                                BinTree(Materia(5, 98.0)),
                                BinTree(Materia(15, 78.0),
                                        BinTree(Materia(12, 34.5)),
                                        BinTree(Materia(17, 88.0)))),
                        BinTree(Materia(100, 79.3),
                                BinTree(Materia(75, 52.3),
                                        BinTree(Materia(62, 100.0),
                                                BinTree(Materia(75, 81.0),
                                                        BinTree(Materia(82, 21.0)),
                                                        BinTree(Materia(19, 67.0))),
                                                BinTree(Materia(82, 71.3))),
                                        BinTree(Materia(81, 86.5))),
                                BinTree(Materia(200, 65.7))))

    }

    @Test
    fun pruebaEstaArbin() {
        assertFalse {
            estaArbin(arbol2, 72)
        }
        assertTrue {
            estaArbin(arbol1, "J")
        }
    }

    @Test
    fun probarPeso() {
        assertEquals(11, peso(arbol1))
    }

    @Test
    fun probarContarHojas() {
        assertEquals(6, contarHojas(arbol2))
    }

    @Test
    fun probarContarVecesApareceElem() {
        assertEquals(1, contarNumVecesApareceElemento(arbol2, 46))
        assertEquals(0, contarNumVecesApareceElemento(arbol2, 8))

    }

    @Test
    fun probarPadre() {
        assertNull(padre(arbol1, "R"))

        assertEquals("J", padre(arbol1, "K"))

        assertEquals(71, padre(arbol2, 100))
    }

    @Test
    fun probarNotasPerdidas() {
        val res = materiasPerdidas(arbol3)
        println(res)
    }

    @Test
    fun PruebaAltura() {
        assertEquals(5, altura(arbol2))
    }

    @Test
    fun PruebaHoja() {
        assertFalse { (esUnaHoja(arbol3)) }
    }

    @Test
    fun PruebaNivelElementoArbol() {
        assertEquals(5, nivelElementoArbol(arbol2, 10))
    }

    @Test
    fun PruebaInorden() {
        inorden(arbol2)
    }

    @Test
    fun PruebaPreorden() {
        preorden(arbol2)

    }

    @Test
    fun PruebaPostornden() {
        postorden(arbol2)
    }

    @Test
    fun PruebaHermano() {
        assertEquals(48, hermano(arbol2, 100))
        assertEquals("E", hermano(arbol1, "D"))
        assertEquals(20, hermano(arbol2, 3))
        assertNull(hermano(arbol2, 9))
        // assertNull(hermano(arbol2,10))
    }

    @Test
    fun pruebaNotaMasAlta() {
        assertEquals(Materia(62, 100.0), materiaNotaMásAlta(arbol3))
    }

    @Test
    fun pruebamenor() {
        assertEquals(3, menorArbol(arbol2))
    }

    @Test
    fun pruebanotasmayora80() {
        assertEquals(4, cuantasMateriasPorEncimaOchenta(arbol3))
    }
    @Test
    fun preorden () {
         preorden(arbol1)
    }
    @Test
    fun inorden () {
        inorden(arbol2)
    }
    //@Test
    //fun Pruebacontarcodigospares(){
      //  assertEquals(8, contarcodigospares(arbol3))
    //}
    //@Test
    //fun PruebaSumaMateriasCodigosPares(){
      //  assertEquals(481.8, sumaMateriasQueTenganCodigoPar(arbol3))
        //assertEquals(60.225,  sumaMateriasQueTenganCodigoPar(arbol3)/contarcodigospares(arbol3))//Probamos la funcion promedio
    //}


   // @Test
    //fun probarCodigoPar() {
      //  assertEquals(60.225, promedioNotasMateriasCódigoPar(arbol3))

    //}

}








