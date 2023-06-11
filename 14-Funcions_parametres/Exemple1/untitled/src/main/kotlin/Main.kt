/**
 * Fes una aplicació que imprimeixi una presentacio per pantalla del programa. Demana la carrega de dos valors i ens mostri la suma
 * Imprimeix al final un missatge de despedida.
 */

fun imprimirMissatge(missatge: String){
    println("**************************************************************")
    println(missatge)
    println("**************************************************************")
}

fun fesLaSuma(){
    print("Introdueix el primer valor: ")
    val valor1 = readln().toInt()

    print("Donam el segon valor: ")
    val valor2 =  readln().toInt()

    val suma = valor1 + valor2
    println("La suma dels dos valor es: $suma")
}

fun main(args: Array<String>) {
    imprimirMissatge("El programa calcula la suma de dos valors introduits per teclat.")
    fesLaSuma()
    imprimirMissatge("Gràcies per utilitzar aquest programa.")
}