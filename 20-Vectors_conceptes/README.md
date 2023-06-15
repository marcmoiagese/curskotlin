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

La [biblioteca estandard de Kotlin](https://kotlinlang.org/api/latest/jvm/stdlib/) te totes les classes basiques que es necessiten per programar amb aquest llenguatge organitzat amb paquets.

Al paquet [Kotlin](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/) podem identificar que es troba declarada la classe IntArray.

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

## Altres característiques que poden ser utils.

Podem imprimir cada element i el seu index iteran el vector cridan al metode  withIndex de la clasae IntArray

```kotlin
for( (index, element) in vector.withIndex() )
	println("Al index $index es guarda l'element $element")
```

També pots utilitzar el metode withIndex per carregar valors.

```kotlin
for( (index, element) in vector.withIndex() ){
	print("Donam un valor: ")
	vector[index] = readln().toInt()
}
```

## Classe Array

Kotlin te una classe generica anomenada Array que permet enmagatzemar valors de cualsevol tipus primitiu i tambe de tipus objecte que ja veurem mes endavan de que es tracta.

Podem  crear un vector amb dades de tipus double:

```kotlin
fun main(parametre: Array<String>){
	val salaris=arrayOf<Double>(1200.0, 1700.50m, 6000.0)
	for(i in 0..salaris.size-1)
		print("${salaris[i]} - ")
}
```

Amb la funció arrayOf indiquem els elements a guardar al vector.

Podem utilitzar la funció arrayOfNulls i pasar com a parametre la cantitat d'espai a reservar.

```kotlin
fun main(parametre: Array<String>){
	val altures = arrayOOfNulls<Float>(3)
	altures[0]=1.72f
	altures[1]=1.79f
	altures[2]=1.67f
	for(index in 0..altures.size-1)
		print("${altures[index]} -"
}
```

Ara podem entendre el parametre que arriba a la funció main de tot programa Kotlin:

```kotlin
fun main(args: Array<String>) {}
```
Es un vector de tipus string. 

Si executem el [seguent programa:](https://github.com/marcmoiagese/curskotlin/blob/master/20-Vectors_conceptes/Exemple6/src/main/kotlin/Main.kt) podrém entendre millor el funcionament. Per validar el correcte funcionament li tindriam que pasar parametres quan l'executem. Per  fer-ho amb IntelliJ IDEA podem configurar anan a Run -> Edit configuration..

[exemple configuracio](https://github.com/marcmoiagese/curskotlin/blob/master/20-Vectors_conceptes/img/1.png?raw=true "Exemple configuracio")

Despres de configurar-lo així, ja podem executar el progra 

```kotlin
fun main(parametre: Array<String>) {
    for(index in 0..parametre.size-1)
        println("${parametre[index]} -")
}
```

Cuan executem el programa el vector 'parametre' enmagatzema els tres valors de tipus String amb les cadenes que hem configurat per passarli durant la carrega del programa "un, dos, tres"

