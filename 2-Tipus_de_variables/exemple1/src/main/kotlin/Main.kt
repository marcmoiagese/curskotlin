/**
 * Podríem definir una variable com un dipòsit on enmagatzemem un valor, que consta d'un nom i pertany a un tipus determinat. Per exemple, en Kotlin, si necessitem emmagatzemar un valor numèric sencer, podem definir una variable utilitzant un dels següents tipus:
 *
 * - Int: per a valors enters
 * - Short: per a valors enters curts
 * - Long: per a valors enters llargs
 * - Byte: per a valors enters d'un byte
 *
 *  Depenent del valor màxim que vulguem enmagatzemar, utilitzarem un dels següents tipus de variables enters en Kotlin. Per exemple, si volem enmagatzemar un valor màxim de 2147483647, utilitzarem el tipus de variable Int. En general, tenim les següents opcions:
 *                                        Minim                           Maxim
 *  - Byte                                 -128                            +127
 *  - Short                             -32 768                         +32 767
 *  - Int                        -2 147 483 648                  +2 147 483 647
 *  - Long           -9 223 372 036 854 775 808      +9 223 372 036 854 775 807
 *
 *  Si necessitem enmagatzemar un valor amb part decimal, com podria ser el número π, hem d'utilitzar una variable del tipus:
 *
 *     Double: per a valors amb punt flotant de precisió doble (64 bits)
 *     Float: per a valors amb punt flotant de precisió simple (32 bits)
 *
 *  Amb aquestes variables, podem enmagatzemar valors amb part decimal amb diferents nivells de precisió, depenent de les necessitats del nostre programa. Per exemple, el tipus Double té major precisió que el tipus Float. ja que el tipus Double utilitza 64 bits per a enmagatzemar valors amb punt flotant, mentre que el tipus Float només en utilitza 32. Això significa que el tipus Double pot representar valors amb més dígits decimals i amb menys errors d'arrodoniment que el tipus Float.
 *
 *  Un altre tipus de variable que tenim són les de tipus String, que ens permeten enmagatzemar un conjunt de caràcters. Les variables de tipus String són especialment útils per a enmagatzemar text, com ara noms, adreces o missatges que el nostre programa necessiti processar o mostrar a l'usuari.
 *
 *  Una variable en Kotlin pot ser immutable, és a dir, el seu valor és constant un cop s'ha assignat un valor, i no li podem canviar el valor, o pot ser mutable, és a dir, que podem canviar el valor emmagatzemat durant l'execució del programa.
 *
 *  Les variables immutables són útils quan necessitem assegurar-nos que el valor d'una variable no canvia en la nostra lògica de programació, cosa que pot ajudar a prevenir errors i simplificar el nostre codi. Les variables mutables, per altra banda, són útils quan necessitem actualitzar el valor d'una variable al llarg del temps, com ara en el cas d'un contador que incrementa en valor a mesura que el programa s'executa.
 *
 *  Quan vulguem definir variables immutables amb Kotlin, utilitzarem la paraula "val". Per exemple:
 *
 *  val edat: Int
 *  edat = 35
 *  val sou: Float
 *  sou = 100000€
 *  val total: Double
 *  total = 70000.24
 *  val titol: String
 *  titol = "Ventes"
 *
 *  Si intentem modificar el valor d'una variable immutable, el compilador ens donarà un error.
 *
 *  També disposem de la variable 'char' per quan necessitem emmagatzemar un únic valor. Per exemple, si volem emmagatzemar una lletra en una variable mutable:
 *
 *  var continua:Char='s'
 *
 *  Finalment, si el que necessitem és emmagatzemar un valor de tipus lògic, hem de crear una variable booleana, que només pot contenir els valors vertader o fals.
 *
 *  var fin:Boolean=false
 *
 */

/**
 *  El Seguent exemple crearem un programa que defineixi dues variables immutables de tipus Int. Després definir una tercera variable mutable que emmagatzemi la suma de les dues primeres variables i la mostri. Seguidament, emmagatzemar en la variable el producte de les dues primeres variables i mostrar el resultat.
 */

fun main(parametre: Array<String>) {
    val val1: Int // Declaro variable inmutable
    val val2: Int // Declaro variable inmutable
    val1 = 100 // Inicialitzo variable inmutable
    val2 = 400 // Inicialitzo variable inmutable
    var resultat: Int // Declaro un valor mutable
    resultat = val1 + val2
    println("El sumatori de $val1 + $val2 dona $resultat")
    resultat = val1 * val2
    println("El producte de $val1 * $val2 dona $resultat")
}

