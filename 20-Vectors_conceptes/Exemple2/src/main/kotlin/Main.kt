/**
 * Definir un vector de 5 components de tipus float que representi les altures de 5 persones
 * Obtenir el promig d'aquestes. Compta cuantes persones son mes altes que el promig i cuantes mes baixes.
 */

fun main(args: Array<String>) {
    val altures = FloatArray(5)
    var suma = 0f

    for(i in 0..altures.size-1){
        print("Donam l'altura: ")
        altures[i] = readln().toFloat()
        suma += altures[i]
    }

    val promig = suma / altures.size
    println("Altura promig: $promig")

    var alts = 0
    var baixos = 0

    for (i in 0..altures.size-1)
        if (altures[i] > promig)
            alts++
        else
            baixos++
    println("Cantitat de persones mes altes que el promig: $alts")
    println("Cantitat de persones mes baixes que el promig: $baixos")
}