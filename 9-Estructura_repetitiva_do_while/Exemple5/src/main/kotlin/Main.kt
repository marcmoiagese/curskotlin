/**
 * Un Banc procesa dades de les comptes corrents dels seus clients. De cada compte corrent, coneixem el numero de compte i el saldo actual.
 * L'entrada de dades s'acabara al introduir un valor negatiu al numero de compte.
 * Realitza un programa que llegeixi les dades dels comptes corrents i informi
 * - De cada dompte, numero de compte i estat del compte segons el seu saldo, sabent que,
 *   Estat del compte  'Acreedor' si el saldo es >0.
 *                     'Deudor' si el saldo es <0.
 *                     'Nul' si el saldo es = 0
 * - La suma total dels saldos
 */

fun main(args: Array<String>) {
    var suma = 0.0
    do {
        print("Donam un numero de compte: ")
        val compte = readln().toInt()
        if ( compte >= 0) {
            print("Donam una cantitat: ")
            val fons = readln().toDouble()
            if (fons > 0) {
                println("Equilibri creditor.")
                suma += fons
            } else
                if (fons < 0)
                    println("Equilibri Deutor.")
                else
                    println("Equilibri Nul.")
        }
    } while(compte>=0)
    println("Total: $suma")
}