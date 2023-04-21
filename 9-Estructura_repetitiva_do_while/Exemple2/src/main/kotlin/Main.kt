/**
 * Realitza un programa que permeti ingressar el pes en kg de peces, el proces acabara quan introduim el numero 0.
 * S'ha d'informar de cuantes peces hi ha amb un pes entre 9.8KG i 10.2KG, Cuantes amb mes de 10,2KG i cuantes amb  menys de 9,8KG.
 * També informarem de la cantitat toal de peces pesades.
 */

fun main(args: Array<String>) {
    var cantitat1 = 0
    var cantitat2 = 0
    var cantitat3 = 0

    do{
        println("Donam el pes de la peça, o 0 per acabar: ")
        val pes = readln().toDouble()
        if(pes > 10.2)
            cantitat1++
        else
            if(pes >= 9.8)
                cantitat2++
            else
                if(pes >0)
                    cantitat3++
    }while(pes != 0.0)

    println("Peces aptes: $cantitat2")
    println("Peces amb un pes superior a 10.2: $cantitat1")
    println("Peces amb un pes inferior a 9.8: $cantitat3")
    val suma =  cantitat1 + cantitat2 + cantitat3
    println("Cantitat total de peces processades: $suma")
}