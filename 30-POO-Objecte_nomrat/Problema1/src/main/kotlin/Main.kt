/**
 * Defineix un objecte nombrat:
 *     object mesGran {
 * Amb tres mètodes anomenats "maxim" amb dos parametres cada un. Els mètodes es diferenciaran en que un rep dades de tipus Int.
 * Un altre de tipus Float i finalment l'ultim rep dades de tipus double. Els tres mètodes tenen que retornar la dada mes gran que reben.
 */

object mesGran {

    fun maxim (p1: Int, p2: Int) = if (p1 > p2 ) p1 else p2
    fun maxim (p1: Float, p2: Float) = if (p1 > p2 ) p1 else p2
    fun maxim (p1: Double, p2: Double) = if (p1 > p2 ) p1 else p2
}

fun main(args: Array<String>) {
    println(mesGran.maxim(9, 2))
    println(mesGran.maxim(50.5f, 39.2f))
    println(mesGran.maxim(7.2, 3.1))
}