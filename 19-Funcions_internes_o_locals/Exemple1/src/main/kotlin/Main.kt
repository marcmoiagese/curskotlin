/**
 * Realitza una funció que permeti introduir 10 valors per teclat i contar cuants son multiples de 2, i cuants son multiples de 5.
 */

fun multiplesde2i5(){
    fun multiple(numero: Int, valor: Int) = numero % valor == 0

    var mult2 = 0
    var mult5 = 0

    for(i in 1..10){
        print("Donam un valor: ")
        val valor = readln().toInt()
        if(multiple(valor, 2))
            mult2++
        if(multiple(valor, 5))
            mult5++
    }
    println("Cantitat de multiples de 2: $mult2")
    println("Cantitat de multiples de 5: $mult5")
}

fun main(args: Array<String>) {
    multiplesde2i5()
}