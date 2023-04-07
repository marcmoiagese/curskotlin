/**
 * Quan volem imprimir dades per pantalla, utilitzem les funcions print i println. Si el que necessitem és introduir dades per teclat, podem utilitzar la funció readln.
 *
 * El següent exemple ens ensenya com carregar per teclat dos números enters i imprimir per pantalla la suma i el seu producte.
 */

fun main(arguments: Array<String>) {
    print("Introdueix el primer número: ")
    val num1 = readln().toInt()
    print("Introdueix el segon número: ")
    val num2 = readln().toInt()
    val suma = num1 + num2
    println("La suma de $num1 i $num2 és $suma")
    val producte = num1 * num2
    println("El producte de $num1 i $num2 és $producte")
}

/**
 *  Per recollir dades des de la consola, disposem de la funció readln(), que ens permet llegir les dades que l'usuari introdueixi per teclat.
 *  Aquesta funció retorna una cadena de caràcters amb els valors introduïts fins que es prem la tecla Enter. Per convertir aquesta cadena a un valor numèric,
 *  podem utilitzar el mètode toInt() de la classe String. D'aquesta manera, podem guardar el valor numeric dins de la variable val1.
 *
 *  Si l'operador prem enter sense haver introduït cap valor, es produeix una excepció que més endavant veurem com tractar.
 */