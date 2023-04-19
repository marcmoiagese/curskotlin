/**
 * Fes un programa que permeti carregar dos llistes de 5 valors cada una, Informar amb un missatge de quina de los dues llistes te un valor acumulat mes gran
 */

fun main(args: Array<String>) {
    var llista1 = 0
    var llista2 = 0
    var x=1

    println("Carregan la llista 1")
    while( x <= 5){
        println("donam el numero numero $x : ")
        val valor = readln().toInt()
        llista1 =  llista1+valor
        x++
    }
    x=1
    println("Carregan la llista 2")
    while( x <= 5){
        println("donam el numero numero $x : ")
        val valor = readln().toInt()
        llista2 =  llista2+valor
        x++
    }

    if(llista1 > llista2)
        println("La llista 1 es mes gran amb un valor de $llista1 versus $llista2")
    else
        if (llista2 > llista1)
            println("La llista 2 es mes gran amb un valor de $llista2 versus $llista1")
        else
            println("Son iguals")
}