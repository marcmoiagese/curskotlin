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

## [Exemple1](https://github.com/marcmoiagese/curskotlin/tree/master/30-POO-Objecte_nomrat)

En aquest exemple definirem un objecte que es dira Mates amb una propietat que tindra el valor de PI i un metode que retorni un valor aleatori en un rang determinat
