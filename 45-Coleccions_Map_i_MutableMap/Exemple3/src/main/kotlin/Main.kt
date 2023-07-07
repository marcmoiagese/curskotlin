/**
 * Farem una aplicació que ens permeti crear un diccionari ingles/català. La clau es la paraula amb ingles i el valor es la paraula en català. crearem les seguents funcions:
 *
 *     Carregarem el diccionari ( introduin per teclat la paraula inglesa i la seva traducció al català)
 *     Listat complet del diccionari.
 *     Introduirem per teclat una paraula amb ingles i si existeix al diccionari ensenyara la seva traducció.
 *
 */

fun carregar(diccionari: MutableMap<String, String>){
    do{
        print("Introdueix una paraula amb ingles: ")
        val parIngles = readln()

        println("Introdueix una paraula en catala: ")
        val parCatala = readln()

        diccionari[parIngles] = parCatala
        print("Vols seguir carregan una altra paraula al diccionari? [si/no]")
        val fi = readln()
    }while (fi=="si")
}

fun  llistat(diccionari: MutableMap<String, String>){
    for( (ingles, catala) in diccionari)
        println("$ingles: $catala")
}

fun consultaIngles(diccionari: MutableMap<String, String>){
    print("Introdueix una paraula amb ingles per validar la traducció:")
    val ingles = readLine()
    if(ingles in diccionari)
        println("La traduccio al catala es ${diccionari[ingles]}")
    else
        println("No existeix aquesta paraula al diccionari")
}

fun main(args: Array<String>) {
    val diccionari: MutableMap<String, String> = mutableMapOf()
    carregar(diccionari)
    llistat(diccionari)
    consultaIngles(diccionari)
}