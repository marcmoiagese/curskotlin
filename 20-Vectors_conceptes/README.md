# Vectors: conceptes

Hem estat utilitzan variables de diferent tipus per enmagatzemar dades

	* Int
	* Float
	* Double
	* Byte
	* Short
	* Long
	* Char
	* Boolean

Ara veurem un altre tipus de variables que permeten enmagatzemar un conjunt de dades a una unica variable.

Un vector es una estructura de dades que permet enmagatzemar un conjunt de dades el mateix tipus.

Amb un unic nom es defineix un vector i mitjançant un index fem referencia a cada element del vector.

Un vector es representa típicament mitjançant una notació amb una fletxa sobre el símbol. Per exemple, un vector "v" es pot escriure com:

**v** = (v<sub>1</sub>, v<sub>2</sub>, ..., v<sub>n</sub>)

On v<sub>1</sub>, v<sub>2</sub>, ..., v<sub>n</sub> són les components del vector en cada una de les seves dimensions.

Per declarar un vector d'enters a Kotlin, podem fer-ho  de la seguent manera

```kotlin
val SocunVector: IntArray
SocunVector = IntArray(20)
```
La segona línea es per crear un vector reservan espai per a 5 components.

Podem declarar el vector a una sola linea

```kotlin
val SocunVector = IntArray(20)
```

Per accedir a cada component del vector utilitzarem claus, i mitjançant un subindex indicarem quin component estem processan.

```kotlin
SocunVector[i]
```
Els components comensen des de 0 fins al tamany que li hem indicat -1.

Igual que amb les cadenes de text, podem coneixer la longitud d'un vector

```kotlin
println(SocunVector.size)
```

La [biblioteca estandard de Kotlin]: https://kotlinlang.org/api/latest/jvm/stdlib/ te totes les classes basiques que es necessiten per programar amb aquest llenguatge organitzat amb paquets.

Al paquet [Kotlin]: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/ podem identificar que es troba declarada la classe IntArray.

Altres classes de vectors que tenim a Kotlin serien:

- ByteArray
- ShortArray
- LongArray
- FloatArray
- DoubleArray
- BooleanArray
- CharArray

## Propietats dels index
La classe IntArray te una propietat IntRange que enmagatzema el rang minim i maxim del vector. La propietat indices la podem utilitzar al for per recorrer els diferents components que formen el vector.

```kotlin
for ( i in vector.indices) {}
```
Es mes convenient utilitzar la propietat indices que vector.size-1

També podem recorrer el vector dins un for de la seguent manera:

```kotlin
for ( element in vector )
	println(element)
```


