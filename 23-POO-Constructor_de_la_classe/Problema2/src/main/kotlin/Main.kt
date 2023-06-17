/**
 * Fes una classe que representi un punt en un plà, la coordenada del punt sobre el plà es defineix entre dos valors x i y. Al constructor se li enviarà les coordenades del punt x i de y.
 * * Crea un mètode que retorni un String indicant en quin cuadran esta el punt. tenin en compte els següents valors
 *
 *     1er Cuadrant: si X > 0 i Y > 0
 *     2on Cuadrant: si X < 0 i Y > 0
 *     3er Cuadrant: si X < 0 i Y < 0
 *     4rt Cuadrant: si X > 0 i Y < 0
 *     Si algun o els dos valors es 0, significa que el punt esta sobre l'eix
 *
 *  * Defineix 5 objectes de la classe punt, un per cada un dels cuadrants i un per un eix.
 */

class punt(var X: Int, var Y: Int){

    fun onCaraiEts(){
        when{
            X > 0 && Y > 0 -> println("1er Cuadrant")
            X < 0 && Y > 0 -> println("2on Cuadrant")
            X < 0 && Y < 0 -> println("3er Cuadrant")
            X > 0 && Y < 0 -> println("4rt Cuadrant")
            else -> println("A un dels eixos")
        }
    }
}

fun main(args: Array<String>) {
    var p1 = punt(1,1)
    p1.onCaraiEts()

    var p2 = punt(-1, 1)
    p2.onCaraiEts()

    var p3 = punt(-1, -1)
    p3.onCaraiEts()

    var p4 = punt(1, -1)
    p4.onCaraiEts()

    var p5 = punt(0,0)
    p5.onCaraiEts()
}