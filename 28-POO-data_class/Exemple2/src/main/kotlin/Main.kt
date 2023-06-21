/**
 * Declararem un data class anomenat Persona que enmagatzemi el nom i l'edat. Sobreescriurem el mètode toString per retornar un String amb la concatenació del nom i l'edat separan per una coma.
 */

data class Persona (var nom: String, var edat: Int){
    override fun toString(): String{
        return "$nom, $edat"
    }
}


fun main(args: Array<String>) {
    var person1 = Persona("Arnau", 22)
    var person2 = Persona("Enrric", 39)

    println(person1)
    println(person2)
}