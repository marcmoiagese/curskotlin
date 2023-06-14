/**
 * Fes una funcio que rebi entre 2 i 5 enters. Aquesta funció ens retornara la suma d'aquets valors, aquesta funció tindra 3 parametres per defecte.
 */

fun sumSum(v1: Int, v2: Int, v3: Int=0,v4: Int=0, v5: Int=0) = v1 + v2 + v3 + v4 + v5

fun main(args: Array<String>) {
    println("La suma de 5+6 es: ${sumSum(5,6)}")
    println("La suma de 1+2+3 es: ${sumSum(1,2,3)}")
    println("La suma de 1+2+3+4+5 es: ${sumSum(1,2,3,4,5)}")
}