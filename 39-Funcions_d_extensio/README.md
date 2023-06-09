# 39- Funcions d'extensió

Una altra característica molt util de Kotlin es el concepte de les funcions d'extensió. Mitjansant les funcions d'extensió Kotlin ens permet afegir altres metodes a una classe existent sense tenir que heredar de la mateixa.

```kotlin
// Definir una classe de tipus String
class Paraula(val contingut: String)

// Definir una funció de extensió per a la classe String
fun String.contarLletres(): Int {
    return this.length
}

// Utilitzar la funció de extensió en una instància de la classe String
fun main() {
    val paraula = Paraula("Hola")
    val longitud = paraula.contingut.contarLletres()
    println("La paraula \"${paraula.contingut}\" té $longitud lletres.")
}
```

per definir una funció d'extensio a una classe hem de posar el nom de la funció que estem extenen en aquest exemple es String 

```kotlin
fun String.contarLletres(): Int {
```

Dins de la funció amb la paraula this, podem accedir al objecte que ha fet la crida de la funció que en aquest cas fa referncia a paraula.

```kotlin
return this.length
```

Cuan cridem a una funcio d'extensio ho fem de manera identica a les altres funcions que te la classe. Podem definir funcions d'extensió que sobrescriguin funcions ja existents a la classe, es a dir, podríam a la funció String crear una funcio anomenada capitalize() i definir una nova funcionalitat.

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/39-Funcions_d_extensio/Exemple1/src/main/kotlin/Main.kt)

Afegirem dues funcions a la classe String que ens permetin recuperar la meitat i la segona mitat

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/39-Funcions_d_extensio/Exemple2/src/main/kotlin/Main.kt)

Agregarem una funció a la classe IntArray que permeti imprimir tots els seus components a una línea.

## Problemes

- Afegir a la classe String un mètode imprimir que ensenyi tots els caracters que te guardats una línea. ( [Solució](https://github.com/marcmoiagese/curskotlin/blob/master/39-Funcions_d_extensio/Problema1/src/main/kotlin/Main.kt) )

- Fes una funció d'extensió anomenada "Fins" que te d'extreure la classe Int i te per objectiu ensenyar els valors desde el valor enter que li enviem a l'objecte, fins al valor que li arriba com a parametre.
   ```kotlin
     fun Int.hasta(fin: Int) {
   ```
   ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/39-Funcions_d_extensio/Problema2/src/main/kotlin/Main.kt) )
