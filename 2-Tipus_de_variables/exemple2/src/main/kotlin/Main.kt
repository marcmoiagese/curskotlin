/**
 *  Segons la documentació de Kotlin, una de les seves premisses és que un programa en Kotlin sigui concís, és a dir, que s'expressi de la manera més breu possible.
 *  Així que farem unes modificacions al codi de l'exemple 1 perquè sigui més breu.
 */

/**
fun main(parametre: Array<String>) {
    val val1: Int = 100
    val val2: Int = 400
    var resultat: Int = val1 + val2
    println("La suma de $val1 + $val2 es $resultat")
    resultat = val1 * val2
    println("El producte de $val1 * $val2 es $resultat")
}
 */

/**
 * Un altre exemple per ser més concís és no indicar el tipus de la variable i fer que el compilador de Kotlin el dedueixi.
 */

fun main(parametre: Array<String>) {
    val val1 = 100
    val val2 = 400
    var resultat = val1 + val2
    println("La suma de $val1 + $val2 es $resultat")
    resultat = val1 * val2
    println("El producte de $val1 * $val2 es $resultat")
}

/**
* Si volguéssim operar amb valors decimals per inferència, hauríem d'utilitzar la següent sintaxi:
* var pes = 4122.23 // indica que es double
* val altura = 10.42f // afegint la f o F al final indica al compilador que es float
*/