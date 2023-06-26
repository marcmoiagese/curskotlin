/**
 * Declararem una classe Persona amb les propietats nom i edat, definirem com a mètodes la seva impresií i una altra que retorni true si es mes gran d'edat o false en cas contrari.
 * A la funció main definirem un vector amb cuatre elements de tipus Persona. Calcularem cuantes persones son majors d'edat
 */

class Persona(val nom: String, val edat: Int){
    fun imprimir(){
        println("Nom: $nom Edat: $edat")
    }

    fun esMajor() = if (edat >= 18) true else false
}

fun main(args: Array<String>) {
    val persones: Array<Persona> = arrayOf(Persona("Anna", 22), Persona("Joan", 13), Persona("Carles", 6), Persona("Maria", 72))
    println("Llista de persones")
    for(per in persones)
        per.imprimir()
    var cant = 0

    for (per in persones)
        if(per.esMajor())
            cant++
    println("La cuantitat de persones majors d'edat es: $cant")
}