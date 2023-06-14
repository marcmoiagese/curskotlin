/**
 * Realitza una funció que revi el nom d'un operari, el pagament per hora i la cantitat d'hores treballades. te que mostrar el seu sou i el no,. Fa la crida de la funció mitjançant els arguments mencionats.
 *
 */

fun calculaSalari(nom: String, costHora: Double, cantitatHores: Int){
    val salari = costHora * cantitatHores
    println("$nom ha pencat $cantitatHores hores, sel paga per hora $costHora per lo tan li correspon un salari de $salari ")
}

fun main(args: Array<String>) {
    calculaSalari("Joan", 10.5, 120)
    calculaSalari(costHora=12.0, cantitatHores = 40, nom= "Anna")
    calculaSalari(cantitatHores = 40, nom= "Lluis", costHora=7.25,)
}