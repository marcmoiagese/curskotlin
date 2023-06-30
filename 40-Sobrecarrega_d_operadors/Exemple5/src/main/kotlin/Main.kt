/**
 * Implementarem una classe Joc que defineixi una propietat pel taulell que sigui un IntArray de 9 elements amb valor 0.
 * Hi haura 2 jugadors que disposin fixes, el primer jugador carrega el 1 i el segon carrega un 2.
 * Mitjançant sobrecarrega d'operadors de subindex permitirem assignar les  fixes a cada posició del taulell a través de dos subindex que indiquen la fila i la columna del taulell.
 */

class Joc{
    // La propietat taulell guarda les nou caselles del joc dins un vector. Per a que sigui mes intuitiu la carrega de fitxes al joc sobrecarregare, l'operador de subindex amb fila i columna
    val taulell  = IntArray(9)

    // La impresió del taulell accedeix amb this a la sobrecarrega del operador de subindex accedin al mètode get:
    fun imprimir(){
        for(fila in 0..2){
            for(columna in 0..2)
                print("${this[fila, columna]} ")
            println()
        }
        println()
    }

    // Cada asignació crida al metode set, que ademes de ccarregar la fitxa pasa a imprimir el taulell
    operator fun set(fila: Int, columna: Int, valor: Int){
        taulell[fila*3 + columna] = valor
        imprimir()
    }

    // Implementem amb get la sobrecàrrega per recuperar el valor enmagatzemat
    operator fun get(fila: Int, columna: Int): Int{
        return taulell[fila*3 + columna]
    }
}

fun main(args: Array<String>) {
    val joc = Joc()

    // Aqui indiquem la fila i la columna jugan amb una matriu, i la fixa que es carrega
    joc[0, 0] = 1
    joc[0, 2] = 2
    joc[2, 0] = 1
    joc[1, 2] = 2
    joc[1, 0] = 1
}