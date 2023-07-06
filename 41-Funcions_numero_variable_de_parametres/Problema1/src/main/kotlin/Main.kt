/**
 * Fes una funció que rebi una serie d'edats i ens retorni la cantitat que son mes grans o iguals a 18 (com a minim s'envia un enter a la funció)
 */

fun major18 (vararg edats: Int): Int{
    var cnt = 0
    for (element in edats)
        if(element >= 18)
            cnt++
    return cnt
}

fun main(args: Array<String>) {
    val envioEdats = major18(5, 10, 20, 60, 5)
    println(envioEdats)
}