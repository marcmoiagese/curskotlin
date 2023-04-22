/**
 * Al seguent exemple realitzarem un programa que imprimeixi per pantalla els numeros qui hi ha des del 1 fins al 100
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
