/**
 * En una empresa hi ha N treballadors amb uns salaris que oscil·len entre 1000€ i 5000€. Cal que es faci un programa que llegeixi els salaris que cobra cada treballador i que
 * informi de quantes persones hi ha que estiguin cobrant entre 1000 i 1300€ i quantes estan cobrant més de 1300€. A més a més, cal que el programa informi de la despesa total
 * de l'empresa en salaris.
 */

fun main(args: Array<String>) {
    println("Quants treballadors hi ha: ")
    val treballadors = readln().toInt()

    var sota = 0
    var sobre = 0
    var x = 1
    var total = 0

    while (treballadors >= x){
        println("Quin es el sou?")
        val sou = readln().toInt()

        if(sou >= 1000 && sou <= 1300 )
            sota++
        else
            sobre++
        total = total+sou
        x++
    }
    println("L'empresa esta pagan $total en salaris, dels quals $sota estan entre 1000 i 1300 i $sobre estan per sobre dels 3000")


}