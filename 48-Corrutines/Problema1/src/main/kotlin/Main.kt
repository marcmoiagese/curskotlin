/**
 * Fes una aplicació que al seu fil principal es generi un valor aleatori entre 1 i 100:
 *
 *  fun main(args: Array) {
 *      val encerta = Random.nextInt(1, 100)
 *
 * Després crear una corrutina on la mateixa te d'encertar el numero aleatori generat al fil principal.
 * S'ha de generar un numero aleatori, la primera vegada entre 1 i 100, després validar si el numero aleatori a encertar del fil principal es major o menor.
 * Si es igual imprimir el missatge que ha guanyat, i si no, s'ha d'aturar per 500 milisegons, i procedir a repetir la generació d'un altre numero aleatori,
 * pero aquest cop acotat a la resposta de si era major o menor. Repetir el procés fins que guanyi.
 */

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

fun main(args: Array<String>) {
    val encerta = Random.nextInt(1, 100)
    var inici = 1
    var fi = 100

    GlobalScope.launch {
        var penso:Int
        do{
            penso = Random.nextInt(inici, fi)
            println(penso)
            if(penso == encerta)
                println("Ha guanyat amb $penso")
            else
                if(penso < encerta){
                    println("El numero es mes gran")
                    inici = penso
                }else{
                    println("El numero es menor")
                    fi = penso
                }
            delay(500)
        }while(penso != encerta)
    }
    readLine()  // Aturem el fil principal del programa

}