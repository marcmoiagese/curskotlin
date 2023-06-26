/**
 * El seguent exemple, plantejarem una classe Persona que contindrà dos propietats: nom i edat. Definirem com a responsabilitats que el constructor rebi el nom i l'edat.
 *
 * A la funció main del programa definirem un objecte de la classe persona i cridarem els seus mètodes.
 *
 * També declararem una segona classe anomenada treballador que heredi de la classe Persona i afegeixi una propietat salari i ensenyi si te que pagar impostos quan el salari superi els 1500
 *
 * A la funció main també crearem un objecte de la classe treballador.
 */

open class Persona(val nom: String, val edat: Int){
    open fun imprimir(){
        println("Nom: $nom")
        println("Edat: $edat")
    }
}

class trevallador(nom: String, edat: Int, val salari: Double): Persona(nom, edat){
    override fun imprimir(){
        super.imprimir()
        println("Salari: $salari")
    }

    fun pagaImpostos(){
        if(salari > 3000)
            println("El treballador $nom  paga impostos")
        else
            println("El treballador $nom  no paga impostos")
    }
}

fun main(args: Array<String>) {
    val persona1 = Persona("Cristhian", 37)
    println("Dades de la persona")
    persona1.imprimir()

    val treballador1 = trevallador("Luismi", 37, 5000.0)
    println("Dades del treballador")
    treballador1.imprimir()
    treballador1.pagaImpostos()
}