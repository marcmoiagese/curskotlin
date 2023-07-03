/**
 * Crearem una classe Daus que administrara 10 valors de daus dins un vector de tipus IntArray.
 * Sobrecarregarem l'operador parentesis per la classe i accedirem mitjançant una posició al valor d'un costat especific.
 */

class Daus(){
    val vector = IntArray(10)

    fun tirar(){
        for(i in vector.indices)
            vector[i] = ((Math.random() * 6) + 1).toInt()
    }

    operator fun invoke(nro: Int) = vector[nro]
}

fun main(args: Array<String>) {
    var daus = Daus()
    daus.tirar()

    println(daus(0))
    println(daus(1))

    for(i in 2..9)
        println(daus(i))
}