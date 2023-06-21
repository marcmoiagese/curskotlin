/**
 * Fes una classe que defineixi una propietat privada de tipus vector de 5 enters.
 * Al bloc init cridar a un mètode privat que carregui valors aleatoris compresos entre 0 i 10.
 * Definir tres metodes publics mes que mostrin el vector, l'element mes gran i l'element mes petit.
 */

class Classe(){

    private var vector = IntArray(5)

    init {
        carrega()
    }

    private fun carrega(){
        for (i in vector.indices)
            vector[i] = ((Math.random() * 11)).toInt()
    }

    fun imprimir(){
        for (i in vector.indices)
            println( vector[i] )
    }

    fun mesGran(){
        var ind = vector[0]
        for (i in vector.indices)
            if (vector[i] > ind)
                ind = vector[i]

        println("El valor mes alt es $ind")
    }

    fun mesPetit(){
        var ind = vector[0]
        for (i in vector.indices)
            if (vector[i] < ind)
                ind = vector[i]

        println("El valor mes petit es $ind")
    }
}

fun main(args: Array<String>) {
    var crido = Classe()
    crido.imprimir()
    crido.mesGran()
    crido.mesPetit()
}