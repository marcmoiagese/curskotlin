/**
 *
 * Al seguent exemple carregarem una data, dia, mes i any per teclat. mirarem si es el primer trimestre
 */

fun main(args: Array<String>) {
    println("Donam un dia")
    val dia = readln().toInt()
    println("donam un mes")
    val mes  = readln().toInt()
    println("Donam un any")
    val any = readln().toInt()

    if(mes==1 || mes ==2 || mes==3)
        print ("estem dins el primer trimestre")
}
