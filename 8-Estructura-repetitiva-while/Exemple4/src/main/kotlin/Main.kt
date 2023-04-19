/**
 * Una planta que produeix perfils de ferro, te un lot de peces.
 * Realitza un programa que sol·liciti la quantitat de peces a processar i després la longitud de cada perfil.
 * Tinguent en compte que les peces amb una longitud compresa entre 1,20 i 1,30 són aptes, imprimeix per pantalla la quantitat de peces aptes que hi ha al lot.
 */

fun main(args: Array<String>) {
    println("Bon dia, (❁´◡`❁) Quantes peces hem de processar avui?: ")
    val peces = readln().toInt()
    var x = 1
    var apte = 0
    while( x <= peces ){
        println("Donam el perfil per a la peça número $x")
        val perfil = readln().toDouble()

        if(perfil >= 1.20 && perfil <= 1.30)
            apte++
        x++
    }
    println("Hi Ha $apte peces aptes")

}