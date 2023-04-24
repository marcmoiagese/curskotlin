/**
 * Escriu un programa que demani coordenades X i y que representin un punt en un pla.
 * Informa de cuants punts s'han posat al primer, segon, tercer i cuart cuadrant. Al iniciar el programa es demanara quants punts s'han de processar
 */

fun main(args: Array<String>) {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    print("Cantitat de punts a ingressar: ")
    val cantitat = readln().toInt()

    for(i in 1..cantitat){
        print("Donam la coordenada x: ")
        val x = readln().toInt()

        print("Donam una coordenada y: ")
        val y  = readln().toInt()

        if(x > 0 &&  y > 0)
            cant1++
        else
            if (x <0 &&  y >0)
                cant2++
            else
                if(x<0 && y < 0)
                    cant3++
                else
                    if (x > 0 && y < 0)
                        cant4++

    }
    println("Cantitat de punts al primer cuadrant: $cant1")
    println("Cantitat de punts al segon cuadrant: $cant2")
    println("Cantitat de punts al tercer cuadrant: $cant3")
    println("Cantitat de punts al quart cuadrant: $cant4")
}