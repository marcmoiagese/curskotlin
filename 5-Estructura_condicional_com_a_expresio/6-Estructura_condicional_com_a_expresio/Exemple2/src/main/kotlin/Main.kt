/**
 * El més comú és que s'utilitzi un "if" com a expressió que retorni un valor, necessitant només una sola activitat, sigui cert o fals.
 * Tot i així, aquest llenguatge ens permet disposar de més d'una instrucció per a cada branca del "if".
 *
 * Exemple: Introduir per teclat un valor enter, enmagatzemar a una altra variable el cuadrat d'aquest si el valor es parell, en cas que sigui imparell gardarem el cub
 *
 */

fun main(args: Array<String>) {
    println("Donam un numero: ")
    val numero = readln().toInt()

    val resultat = if ( numero % 2 == 0){
        print("Cuadrat: ")
        numero * numero
    } else {
        print("Cub: ")
        numero * numero * numero
    }
    print(resultat)
}

/**
 * Aquest, seria un exemple en el que realitzem mes d'una activitat per cada rama.
 */