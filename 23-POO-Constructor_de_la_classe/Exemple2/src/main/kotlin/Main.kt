/**
 * Desenvoluparem una classe que carregara els costats d'un triangle i implenetara els següents mètodes:
 * * Inicialitzara les propietats.
 * * Imprimira el valor del costat que sigui mes gran.
 * * Ens mostrarà si es equilater o no.
 */

class Triangle (var costat1: Int, var costat2: Int, var costat3: Int){

    fun carregaGran(){
        print("Costat gran: ")
        when {
            costat1 > costat2 && costat1 > costat3 -> println(costat1)
            costat2 > costat3 -> println(costat2)
            else -> println(costat3)
        }
    }

    fun esEquilater() {
        if (costat1 == costat2 && costat1 == costat3)
            print("Es un equilater")
        else
            print("No es equilater")
    }

}

fun main(args: Array<String>) {
    val triangle1 = Triangle(12, 45, 24)
    triangle1.carregaGran()
    triangle1.esEquilater()
}