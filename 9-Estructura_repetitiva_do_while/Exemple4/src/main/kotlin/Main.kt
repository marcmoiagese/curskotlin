/**
 * Fes un programa que sumi valors donats per teclat, fins que es doni 9999 i no sumarem aquest valor dins el comput. quan s'ingressi el 9999 indicarem que ha finalitzat la càrrega
 * i imprimirem el valor acumulat. També informarem si el valor es  0, mes gran que 0 o menor a 0.
 *
 */
fun main(args: Array<String>) {
    var suma = 0

    do{
        println("Donam un numero: ")
        val control = readln().toInt()

        if(control != 9999)
            suma += control

    }while(control != 9999)

    println("El valor calculat es: $suma")
    if(suma > 0)
        println("El valor calculat es superior a 0")
    else if(suma < 0)
        println("El valor calculat es inferior a 0")
    else
        println("El valor es igual a 0")

}