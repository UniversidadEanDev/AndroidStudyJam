/* A
Enunciado:	Realice una función que halle el área de un triángulo.
Datos Entrada
*/
fun areadeltriangulo(b:Double,A:Double):Double {
    TODO()
}
/*B
Enunciado:b.	Si alquilar una bicicleta tiene cierto valor y puede transportar dos personas,
 determine cuántas bicicletas necesito y cuánto dinero voy a gastar en alquilarlas, para
 transportar a todos los estudiantes de la universidad.
Datos DE Entradas
*/
fun ejercicio(valoralquiler:Double,numestudiantes:Int):Pair<Int,Double>{
    TODO()
}

/*C
Enunicado:
c.	Según el DANE, el número de desempleados corresponde al 8.15% de la
 población activa. Escriba una función que permita determinar cuántas personas
  desempleadas hay actualmente en Colombia
Datos Entrada
 */
fun DANE(pc:Int):Int{
    TODO()
}

/*D
Enunciado:d.	Se desea determinar cuántos dólares se puede adquirir con cierta cantidad
 de pesos colombianos.
Datos Entrada
*/
fun convercion(pc:Double,da:Double):Double{
    TODO()
}
/*
Enunciado:m.	Escriba una función que halle el volumen de un cono
Datos Entradas
 */
fun volumencono(radio:Double,altura:Double):Double{
    TODO()
}

/*
Enunciado:k.	Se tiene el nombre y la edad de tres personas. Se desea saber el
nombre y la edad de la persona de menor edad.
Datos de Entrada
nombre1--nombre1-->String
nombre2--nombre2-->String
nombre3--nombre3-->String
edad1--edad1-->Int
edad2--edad2-->Int
edad3--edad3-->Int
Datos de salida
nombremenor--nombremenor-->Sring
edadmenor--edadmenor-->Int
 */


fun edadandnombre(nombre1:String,nombre2:String,nombre3:String,edad1:Int,edad2:Int,edad3:Int):Pair<String,Int> {
    TODO()
}
/*
Enunciado:Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
 Considere que se cobra por m2 y realice una funciòn que le permita saber cuánto cobrar a un cliente.
Datos de entrada

 */
fun pintor(vmc:Double,cmc:Double):Double{
    TODO()
}
/*
Enunciado:q.	El valor presente de un cierto capital de dinero     a una tasa de interés de
durante años se encuentra a partir de la fórmula:
 Escriba una función que determine el valor presente a partir de los datos de entrada dados.
Datos de Entrada

 */
fun valor_presente(c:Double,t:Int,n:Int):Double {
    TODO()
}
/*
Enunciado:Realice	un	algoritmo	para	determinar	cuánto	pagará	finalmente	una	persona
	por	un	artículo	equis,considerando que tiene un descuento de 5%, y debe pagar 19% de IVA
	 (debe retornar el precio con descuento y el precio final).
Datos de entrada

 */
fun precio_articulo(pna:Double):Pair<Double,Double>{
    TODO()
}
/*
Enunciado:o.	Se sabe que una batería de celular contamina 175 litros de agua. ¿Cuántos litros de agua serán
contaminados por la población de una ciudad en un año si cada persona utiliza 2 baterías al semestre?
Datos de entrada
poblacio de la ciudada---pc-->Int
Datos de salida
litros contamidos--lcon-->Double
 */
fun litros_contaminados(pc:Int):Double{
    TODO()
}
/*
Enunciado:n.	En la universidad vamos a conectar los diversos computadores que hay en una sala de
 cómputo con cables. Se necesita un cable para conectar dos computadores, y debe haber conexión entre
  todos los computadores. Escriba una función que determine el número de cables a comprar a partir del
  número de computadores que hay en la sala.
Datos de entrada
 */
fun computadores_cables(nc:Int):Int{
    TODO()
}
/*
Enunciado:e.	Una empresa que contrata personal requiere determinar la edad de las personas que
 solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en que
  nacieron. Realice el algoritmo para solucionar este problema.
Datos de entrada

 */
fun edad1 (año_actual:Int,año_nacimiento:Int):Int{
    TODO()
}
/*
Eunciado:  f.	Un estacionamiento requiere determinar el cobro que debe aplicar a las
 personas que lo utilizan. Considere que el cobro es con base en las horas que lo disponen
  y que las fracciones de hora se toman como completas y realice una función que permita determinar el cobro.
Datos de entrada
 */
fun estacionamiento(vch:Double,hu:Int):Double{
    TODO()
}
/*
Enciando:j.	Realice una función para determinar la nota final que obtendrá un alumno considerando
que realiza tres exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%,
 mientras que el tercero de 50%.
Datos De Entrada
-examen1-->examen1--Double
-examen2-->examen2--Double
-examen3-->examen3--Double
Datos de Salida
-nota fina--notafinal--Double
 */
fun notasfinal(examen1:Double,examen2:Double,examen3:Double):Double{
    TODO()
}
/*
Enunciado:p.	Mi proveedor de Internet me asegura que mi conexión es de 4 megabytes por segundo.
 Escriba una función que permita determinar cuántos minutos y segundos debo esperar para descargar
 la última película de La Mujer Maravilla.
Datos de entrada
-Cantidad de megas mujer maravilla-->pm-->MM->Double
Datos  de salida
- minutos de descarga-->MD-->INT
-segundos de descarga-->Sd-->Int
 */
fun mujermaravilla(MM:Double):Pair<Int,Int>{
    TODO()
}
/*
Enunciado:Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra
 en bicicleta, considerando que lleva una velocidad constante. Realice una función para tal fin.
 Datos de entrada
 -velociada constante--vc--Double
 -Distancia a recorrer --d--Duoble
 Datos de salida
 -tiempo-T-Double
 */
fun tiempo(vc:Double,d:Double):Double{
    TODO()
}
/*
Enunciado:l.	El presidente de la república ha decidido estimular a todos los estudiantes de una
universidad mediante la asignación de becas mensuales, para esto se tomarán en consideración los
 siguientes criterios: Para alumnos mayores de 18 años con promedio mayor o igual a 90, la beca será
  de $2000.00; con promedio mayor o igual a 75, de$1000.00; para los promedios menores de 75 pero
  mayores o iguales a 60, de $500.00; a los demás se les enviará una carta de invitación incitándolos
   a que estudien más en el próximo ciclo escolar. A los alumnos de 18 años o menores de esta edad,
    con promedios mayores o iguales a 90, se les dará $3000; con promedios menores a 90 pero mayores
     o iguales a 80, $2000; para los alumnos con promedios menores a 80 pero mayores o iguales a 60,
      se les dará $100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de
      invitación. Realice la función correspondiente.
Datos de entrada
 */
fun becas(ee:Int,prom:Double):String{
    TODO()
}
fun main(){
    /*
    * ProbarEjecicioA
    */

    var datos = ejercicio(2500.0, 100)
    var numbicis = datos.first
    var total = datos.second
    assertEquals(50, numbicis,"ProbarEjecicioA")
    assertEquals(125000.0, total, "ProbarEjecicioA")

    /*
    * probardane
    */
    assertEquals(81, DANE(1000),"probardane")

    /*
    * probarArea
    */
    assertEquals(2.0, areadeltriangulo(2.0, 2.0))

    /*
    * cambio
    */
    assertEquals(28320000.0, convercion(10000.0, 2832.0))
    /*
    * volumencono
    */
    assertEquals(20.943951023931955, volumencono(2.0, 5.0))
    /*
    * edadmenorde
    */
    var datos2=edadandnombre("brayan","sebastian","camilo",12,18,18)
    var nombre=datos2.first
    var edad=datos2.second
    assertEquals("brayan",nombre)
    assertEquals(12,edad)
    /*
    * pintorcobra
    */
    assertEquals( 10000.0,pintor(1000.0,10.0))
    /*
    * valorpresente
    */
    assertEquals(2.0176569459262645E-8, valor_presente(1.22,5,10))
    /*
    * valorpresente
    */
    var datos3= precio_articulo(1000.0)
    var des=datos3.first
    var pt=datos3.second
    assertEquals(950.0,des)
    assertEquals(180.5,pt)
    /*
    * litros
    */
    assertEquals(70000.0, litros_contaminados(100))
    /*
    * cables
    */
    assertEquals(87, computadores_cables(88))
    /*
    * edad
    */
    assertEquals(19,edad1(2018,1999))
    /*
    * estaciona
    */
    assertEquals(15000.0, estacionamiento(3000.0,5))
    /*
    * definitiva
    */
    assertEquals(67.5, notasfinal(20.0,50.0,100.0))
    /*
    * mujermm
    */
    var datos4= mujermaravilla(5120.0)
    var mts=datos4.first
    var s=datos4.second
    assertEquals(21,mts)
    assertEquals(33,s)
    /*
    * timpos
    */
    assertEquals(2, tiempo(50.0,100.0))
    /*
    * bequitas
    */
    assertEquals("2000.00", becas(19,95.0))
    println("todos los problemas estan bien")
}