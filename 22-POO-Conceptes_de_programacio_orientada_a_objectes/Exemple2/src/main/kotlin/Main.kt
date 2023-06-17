/**
 * Fes una classe que carregui les dades d'un triangle i implementi els seguents metode:
 * * Inicialitzar les propietats
 * * Imprimir el valor del costat que sigui mes gran
 * * I un metode que ens mostri si es equilater o no
 */

class triangle {
    var costat1: Int = 0
    var costat2: Int = 0
    var costat3: Int = 0

    fun inicialitzar(){
        print("Donam el costat 1: ")
        costat1 = readln().toInt()

        print("Donam el costat 2: ")
        costat2 = readln().toInt()

        print("Donam el costat 3: ")
        costat3 = readln().toInt()
    }

    fun costatGran(){
        print("Costat gran: ")
        when{
            costat1 > costat2 &&  costat1 > costat3 -> println(costat1)
            costat2 > costat3 ->  println(costat2)
            else -> println(costat3)
        }
    }

    fun esEquilater(){
        if(costat1 == costat2 && costat1 == costat3)
            print("Es un triangle equilater")
        else
            println("No es un triangle equilater")
    }

}

fun main(args: Array<String>) {
    val triangle1 = triangle()
    triangle1.inicialitzar()
    triangle1.costatGran()
    triangle1.esEquilater()
}