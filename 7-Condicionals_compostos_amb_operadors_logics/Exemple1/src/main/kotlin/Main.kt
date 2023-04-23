/**
 *
 * Al seguent exemple realitzarem un programa que llegeixi per teclat tres numeros i ens mostri el mes gran
 *
 */

fun main(args: Array<String>) {
    println("Donam el primer numero")
    val num1 = readln().toInt()
    println("Donam el segon numero")
    val num2 = readln().toInt()
    println("Donam el tercer numero")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3)
        print(num1)
    else
        if(num2>num3)
            print(num2)
        else
            print(num3)

}
