/**
 * Fes un programa que compti cuants multiples de 3, 5 i 9 hi ha al rang de 1 a 10000 ( No es carregaran valors per teclat )
 */

fun main(args: Array<String>) {
    var multiple3 = 0
    var multiple5 = 0
    var multiple9 = 0

    for(i in 1..10000){
        if(i % 3 ==  0)
            multiple3++
        if(i % 5 == 0)
            multiple5++
        if(i % 9 == 0)
            multiple9++
    }
    println("La cantitat de multiples de tres es $multiple3 la de multiples de 5 es $multiple5 i la de multiples de 9 es $multiple9")
}