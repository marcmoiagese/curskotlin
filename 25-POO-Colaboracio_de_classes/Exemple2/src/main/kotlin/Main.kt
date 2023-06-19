/**
 * Fes un programa que permeti jugar a daus. Les regles del joc son:
 *
 * Es tiraran tres daus, si els tres surten amb el mateix valor ensenyar un missatge que posi "Has guanyat", sino "has perdut".
 * El primer que fem es identificar les classes i despres les propietats i els mètodes
 *  Dau
 *      propietats
 *          valor
 *      metodes
 *          tirar
 *          imprimir
 *  JocDeDaus
 *      propietats
 *          3 daus ( 3 objectes de dau )
 *      metode
 *          jugar
 */

class dau (var valor: Int){
    fun llensar(){
        valor = ( (Math.random() * 6)+1).toInt()
        imprimir()
    }

    fun imprimir(){
        println("El dau ha donat: $valor")
    }
}

class JocDeDaus {
    val dau1 = dau(1)
    val dau2 = dau(1)
    val dau3 = dau(1)

    fun  jugar(){
        dau1.llensar()
        dau2.llensar()
        dau3.llensar()
        if (dau1.valor == dau2.valor && dau2.valor == dau3.valor)
            println("Has Guanyat")
        else
            print("Has perdut")

    }
}

fun main(args: Array<String>) {
    val joc1 = JocDeDaus()
    joc1.jugar()
}