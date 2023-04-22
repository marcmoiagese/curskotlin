/**
 * Escriu un programa que llegeixi 10 notes d'alumnes i ens informi de la quantitat d'estudiants que han obtingut notes iguals o superiors a 7,
 * així com la quantitat d'estudiants que han obtingut notes inferiors.
 */
fun main(args: Array<String>) {
    var superior = 0
    var inferior = 0

    for (i in 1..10){
        println("Donam una nota: ")
        val nota = readln().toInt()

        if(nota >= 7)
            superior++
        else
            inferior++
    }
    println("Hi ha $superior alumnes amb una nota superior a 7")
    println("Hi ha $inferior alumnes amb una nota inferior a 7")
}