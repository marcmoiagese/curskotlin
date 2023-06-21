/**
 * Crea una classe Dau. Defineix una propietat privada anomenada valor i tres metodes, un privat que dibuixi una linea d'asteriscos, i dos mes públics. un que generi un numero aleatori entre 1 i 6 i un altre que l'imprimeixi cridan finalment al que dibuixa la línea d'asteriscos.
 */

class Dau{
    private var valor: Int = 1
    fun tirar(){
        valor = ( (Math.random() * 6)+1).toInt()
    }

    fun imprimir(){
        separador()
        println("El valor del dau es: $valor")
        separador()
    }

    private fun separador() = println("*****************************************************")

}

fun main(args: Array<String>) {
    val dau1 = Dau()
    dau1.tirar()
    dau1.imprimir()
}