import kotlin.test.assertEquals

/*
* Comentario de Kotlin
* todo lo pones aqui adentro
* */

//Comentario de una sola linea

/*
Variables
Val-->Constante por ejemplo(Pi,Gravedad,Velocidad de la luz,velocidad del sonido,Ecuaciones)
Var-->Su valor es aleatorio(Edad, Peso, Altura,Color,el AMOR de ella   )
*/

//funcion

fun Areadeltriagulo(base:Double,altura:Double):Double{
    val area=(base*altura)/2
    return area
}

//Potencia
var potencia=Math.pow(2.0,3.0) //2*2*2=8
//Raiz Cuadrada
var raiz=Math.sqrt(4.0)//=2
//Pi
val pi=Math.PI//3.1415.............

//Operadores aritmeticos
var suma= 1+2//=3
var resta=2-1//=1
var multiplicacion=2*2//=4
var division=4/2//=2
var modulo= 4%2//=0

/*
operadores logicos
Es igual --->==
Distinto --->!=
Menor, menor o igual, mayor, mayor o igual ---> <,<=,>,>=

Operador and(Y)---> &&
Operador or(O)---> ||
operador not(no)--> !
*/

fun main(){
    assertEquals(2.0,Areadeltriagulo(2.0,2.0),"Area")
    assertEquals(0, modulo,"modulo")
    println("Eres un crack")

}
