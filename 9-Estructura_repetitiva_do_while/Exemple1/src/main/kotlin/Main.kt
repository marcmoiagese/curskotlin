/**
 * Escriu un programa que demani la càrrega d'un nombre entre 0 i 999, i que ens mostri un missatge de quants dígits té. Finalitza el programa quan introduïm el valor 0.
 */

fun main(args: Array<String>) {
    do{
        println("Donam un valor entre 0 i 999")
        val valor = readln().toInt()
        if(valor < 10)
            println("el valor donat te un digit")
        else
            if(valor<100)
                println("El valor donat te dos digits")
            else
                println("el  valor donat te tres digits")
    } while (valor != 0)
}
