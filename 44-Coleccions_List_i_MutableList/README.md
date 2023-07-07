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

## [Exemple 3](https://github.com/marcmoiagese/curskotlin/blob/master/44-Coleccions_List_i_MutableList/Exemple3/src/main/kotlin/Main.kt)

Crearem una llista mutable amb les edats de diverses persones. Probarem les propietats i mètodes principals per administrar la llista mutable.

## [Exemple 4](https://github.com/marcmoiagese/curskotlin/blob/master/44-Coleccions_List_i_MutableList/Exemple4/src/main/kotlin/Main.kt)

Crearem una llista mutable de 20 elements amb valors aleatoris compresos entre 1 i 6. Comptarem cuants elements te guardats el valor 1. Eliminarem els elements que guarden un 6.

## [Exemple 5](https://github.com/marcmoiagese/curskotlin/blob/master/44-Coleccions_List_i_MutableList/Exemple5/src/main/kotlin/Main.kt)

Crearem una classe anomenada Persona que tindra com a propietats el seu nom i edat. A més a més, definirem dos metodes, un que imprimeixi les propietats i un altre que ensenyi si es major d'edat.
Definir una llista mutable d'objectes de la classe Persona.
Imprimir les dades de totes les persones.
Imprimir cuantes persones son majors d'edat.
