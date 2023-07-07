/**
 * Al bloc principal del proframa definirem un Map inmutable que guardi els noms de paisos com clau i com valor la cantitat de habitans del país.
 * Probar diferents mètodes i propietats que ens proveeix la classe Map.
 */

fun main(args: Array<String>) {
    val paisos: Map<String, Int> = mapOf (Pair ("Andorra", 79034),
                                          Pair("Catalunya", 7566000),
                                          Pair("Valears", 1188000),
                                          Pair("Rosello", 457238),
                                          Pair("Valencia", 791413))
    println("Llistat complet del Map")
    println(paisos)

    for((clau, valor) in paisos)
        println("Per la clau $clau tenim guardat $valor")

    println("La cantitat d'elements del mapa es ${paisos.size}")
    val cantHabitans: Int? = paisos["Andorra"]

    if (cantHabitans != null)
        println("La cantitat d'habitans d'Andorra es $cantHabitans")
    val cantHabitans2: Int? = paisos["Alguer"]
    if (cantHabitans2 != null)
        println("La cantitat d'habitants del alguer es $cantHabitans2")
    else
        println("L'Alguer no esta carregat al Map")

    var suma = 0
    paisos.forEach { suma += it.value }
    println("Cantitat  total d'habitans de tots els paisos es $suma")
}