Els bucles 'for' a Kotlin tenen algunes variants. En aquest cas, veurem el 'for' amb expressions de rang.
Un rang defineix un interval amb un valor inicial i un valor final, i es defineix utilitzant el valor.

```kotlin
..
```
Exemples de definició de rang serien:

```kotlin
val undigit = 1..9
val dotzena = 1..12
var lletres = 'a'..'z'
```

Si necessitem conèixer si un valor es troba dins un rang, hem d'utilitzar l'operador 'in' o '!in'.

```kotlin

val dotzena = 1..12
if(5 in dotzena)
	println("el 5 esta dins el rang de la dotzena")

if(18 !in dotzena)
	println("el 18 no esta dins el rang de la dotzena")
```

Els dos if es verifiquen com a cert
