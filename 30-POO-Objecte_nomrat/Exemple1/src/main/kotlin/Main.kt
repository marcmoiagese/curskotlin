/**
 * En aquest exemple definirem un objecte que es dira Mates amb una propietat que tindra el valor de PI i un metode que retorni un valor aleatori en un rang determinat
 */

object Mates {
    val PI = 3.1415
    fun aleatori(minim: Int, maxim: Int) = ( (Math.random() * (maxim + 1 - minim) ) + minim).toInt()
}

fun main(args: Array<String>) {
    println("El valor de pi es ${Mates.PI}")
    print("Un valor aleatori entre 5 i 10: ")
    println(Mates.aleatori(5, 10))
}