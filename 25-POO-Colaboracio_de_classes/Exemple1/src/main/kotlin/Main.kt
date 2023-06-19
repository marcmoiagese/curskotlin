/**
 * Un Banc te 3 clients que poden fer diposits i extraccions. El banc també requereix que al final del dia calculi la cantitat de diners que hi ha depositats.
 *
 * El primer que farem es identificar les classes. Podríam dir que hi ha dos classes, la client i la del banc
 *
 * Després definir les propietats i mètodes que tindra cada classe
 *
 * Cloent
 *     Propietats
 *          Nom
 *          Saldo
 *     Metodes
 *          Diposit
 *          Extreure
 *          Imprimir
 *
 * Banc
 *      Propietats
 *          3 Clients ( 3 objectes de la classe client )
 *      Mètodes
 *          Operar
 *          Diposits totals
 */

class Client (var nom: String, var saldo: Float){

    fun diposits(saldo: Float){
        this.saldo += saldo
    }

    fun extreure(saldo: Float){
        this.saldo -= saldo
    }

    fun imprimir(){
        println("$nom te un saldo de $saldo")
    }
}

class Banc{
    val client1: Client = Client("Pere", 0f)
    val client2: Client = Client("Martina", 0f)
    val client3: Client = Client("Monica", 0f)

    fun operar(){
        client1.diposits(100f)
        client2.diposits(150f)
        client3.diposits(200f)
        client3.extreure(150f)
    }

    fun dipositsTotals(){
        val total = client1.saldo + client2.saldo + client3.saldo
        println("El total que te el bang es: $total")
        client1.imprimir()
        client2.imprimir()
        client3.imprimir()
    }
}

fun main(args: Array<String>) {
    val banc1 = Banc()
    banc1.operar()
    banc1.dipositsTotals()
}