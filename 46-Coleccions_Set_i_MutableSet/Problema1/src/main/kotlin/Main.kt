/**
 * Defineix un MutableSet que guardi 6 valors aleatoris compresos entre 1 i 50.
 * L'objecte de tipus MutableSet representa una butlleta de lotaría.
 * Genera valors aleatoris compresos entre 1 i 5, que siguin tots diferents i aturarse quan surtin tots els que conté la butlleta de loteria.
 * Ensenya cuants numeros han tingut que sortejarse fins que es completa el cartró.
 */

fun generaButlleta (butlleta: MutableSet<Int>){
    do {
        val valor = ( (Math.random() * 50) + 1).toInt()
        butlleta.add(valor)
    }while (butlleta.size!=6)
}

fun generarSorteig(sorteig: MutableSet<Int>){
    do {
        val valor = ( (Math.random() * 50 ) + 1 ).toInt()
        sorteig.add(valor)
    } while (sorteig.size!=50)
}

fun verificaSiguanya(butlleta: MutableSet<Int>,sorteig: MutableSet<Int>) {
    var encerts = 0
    var cantSortejos = 0
    var intents = 0

    for (combinacio in sorteig) {
        cantSortejos++
        if (combinacio in butlleta){
            encerts++
            if (encerts == 6){
                intents = cantSortejos
                break
            }
        }
    }
    println("S'han fet $intents intents fins que ha sortit el premi")
}

fun main(args: Array<String>) {
    val butlleta: MutableSet<Int> = mutableSetOf()
    generaButlleta(butlleta)

    println("El decim generat")
    println(butlleta)

    val sorteig: MutableSet<Int> = mutableSetOf()
    generarSorteig(sorteig)

    println("Numeros del Sorteig")
    println(sorteig)

    verificaSiguanya(butlleta, sorteig)
}