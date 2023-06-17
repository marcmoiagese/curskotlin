/**
 * Crea una classe anomenada Alumne que tingui com a propietats el seu nom i nota. Al constructor li arriva el seu nom i la seva nota.
 * * Imprimir el nom i la nota.
 * * Imprimir un missatge si la nota es superior o igual a 5 indican que esta aprobat.
 * * Defineix dos objectes de la classe Alumne.
 */

class Alumne (var nom: String, var nota: Int){

    fun imprimeixDades(){
        println("El seu nom es: $nom i la nota es $nota")
    }

    fun aprobat(){
        if (nota >= 5)
            println("Aprobat")
    }
}

fun main(args: Array<String>) {
    var a1 = Alumne("Javi", 5)
    a1.imprimeixDades()
    a1.aprobat()

    var a2 = Alumne("M.Rajoy", 4)
    a2.imprimeixDades()
    a2.aprobat()
}