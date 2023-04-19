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

/**
 * El primer que puc veure és que estem definint una variable mutable, ja que el valor que emmagatzema pot variar durant l'execució.
 * L'estructura repetitiva "while" sempre té una condició, i si aquesta és certa, s'executa el bloc d'instruccions que hi ha entre claus.
 * Cada cop que s'ha executat tot el bloc d'instruccions es torna a evaluar per comprobar si segueix executan-se o surt del bucle.
 *
 * X s'inicia amb el valor 1, al comprobar la condició retorna que es certa per que x(1) es menor que 100, i passa a entrar dins, i es repeteix fins que x arriva a contenir 100.
 * un cop alli surt del bucle.
 */