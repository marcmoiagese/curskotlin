/**
 *  Fes un programa que reculli la cantitat de preguntes que s'han realitzat i la cantitat de preguntes que s'han encertat correctament,
 *  a partir d'això informarem del nivell segons les següents dades.
 *
 *  Maxim:	Percent >=90%.
 * 	Mig:	Percent>=75% y <90%.
 * 	regular:	Percent>=50% y <75%.
 * 	nul:	Percent<50%.
 *
 */

fun main(args: Array<String>) {
    println("Digam quantes preguntes hi ha: ")
    val preguntes = readln().toInt()

    println("Digam d'aquestes quantes ha encertat correctament: ")
    val encerts = readln().toInt()

    if ( encerts <= preguntes ){

        val percent = encerts * 100 / preguntes

        if(percent >= 90) {
            println("El percentatge es $percent per tan: Maxim")
        }else if(percent >= 75){
            println("El percentatge es $percent per tan: Mig")
        }else if(percent >= 50){
            println("El percentatge es $percent per tan: Regular")
        }else if(percent < 50){
            println("El percentatge es $percent per tan: Nul")
        }

    }else{
        println("No cuadra")
    }

}