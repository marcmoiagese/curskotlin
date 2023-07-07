/**
 * Carrega per teclat i guarda a una llista inmutable de les altures de 5 persones ( valors Float ) Tens d'obtindre el promig d'aquestes,
 * Comptar cuantes persones son mes altes que el promig i cuantes son mes baixes.
 */


fun main(args: Array<String>) {
    val altures: List<Float> = List(5) {
                                    println("Donam un numero flotan: ")
                                    val valor = readln().toFloat()
                                    valor
                               }

    val promig = altures.average()
    println("L'altura promig es $promig")

    val cant1 = altures.count {it > promig}
    val cant2 = altures.count {it < promig}

    println("Hi ha $cant1 persones mes altes que el promig i $cant2 mes baixes que el promig")

}