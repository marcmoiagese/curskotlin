/**
 * Fes una funció que ensenyi la taula de multiplicar del valor que li enviem com a paràmetre. Definirem un segon parametre anomenat terme i que per defecte tindra el valor 10.
 * Es tenen d'ensenyar tants valors de la taula de multiplicar com indicara el segon parametre.
 * Cridarem des de la funció main amb arguments nombrats.
 */

fun multiplica(num: Int, taula: Int = 10){
    for(i in 0..taula){
        println("$num x $i = ${num*i}")
    }
}

fun main(args: Array<String>) {
    multiplica(5)
    multiplica(3, 20)
}