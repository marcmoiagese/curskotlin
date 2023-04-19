/**
 * "L'estructura do/while és un altre tipus d'estructura repetitiva que, com a mínim, s'executa una vegada. Es sol utilitzar quan tenim clar que és necessari executar
 * el bloc d'instruccions almenys una vegada. A diferència del while, la condició de sortida aquí es troba al final, representant la sortida.
 *
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