/**
 * Es donen N altures de persones donar l'altura mitjana de les persones
 */

fun main(args: Array<String>) {
    println("Cuantes persones hi ha? ")
    val persones = readln().toInt()
    var x = 1
    var mitja = 0

    while(persones >= x){
        println("Dona'm l'altura de la persona $x ")
        val alt = readln().toInt()
        mitja = mitja + alt
        x++
    }
    mitja = mitja / persones
    println("la mitja de $persones es $mitja ")
}