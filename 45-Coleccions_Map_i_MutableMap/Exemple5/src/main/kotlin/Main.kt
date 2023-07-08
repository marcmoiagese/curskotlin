/**
 * Volem guardar les dades de N alumnes (n s'introdueix per teclat). Definirem un MutableMap en que la seva clau sigui el numero de document del alumne. Com a valor guardarem una llista amb components de la classe Assignatura on guardarem el nom de la assignatura i la seva nota.
 *
 * Crearem les seguents funcions:
 *
 *     Carrega els alumnes ( de cada alumne solicitarem el seu DNI i els noms de les materies i les seves notes)
 *     Llista de tots els alumnes amb les seves notes.
 *     Consulta d'un alumne pel seu dni, mostrar les materies que cursa i les seves notes.
 *
 */

data class Assignatura ( val nom: String, val nota: Int)

fun carregar (alumnes: MutableMap<Int, MutableList<Assignatura>>){
    println("Cuants alumnes carregaras?: ")
    val cant = readln().toInt()

    for(i in 1..cant){
        print("Introdueix el  DNI")
        val dni = readln().toInt()
        val llistaAssignatures = mutableListOf<Assignatura>()
        do{
            print("Introdueix Assignatura del alumne: ")
            val nom = readln()
            print("Introdueix nota: ")
            val nota = readln().toInt()
            llistaAssignatures.add(Assignatura(nom,nota))
            print("Introduir una altra nota [si/no]: ")
            val opcio = readln()
        } while (opcio == "si")
        alumnes[dni] = llistaAssignatures
    }
}

fun imprimir (alumnes: MutableMap<Int, MutableList<Assignatura>>) {
    for((dni, llistaAssignatures) in alumnes){
        println("Dni del alumne: $dni")
        for(assignatura in llistaAssignatures) {
            println("Assignatura: ${assignatura.nom}")
            println("Nota: ${assignatura.nota}")
        }
        println()
    }
}

fun consultaPerDNI (alumne: MutableMap<Int, MutableList<Assignatura>>){
    print("Introdueix el dni del alumne a consultar: ")
    val dni = readln().toInt()
    if(dni in alumne){
        println("Esta realitzan les següents assignatures")
        val llista = alumne[dni]
        if (llista!=null)
            for((nom, nota) in llista){
                println("Nom de la materia: $nom")
                println("Nota: $nota")
            }
    }
}

fun main(args: Array<String>) {
    val alumnes: MutableMap<Int, MutableList<Assignatura>> = mutableMapOf()
    carregar(alumnes)
    imprimir(alumnes)
    consultaPerDNI(alumnes)
}