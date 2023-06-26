/**
 * Declara una classe abstracta Compte, i dos subclasses CaixaEstalvis i PlasFixe.
 * Defineix les propietats i mètodes comuns entre una caixa d'estalvis i un plaç fixe i agrupals en una classe Compta.
 *
 * Una caixa d'estalvis i un plaç fixe tenen un nom de titular i un saldo. Un plaç fixe afegeix un plaç d'imposició en dies i una tasa de interés.
 * Fer que la caixa d'estalvis no generi interessos.
 * A la funció main del programa, definir un objecte de la clase CaixaEstalvis i un altre de la clase PlasFixe.
 */

abstract class Compte(val nom: String, val saldo: Double){
    open fun imprimir(){
        println("Titular: $nom")
        println("Saldo: $saldo")
    }

}

class CaixaEstalvis(nom: String, saldo: Double): Compte(nom, saldo){
    override fun imprimir(){
        println("Compte caixa estalis a nom de $nom")
        super.imprimir()
    }
}

class PlasFixe(nom: String, saldo: Double, val imposicio: Int, val interes: Double): Compte(nom, saldo){
    override fun imprimir() {
        println("Aquest es el compte a plaç fixe")
        println("Plaç a pagar en dies: $imposicio")
        println("Els interesos son: $interes")
        val guany = saldo * interes / 100
        println("Import del interes $guany")
        super.imprimir()
    }
}

fun main(args: Array<String>) {
    val caixaEst1 = CaixaEstalvis("pepito", 622.3)
    caixaEst1.imprimir()

    val plasfix1 = PlasFixe("Lluisa", 92489.0, 366, 1.32)
    plasfix1.imprimir()
}