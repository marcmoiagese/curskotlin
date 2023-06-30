# Sobrecarrega d'operadors

El llenguatge kotlin permet que certs operadors puguin sobrecarregarse i actuin de diferents maneres depenen de l'objecte que s'apliqui.

La sobrecarrega d'operadors s'ha d'utilitzar sempre i cuan tingui sentit per la classe que s'esta implementan. Els conceptes matemàtics de vectors i matrius son casos on la sobrecàrrega d'operadors ens pot fer que el nostre codi sigui mes elegant i llegible.

Per sobrecarregar els operadors +, -, * i /  hem d'implementar una serie de mètodes especials dins de la classe

```kotlin
Operació    Nom del metode a definir
a + b        plus
a - b        minus
a * b        times
a / b        div
a % b        rem
a..b         rangeTo
```
Per exemple, si volem sobrecarregar l'operador suma (+) ho  podríam fer aixi

```kotlin
class Vector {
	val vector = IntArray(10)
	operator fun plus(vector1: Vector): Vector {
		var resultan = Vector()
		for ( i in vector.indices)
			resultan.vector[i] = vector[i] + vector2.vector[i]
		return suma
 	}
}	
```

d'aquesta manera, cada cop que cridem al operador + entre dos vectors sumara cada un dels seus components entre ells es a dir

```txt
 vector1[0] + vector2[0]
 vector1[1] + vector2[1]
...
```

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/40-Sobrecarrega_d_operadors/Exemple1/src/main/kotlin/Main.kt)

Declararem una classe anomenada Vector que administri un vector de 5 elements de tipus enter  i carregui valors aleatoris entre 1 i 10. Sobrecarregarem els operadors +, -, * i /
A la main definirem una serie d'objectes de la classe Vector i operarem amb ells.

## [Exemple 2]()

Declararem una classe anomenada Vector que administrara un vector de 5 elements de tipus enter, tambe carregara valors aleatoris entre 1 i 10. Sobrecarregarem l'operador * per a que permeti multiplicar un vector amb un numero enter. Es te que multiplicar cada component del vector pel enter.
