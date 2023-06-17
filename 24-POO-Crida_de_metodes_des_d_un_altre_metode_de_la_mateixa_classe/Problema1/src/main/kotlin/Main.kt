/**
 * Declara una classe anomenada Fills. Defineix dins de la mateixa un vector per enmagatzemar les edats de 5 persones.
 * * Defineix un mètode carregar on s'introdueixi per teclat el vector de les edats, i cridi a 2 metodes que imprimeixin el que tingui l'edat mes gran i el promig de les edats.
 */

class Fills{
    val edats = IntArray(5)

    fun carregar(){
        for (i in edats.indices){
            println("Donam el valor $i: ")
            edats[i] = readln().toInt()
        }
        mesGran()
        promig()
    }

    fun mesGran() {
        var mesgran = edats[0]
        for (i in edats.indices)
            if (edats[i] > mesgran)
                mesgran = edats[i]
        println("El fill amb mes anys es $mesgran")
    }

    fun promig(){
        var promig = 0
        for ( i in edats.indices){
            promig += edats[i]
        }
        promig = promig / edats.size
        println("El promig es de $promig")
    }

}

fun main(args: Array<String>) {
    val fill1 = Fills()
    fill1.carregar()
}