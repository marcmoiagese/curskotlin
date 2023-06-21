/**
 * Fes una classe que representi un treballador. Defineix com a propietats el seu nom i el seu salari.
 * No permetis que el salari sigui un valor negatiu.
 * Fes un metode imprimir dins la classe.
 */

class Treballador(var nom: String, salari: Int){

    var salari: Int = 0
    set(valor){
        if (valor>=0)
           field=valor
        else
           field = 0
    }

    init {
        this.salari = 0
    }

    fun imprimir (){
        println("$nom te un salari de $salari")
    }
}

fun main(args: Array<String>) {
    val Currele = Treballador("Joep", 100)
    Currele.imprimir()

    val Currele2 = Treballador("Adria", 5000)
    Currele2.imprimir()
}