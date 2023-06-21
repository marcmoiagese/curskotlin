/**
 * Crea una classe anomenada Dau, que tingui una propietat anomenada valor  que permeti carregar un valor compres entre 1 i 6. Si rep un valor que no esa dins el rang tornar 1.
 * Definir dos mètodes, un que generi un numero aleatori entre 1 i 6 i l'altre que imprimeixi.
 * Al constructor li arriba el valor inicial que te que tenir el dau. ( intentar enviarli el numero 7)
 */

class Dau( valor: Int,){

    var valor: Int = 1
        set(valor){
            if (valor > 6 || valor <= 0)
                field = 1
            else
                field = valor
        }

    init{
        this.valor = valor
    }

    fun aleatori(){
        valor = ( (Math.random() * 6)+1).toInt()
    }

    fun imprimir()  = println("El dau ha donat: $valor")
}

fun main(args: Array<String>) {
    var dau1 = Dau(7)
    dau1.imprimir()
    dau1.aleatori()
    dau1.imprimir()
}