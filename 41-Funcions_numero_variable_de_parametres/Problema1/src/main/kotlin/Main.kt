/**
 * Fes una funció que rebi una serie d'edats i ens retorni la cantitat que son mes grans o iguals a 18 (com a minim s'envia un enter a la funció)
 */

fun major18(vararg edats: Int) = edats.count {it >=18}

fun main(args: Array<String>) = println(major18(5, 10, 20, 60, 5))
