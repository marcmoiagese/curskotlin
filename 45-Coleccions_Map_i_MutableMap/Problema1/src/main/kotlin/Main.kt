/**
 * Fes una agenda. Utilitza un MutableMap on la clau sigui de la classe Data:
 *
 *    data class Data(val dia: Int, val mes: Int, val any: Int)
 *
 * Com a valor al mapa guardarem un String. Implementa les següents funcions.
 * 1- Carrega de dades a l'agenda.
 * 2- Llistat complert de l'agenda.
 * 3- Consulta d'una data.
 */

data class Data(val dia: Int, val mes: Int, val any: Int)

fun carregar(agenda: MutableMap<Data, String>){
    do{
        println("Introdueix una data")

        print("Donam el dia: ")
        val dia = readln().toInt()

        print("Donam el mes: ")
        val mes = readln().toInt()

        print("Dona'm l'any:")
        val any = readln().toInt()

        print("Donam totes les activitats per aquest dia: ")
        val activitats = readln()

        agenda[Data(dia, mes, any)] = activitats

        print("Vols introduir una altra data? [si/no]: ")
        val opcio = readln()
    } while (opcio == "si")
}

fun imprimir (agenda: MutableMap<Data, String>){
    for((ddata, activitat) in agenda){
        println("Data ${ddata.dia}/${ddata.mes}/${ddata.any}")
        println("Activitats: $activitat")
        println()
    }
}

fun consultarData(agenda: MutableMap<Data, String>){
    println("Introdueix una data a consultar")
    print("Donam el dia: ")
    val dia = readln().toInt()

    print("Donam el mes: ")
    val mes = readln().toInt()

    print("Donam l'any: ")
    val any = readln().toInt()

    val ddata = Data(dia, mes, any)
    if(ddata in agenda)
        println("Activitats porgramades: ${agenda[ddata]}")
    else
        println("No hi ha cap activitat registrada per aquesta data")
}

fun main(args: Array<String>) {
    val agenda: MutableMap<Data, String> = mutableMapOf()
    carregar(agenda)
    imprimir(agenda)
    consultarData(agenda)
}