/**
 * Declarar una classe anomenada Persona amb dues propietats que enmagatzemin el nom i l'edat de la persona. A la propietat nom,
 * enmagatzemar sempre en majuscula el nom i quan es recuperi el seu valor retornarlo entre parèntesis.
 * també controlar que no es pugui introduir una edat amb un valor negatiu, si això passa, guardar 0.
 */

class Persona {
    var  nom: String = ""
    set(valor) {
        field = valor.toUpperCase()
    }

    get(){
        return "(" + field + ")"
    }

    var edat: Int = 0
    set(valor){
        if(valor >= 0)
            field =  valor
        else
            field = 0
    }
}

fun main(args: Array<String>) {
    val persona1 = Persona()
    persona1.nom = "Marc"
    persona1.edat = 23

    println(persona1.nom) // Imprimeix (MARC)
    println(persona1.edat) // Imprimeix 23

    persona1.edat = -50
    println(persona1.edat) // imprimeix 0
}