/**
 * Declararem una classe que enmagatzemi el nom i l'edat d'una persona. Definirem un mètode que retorni true o false depenen si la persona es major d'edat o no.
 * Aquesta funció ha de rebre com a paràmetre una funcio que al cridarla passant-l
 * i l'edat de la persona retorni si es major o no d'edat.
 * Tindrem en compte que si viu a Estats units, la majoria d'edat es a partir dels 21 anys, i que a Españistan ho es a partir dels 18.
 */

class Persona(val nom: String, val edat: Int){
    fun esMajor(fn:(Int) -> Boolean): Boolean {
        return fn(edat)
    }
}

fun esMajoraEUA(edat: Int): Boolean{
    if (edat>=21)
        return true
    else
        return false
}

fun esMajoraEspanistan(edat: Int): Boolean{
    if (edat>=18)
        return true
    else
        return false
}

fun main(args: Array<String>) {
    val persona1 = Persona("Jose Maria Aznar", 70)
    if (persona1.esMajor(::esMajoraEUA))
        println("${persona1.nom} es major d'edat si viu a EUA")
    else
        println("${persona1.nom} es menor d'edat si viu a EUA")

    if (persona1.esMajor(::esMajoraEspanistan))
        println("${persona1.nom} es major d'edat si viu a Españistan")
    else
        println("${persona1.nom} es menor d'edat si viu a Españistan")
}