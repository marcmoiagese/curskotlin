# 42- Valors nuls a les variables

Fins ara no hem analitzat com Kotlin tracta els valors nuls (null) a la definició de variables.

Kotlin tracta de manera diferent les variables que poden enmagatzemar un valor null de les que no.

Fins ara hem vist variables que no poden enmagatzemar un valor null, per permetre que una variable contingui un valor null, hem d'agregar el caracter "?" al moment que definim el tipus de variable, amb axo indiquem al compilador de Kotlin que son variables que permeten enmagatzemar el valor null.

```kotlin
fun main(args: Array<String>) {
    var telefon: Int?
    telefon = null
    var vector: IntArray? = IntArray(5)
    vector = null
}
```

Cuan treballem amb variables que poden guardar valors nuls, el nostre codi ha de verificar el valor que guarda la variableCuan treballem amb variables que poden guardar valors nuls, el nostre codi ha de verificar el valor que guarda la variable.

Per tal de fer mes simples els nostres programes, fins ara cuan carregavam dades per teclat, cridavam la  funcio readLine() i l'operador !! al final, això era perque la funció readLine retorna un tipus de dada String?.

```kotlin
public fun readLine(): String? = stdin.readLine()
```

Així doncs, el següent exemple:

```kotlin
fun main(args: Array<String>) {
    var nom: String
    print("Donam el teu nom:")
    nom = readln()
    println("El nom introduit es $nom")
}
```

Ara el podem modificar per que quedi aixi:

```kotlin
fun main(args: Array<String>) {
    var nom: String?
    print("Donam el teu nom:")
    nom = readLine()
    println("El nom introduit es $nom")
}
```
Com pots veure, ara no posem l'operador !! al final de la crida a readLine

## Control de nuls

Cuan treballem amb variables que poden enmagatzemar valors nuls, podem mitjansant if verificar si el seu valor es diferent a null.

```kotlin
fun main(args: Array<String>) {
    var cadena1: String? = null
    var cadena2: String? "Hola"
    if (cadena1 != null)
	println("cadena1 guarda $cadena1")
    else
        println("cadena1 apunta a null")
    
    if (cadena2 != null)
       println("cadena2 guarda $cadena2")
    else
       println("cadena2 apunta a null)
}
```

Podem intentar cridar els seus metodes i propietats sense que es generi un error cuan disposem del operador "?" seguit de la varialbe.

```kotlin
var cadena1: String? = null
println(cadena1?.length)
```

Simprimiría per pantalla un null, pero no un error, ja que no s'accedeix a la propietat length de la classe String, perque guarda un null. Aquesta síntaxis es molt convenient, si tenim crides tipus:

```kotlin
if ( treballador?.dadesPersonals?.telefon? != null )
```

Si cualsevol dels objectes apunta a null, el if s'identificarà com a fals. Un exemple d'accés sería:

```kotlin
data class DadesPersonals(val nom: String, val telefon: Int?)
data class Treballador (val numTreballador: Int, val dadesPersonals: DadesPersonals?)

fun main (args: Array<String>){
    var treballador: Treballador?
    treballador = Treballador(100, DadesPersonals("Joan", null))

    if (treballador?.DadesPersonals?.telefon == null)
          println("El treballador no te telefon")
    else
          println("El telefon del treballador es ${treballador?.DadesPersonals?.telefon}")
}
```

Amb aquesta síntaxis diem que la variable treballador pot guardar null ( per exemple si l'empresa no te treballadors):

```kotlin
  var treballador: Treballador?
```

La propietat DadesPersonals de la classe Treballador pot guardar null ( per exemple si no tenim les dades personals del trevallador)

```kotlin
data class Treballador (val numTreballador: Int, val dadesPersonals: DadesPersonals?)
```

La classe DadesPersonals te una propietat telefon que pot guardar null ( per exemple si el treballador no te telefon)

```kotlin
data class DadesPersonals(val nom: String, val telefon: Int?)
```

Per imprimir el teléfon d'un treballador hem de controlar primer si existeix, si te guardades les seves dades personals i si te el seu telèfon, una aproximació amb if seria:

```kotlin
if (treballador != null)
    if (treballador.DadesPersonals != null)
       if(treballador.DadesPersonals?.telefon != null)
           println("El telefon del treballador es ${treballador.DadesPersonals?.telefon}")
```

Anem analitzan si conté valors null fins arribar al telefon. Però amb Kotlin, la sintaxis mes consisa per arribar a telefon es:

```kotlin
    if (treballador?.DadesPersonals?.telefon == null)
          println("El treballador no te telefon")
    else
          println("El telefon del treballador es ${treballador?.DadesPersonals?.telefon}")
```

Ja sigui que treballador guardi null o la propietat DadesPersonals guardi null, retorna null l'expresió
