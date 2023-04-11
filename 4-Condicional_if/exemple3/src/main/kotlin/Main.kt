/**
 * Es demanen per teclat dos valors enters. Si el primer és menor que el segon, es calcula la suma i la resta d'aquests i es mostra el resultat per pantalla.
 * Si el primer és igual o major que el segon, es calcula el producte i la divisió d'aquests i també es mostra el resultat.
 */

fun main(parametro: Array<String>) {
    print("Donam el primer número: ")
    val val1 = readln().toInt()
    print("Donam el segon número: ")
    val val2 = readln().toInt()

    if (val1 < val2){
        val suma = val1 + val2
        val resta = val1 - val2
        println("la suma dona $suma i la resta dona  $resta")
    }else{
        val producte = val1 * val2
        val divisio = val1 / val2
        println("la divisio dona $divisio i el producte dona  $producte")
    }
}