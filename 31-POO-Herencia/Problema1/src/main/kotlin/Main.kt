/**
 * Declarar una classe Dau que generi un valor aleatori entre 1 i 6, mostrar el seu valor. Crear una segona classe anomenada DauRecuadre que generi un valor entre 1 i 6,
 * imprimir el valor dins un recuadre format per asteriscs. S'ha d'utilitzar l'herencia entre classes
 */

open class Dau {
    protected var valor: Int = 1
    fun tirar(){
        valor = ((Math.random() * 6) + 1).toInt()
    }

    open fun imprimir(){
        println("$valor")
    }
}

class recuadre: Dau(){
    override fun imprimir(){
        println("******")
        println("**$valor**")
        println("******")
    }
}

fun main(args: Array<String>) {
    val dau1  = Dau()
    dau1.tirar()
    dau1.imprimir()

    val dau2 = recuadre()
    dau2.tirar()
    dau2.imprimir()
}