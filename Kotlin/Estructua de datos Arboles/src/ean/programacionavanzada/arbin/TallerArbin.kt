/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad EAN (Bogotá - Colombia)
 * Departamento de Sistemas
 * Faculta de Ingeniería
 *
 * Taller Árboles Binarios
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package ean.programacionavanzada.arbin

import ean.collections.IBinTree
import ean.collections.IList
import ean.collections.List
import java.lang.Math.max
import java.lang.Math.min

/**
 * Informar si un elemento se encuentra presente en un árbol binario
 */
fun <T> estaArbin(a: IBinTree<T>, elem: T): Boolean =//si el elemento esta  en el arbol
        if (a.isEmpty) {
            false
        }
        else if (a.root == elem) {
            true
        }
        else {
            estaArbin(a.left, elem) || estaArbin(a.right, elem)
        }

/**
 *   Calcular el peso de un árbol binario
 */
fun <T> peso(a: IBinTree<T>): Int {//todal de elementos de un arbol
    if (a.isEmpty){
        return 0
    }
    else{
       return peso(a.left)+ peso(a.right)+1
    }
}

fun <T> esUnaHoja(a: IBinTree<T>): Boolean =//si el arbol es una hoja o no
    if(a.isEmpty&&a.left.isEmpty&&a.right.isEmpty){
        true
    }
    else{
        false
    }



fun <T> contarHojas(a: IBinTree<T>): Int =//cuantas hojas tiene un arbol
        if(a.isEmpty){
            0
        }
        else if(a.left.isEmpty && a.right.isEmpty){
            1
        }
        else{
            contarHojas(a.left)+ contarHojas(a.right)
        }



fun <T> altura(a: IBinTree<T>): Int =
    if(a.isEmpty){
        0
    }
    else{
        var ai=altura(a.left)
        var ad=altura(a.right)
        Math.max(ai,ad)+1

    }


fun <T> preorden(a: IBinTree<T>): Unit {
    if (!a.isEmpty){
        println(a.root)
        preorden(a.left)
        preorden(a.right)
    }
}

fun <T> postorden(a: IBinTree<T>): Unit {
    if(!a.isEmpty){
        postorden(a.left)
        postorden(a.right)
        println(a.root)
    }
}

fun <T> inorden(a: IBinTree<T>) {
    if(!a.isEmpty){
        inorden(a.left)
        println(a.root)
        inorden(a.right)
    }
}

fun <T> nivelElementoArbol(a: IBinTree<T>, elem: T): Int =
    if(a.isEmpty){
        0
    }
    else if(a.root==elem){
        1
    }else{
        if (estaArbin(a.left,elem)){
            nivelElementoArbol(a.left,elem)+1
        }
        else{
            nivelElementoArbol(a.right,elem)+1
        }

    }




/**
 *  Calcular cuantas veces aparece un elemento en un arbol
  */
fun <T> contarNumVecesApareceElemento(a: IBinTree<T>, e: T): Int =
    if(a.isEmpty){
        0
    }
    else{
        var ai=contarNumVecesApareceElemento(a.left,e)
        var ae=contarNumVecesApareceElemento(a.right,e)
        if(a.root==e){
            ai+ae+1
        }
        else{
            ai+ae
        }


    }

/**
 * Calcula el menor entre 3 numeros
 */
fun menorEntreTres(a: Int, b: Int, c: Int) = min(a, min(b, c))

/**
 * Calcular el menor de un árbol binario
 */
fun menorArbol(arbol: IBinTree<Int>): Int =
    if(arbol.left.isEmpty&&arbol.right.isEmpty){
        arbol.root
    }
    else if (!arbol.left.isEmpty && !arbol.right.isEmpty){
        var ai= menorArbol(arbol.left)
        var ae= menorArbol(arbol.right)
        var a=arbol.root
        menorEntreTres(a,ae,ai)

    }
    else if(arbol.left.isEmpty&&!arbol.right.isEmpty){
        var ae= menorArbol(arbol.right)
        var a=arbol.root
        min(ae,a)
    }
    else if(!arbol.left.isEmpty&&arbol.right.isEmpty){
        var ai= menorArbol(arbol.left)
        var a=arbol.root
        min(ai,a)
    }
    else{
        arbol.root
    }



/**
 * Retorna el elemento que es padre del elemento e. Retorna null si no existe tal padre
 */
fun <T> padre(a: IBinTree<T>, e: T): T? {
        if(!a.left.isEmpty&&a.left.root==e){
                return a.root
            }
        else if(!a.right.isEmpty&&a.right.root==e){
                return a.root
            }
        else{
            if(estaArbin(a.left,e)){
                    return padre(a.left,e)
                }
            else if(estaArbin(a.right,e)){
                    return padre(a.right,e)

                }
            else{
                    return null
                }

            }
        }



/**
 * Retorna el elemento que es hermano del elemento e. Retorna null si no tiene hermano
 */
fun <T> hermano(a: IBinTree<T>, e: T): T? {
    require(!a.isEmpty)
    if(!a.left.isEmpty&&a.left.root==e){
        return a.right.root
    }
    else if(!a.right.isEmpty&&a.right.root==e){
    return a.left.root
    }
    else{
    if(estaArbin(a.left,e)){
        return hermano(a.left,e)
    }
    else if(estaArbin(a.right,e)){
        return hermano(a.right,e)

    }
    else{
        return null
    }

}
}

/**
 * Clase de utilidad
 */
data class Materia(val codigo: Int, val notaFinal: Double)

/**
 * Operaciones interesantes
 */
fun materiasPerdidas(arbol: IBinTree<Materia>): IList<Materia> =
    if (arbol.isEmpty) {
        List<Materia>()
    }
    else {
        val perdidasIzq = materiasPerdidas(arbol.left)
        val perdidasDer = materiasPerdidas(arbol.right)
        val resultado = perdidasIzq + perdidasDer
        if (arbol.root.notaFinal < 60.0) {
            resultado.add(arbol.root)
        }
        resultado
    }

/**
 * Retorne null si el arbol es vacío
 */
fun materiaNotaMásAlta(arbol: IBinTree<Materia>): Materia? =
      if (arbol.isEmpty){
          null
      }
      else if(arbol.left.isEmpty&&arbol.left.isEmpty){
          arbol.root
      }
      else{
          val izq= materiaNotaMásAlta(arbol.left)
          var  der= materiaNotaMásAlta(arbol.right)
          if ((arbol.root.notaFinal<izq!!.notaFinal)&&(izq!!.notaFinal>der!!.notaFinal)){
              izq
          }
          else if ((arbol.root.notaFinal<der!!.notaFinal)&&(izq!!.notaFinal<der!!.notaFinal)){
              der
          }
          else{
              arbol.root
          }

      }


fun cuantasMateriasPorEncimaOchenta(arbol: IBinTree<Materia>): Int=
    if (arbol.isEmpty) {
        0
    }
    else {
        var ai = cuantasMateriasPorEncimaOchenta(arbol.left)
        var ae = cuantasMateriasPorEncimaOchenta(arbol.left)
        var resultado = ai + ae
        if (arbol.root.notaFinal > 80.0) {
            resultado + 1
        } else {
            resultado
        }
    }
fun contarcodigospares(arbol:IBinTree<Materia>):Int=
        if (arbol.isEmpty){
            0
        }
        else{
            var ai= contarcodigospares(arbol.left)
            var ae= contarcodigospares(arbol.right)
            var resultado=ai+ae
            if (arbol.root.codigo%2==0){
                resultado+1
            }
            resultado


        }
fun sumaMateriasQueTenganCodigoPar(arbol: IBinTree<Materia>):Double=
    if (arbol.isEmpty){
        0.0
    }
    else{
        var ai= sumaMateriasQueTenganCodigoPar(arbol.left)
        var ae= sumaMateriasQueTenganCodigoPar(arbol.right)
        var resultado=ai+ae
        if (arbol.root.codigo%2==0){
            resultado+arbol.root.notaFinal
        }
        resultado

    }
fun promedioNotasMateriasCódigoPar(arbol: IBinTree<Materia>): Double =
        sumaMateriasQueTenganCodigoPar(arbol) / contarcodigospares(arbol)

fun <T> ordenado(arbol: IBinTree<T>):Boolean{
    TODO("preguntar a cobo")
}
















