/**
 * Escriu un programa que demani la cordenada d'un pun en un pla, es a dir, dos valors enters x i Y que siguin diferents a 0 i posteriorment imprimir per pantalla a quin quadrant
 * s'ubica el punt, tenin en compte  que el primer cuadrant es si la x > 0 i la Y > 0. I el segon quadran es si la x < 0 i la Y es > 0, etc
 */

fun main(args: Array<String>) {
    print("Donam la coordenada x:")
    val x = readln().toInt()
    print("Donam la coordenada y:")
    val y = readln().toInt()
    if (x > 0 && y > 0)
        print("esta al primer quadran")
    else
        if (x < 0 && y > 0)
            print("Esta al segon quadran")
        else
            if (x < 0 && y < 0)
                print("Esta al tercer quadran")
            else
                if (x > 0 && y < 0)
                    print("Esta al quart quadran")
                else
                    print("Esta sobre un eix")
}