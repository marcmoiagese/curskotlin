/**
 * Crearem una classe anomenada Persona que tindra com a propietats ( variables ) el seu nom i edat, ademés tindrà tres mètodes ( funcions )
 * * un dels metodes inicialitzarà les propietats del nom i la edat.
 * * un alre metode ens ensenyara per pantalla el contingut de les propietats.
 * * L'ultim metode ens informara si es major d'edat.
 *
 * Definirem dos objectes de la clase Persona.
 */

class Persona {
    var nom: String = ""
    var edat: Int = 0

    fun inicialitzar(nom: String, edat: Int){
        this.nom = nom
        this.edat = edat
    }

    fun imprimir(){
        println("Nom: $nom te $edat anys")
    }

    fun esMajorEdat(){
        if(edat >= 18)
            println("Es major d'edat $nom")
        else
            println("No es major d'edat $nom")
    }
}

fun main(args: Array<String>) {
    val persona1: Persona
    persona1 = Persona()
    persona1.inicialitzar("Marc", 30)
    persona1.imprimir()
    persona1.esMajorEdat()

    val persona2: Persona
    persona2 = Persona()
    persona2.inicialitzar("Joan Manel", 38)
    persona2.imprimir()
    persona2.esMajorEdat()
}