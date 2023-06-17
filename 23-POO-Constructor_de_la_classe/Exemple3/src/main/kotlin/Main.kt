/**
 * Farem una classe que carregui els costats d'un triangle, pero aquest cop, amb dos constructors. I amb els seguents metodes:
 * * Inicialitzar les propietatsi.
 * * Imprimirem el costat mes grani.
 * * Indicar si es equilater o no.
 */

class Triangle (var costat1: Int, var costat2: Int, var costat3: Int){

    constructor():this(0, 0, 0){
        println("Donam el costat numero 1: ")
        costat1 = readln().toInt()

        println("Donam el costat numero 2: ")
        costat2 = readln().toInt()

        println("Donam el costat numero 3: ")
        costat3 = readln().toInt()
    }

    fun costatGran(){
        println("El costat gran es: ")
        when{
            costat1 > costat2 && costat1 > costat3 -> println(costat1)
            costat2 > costat3 -> println(costat2)
            else -> println(costat3)
        }
    }

    fun esEquilater(){
        if(costat1 == costat2 && costat1 == costat3)
            println("Es equilater")
        else
            println("No es qeuilater")
    }
}

fun main(args: Array<String>) {
    val triangle1 = Triangle()
    triangle1.costatGran()
    triangle1.esEquilater()

    val triangle2 = Triangle(6, 6, 6)
    triangle2.costatGran()
    triangle2.esEquilater()
}