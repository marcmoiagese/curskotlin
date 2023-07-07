# 44- Coleccions: List i MutableList

Una llista es una colecció ordenada de dades. Es pot recuperar un element per la posicio a la que es troba dins la colecció.

A Kotlin podem crear tan llistes inmutables com mutables. 

Podem crear una llista inmutable de la següent manera

```kotlin
var nomVariable: List<TipusDada> = lostOf("Diferents", "Elements", "de", "la", "llista")
```

D'altra banda, podem crear llistes mutables, de la següent manera.

```kotlin
val nomvariable: MutableList<TipusDada> = mutableListOf("Diferents", "Elements", "de", "la", "llista")
```

Podem veure mes propietats i metodes de List des de la documentació de la [llibreria estándard](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/) de Kotlin. I per a les Mutables també ho podem veure des de la [llibreria estandard](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/)

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/44-Coleccions_List_i_MutableList/Exemple1/src/main/kotlin/Main.kt)

Crearem una llista inmutable amb els dies de la setmana. Probarem les propietats i metodes principals per administrar la llista.

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/44-Coleccions_List_i_MutableList/Exemple2/src/main/kotlin/Main.kt)

Ara veurem com crear una llista inmutable pero utilitzarem la funció  List a la cual li enviarem el tamany de la llista i una funció lambda indican quins valors guardar.

## [Exemple 3]()

Crearem una llista mutable amb les edats de diverses persones. Probarem les propietats i mètodes principals per administrar la llista mutable.
