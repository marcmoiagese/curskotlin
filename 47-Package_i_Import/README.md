# 47- Package i Import

Els paquets ens permeten agrupar classes, funcions, objectes, constants, etc. en un espai de noms per facilitar el seu us i manteniment.

Els paquets agrupen funcionalitats sobre un tema especific, per exemple funcionalitats per l'acces a base de dades, interficies visuals, encriptacio de dades, acces a fitxers, comunicacións web, etc.

Els paquets son una forma molt utili i efectiva a l'hora d'organitzar el nostre codi. Ja sigui per un projecte en concret, o reutilitzarlo en altres.

La llibreria estandard de Kotlin s'organitza en paquets, els principals son:

```kotlin
kotlin
kotlin.annotation
kotlin.collections
kotlin.comparisons
kotlin.io
kotlin.ranges
kotlin.sequences
kotlin.text
```

Tots aquets paquets s'importen de forma automàtica cuan compilem la nostra aplicació. Per exemple el paquet [Kotlin.collections](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/) te les declaracions de classes i interfaces: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list.html), [MutableList](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list.html), etc.

Per veure com funciona, crearem un paquet anomenat matematiques i definirem dos funcions al seu interior que ens permetran sumar i restar dos valors de tipus int. Importarem despres aquest paquet des del nostre programa principal i cridarem aquestes funcions.

El primer pas, despres de crear el nou projecte amb IntelliJ IDEA ens posem sobre el directori src/main/kotlin, i amb el botó dret del ratolí seleccionem New --> Package

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/47-Package_i_Import/img/1.jpg)

Li indiquem que volem crear un nou paquet anomenat "matematiques"

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/47-Package_i_Import/img/2.jpg)

Ara, dins d'aquest directori, procedim a crear un arxiu dins d'aquesta nova carpeta premen boto dret i despres premen sobre Kotlin Class/File

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/47-Package_i_Import/img/3.jpg)

I l'anomenare funcions. Tinguis en compte que un paquet pot contenir molts arxius.

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/47-Package_i_Import/img/4.jpg)

Ara que ja tenim l'arxiu creat, podem comensar a crear el seu contingut

![IMG](https://github.com/marcmoiagese/curskotlin/blob/master/47-Package_i_Import/img/5.jpg)

Dins del fitxer posem el seguent codi, que conte les funcions per sumar i restar.

```kotlin
package matematiques

fun sumar(valor1: Int, valor2: Int) = valor1 + valor2

fun restar(valor1: Int, valor2: Int) = valor1  + valor2
```

El nom del paquet va a la primera línea del codi fon, després de la paraula clau package.

Ara escriurem el programa principal on utilitzarem les funcionalitats d'aquest paquet. Crearem un nou fitxer anomenat Principal.kt que pengi dins de src/main/kotlin i li posem el següent codi

```kotlin
import matematiques.*

fun main(args: Array<String>) {
    val sumatori = sumar(10, 3)
    println("El resultat de la suma es $sumatori")

    val resta = restar(20, 10)
    println("El resultat de la resta es $resta")
}
```

Per importar totes les funcions definides dins el paquet matematiques, utilitzem la paraula clau import seguida del nom del paquet i depres un .*

```kotlin
import matematiques.*
```

un cop importat, ja podem utilitzar les seves funcions. Si no posem l'import, ens donarà error. Si volem, podem importar nomes una funció 

```kotlin
import matematiques.restar
```

també podem crear un alias al importar una funció

```kotlin
import matematiques.restar as restaEnters

fun main(args: Array<String>) {
    val resta = restaEnters(20, 10)
    println("El resultat de la resta es $resta")
}
```

Aixo es util cuan importem funcions de dos paquets ue tenen el mateix nom. Si no disposem del import, tambe podem indicar el paquet previ al nom de la funció.

```kotlin
fun main(args: Array<String>) {
    val sumatori = matematiques.sumar(10, 3)
    println("El resultat de la suma es $sumatori")

    val resta = matematiques.restar(20, 10)
    println("El resultat de la resta es $resta")
}
```

## Problemes

- Crea un paquet anomenat entradadeteclat. Dins del paquet crea un arxiu anomenat entrada.kt i defineix les seguents funcions:

  ```kotlin
  package entradadeteclat
  
  fun retornarInt(missatge: String): Int{
      print(missatge)
      return readln().toInt()
  }
  
  fun retornarDouble(missatge: String): Double {
      print(missatge)
      return readln().toDouble()
  }

  fun retornarFloat(missatge: String): Float{
      print(missatge)
      return readln().toFloat()
  }
  ```

  Al programa principal que anomenarem Principal.kt importarem el paquet entradateclat i cridarem les seves funcions. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/47-Package_i_Import/Problema1/src/main/kotlin/Principal.kt) )
