/**
 * Fins ara hem emprat estructures secuencials i condicionals, pero tenim altres tipus d'estructures com les repetitives. Una estructura repetitiva permet executar una instrucció
 * o un conjunt d'instruccions mes d'una vegada. Aquest tipus d'estructures, tenen una regla que detemina si es repeteix o no l'acció.
 *
 * WHILE ( Mentres.. )
 * Una estructura WHILE com a primera acció verifica si la condició definida es compleix, en cas afirmatiu, s'executaran les instruccions indicades fins que aquesta condició cambio.
 * En cas que la condicio sempre retorni verdader com per exemple seria ( 1 == 1 ) tindriam un bucle infinit.
 *
 * Al seguent exemple realitzarem un programa que imprimeixi per pantalla els numeros qui hi ha des del 1 fins al 100
 *
 */

fun main(args: Array<String>) {
    var x = 1
    while (x <= 100) {
        println(x)
        x=x+1
    }
}