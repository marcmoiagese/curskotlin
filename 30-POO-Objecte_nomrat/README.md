# 30- POO: Objecte nombrat

Una altra caracteristica de Kotlin, es poder definir un objecte de forma inmediata, sense tenir que declarar una classe. Amb la paraula "object" podem crear aquests objectes directament.

```kotlin
object NomDelObjecte {
	porpietats = ""
	metodes{}
}
```

per accedir als seus mètodes o propietats o podem fer com ho hem fet fins ara.

## Objectes locals a una funció o mètode.

Per poder definir objectes nombrats que no siguin globals com el descrit al [exemple 1](https://github.com/marcmoiagese/curskotlin/tree/master/30-POO-Objecte_nomrat) sino que estiguin definits dins una funció. Hem de definir una variable local i un objecte anònim ( es a dir, sense nom )

Per a definir un objecte local a una funció ha de ser anonim, es a dir, no tindre nom despres de la paraula clau object. El que tenim que fer es assignar el valor retornat per object a una variable.

```kotlin
val nmodelaVariable = object {
```

Després podem accedir a les propietats i metodes des de la variable.

```kotlin
nmodelaVariable.Metode()
nmodelaVariable.Propietat
```

## [Exemple1](https://github.com/marcmoiagese/curskotlin/tree/master/30-POO-Objecte_nomrat)

En aquest exemple definirem un objecte que es dira Mates amb una propietat que tindra el valor de PI i un metode que retorni un valor aleatori en un rang determinat

## [Exemple2](https://github.com/marcmoiagese/curskotlin/blob/master/30-POO-Objecte_nomrat/Exemple2/src/main/kotlin/Main.kt)

Crearem un objecte local dins de la funció main que permeti tirar 5 daus i guardi aquets valors dins un vector. Definirem una propietat que guardi 2 enters i tres mètodes
Un que carregui els 5 elements del vector amb valors aleatoris compresos entre 1 i 6.
Un altre que imprimeixi el vector i finalment un altre que retorni el valor mes gran del vector.

## Problemes

Defineix un objecte nombrat: 
```kotlin
object mesGran {
```
Amb tres mètodes anomenats "Màxim" amb dos parametres cada un. Els mètodes es diferenciaran en que un rep dades de tipus Int. un altre de tipus Float i finalment l'ultim rep dades de tipus. Els tres mètodes tenen que retornar la dada mes gran que reben. ( [Solució]() ]
