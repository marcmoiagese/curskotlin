 Sobrecarrega d'operadors

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
a++	     inc
a--           dec
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

Per sobrecarregar els operadors *>>=* i *<<=* hem d'implementar el mètode compareTo. 

## Sobecarrega d'operadors de subíndex

A Kotlin podem sobrecarregar la gestió de subíndex implementan els mètodes get i set.

```txt
l'expresió                es tradueix
a[i] = b	          a.set(i, b)
a[i, j] = b	          a.set(i, j, b)
a[i_1, ..., i_n] = b	  a.set(i_1, ..., i_n, b)

a[i]	                  a.get(i)
a[i, j]	                  a.get(i, j)
a[i_1, ..., i_n]	  a.get(i_1, ..., i_n)
```

## Sobrecarga de parentesis

A Kotlin tambe podem sobrecarregar els parentesis implementatn el metode invoke.

```txt
l'expresió              es tradueix
a()                     a.invoke()
a(i)                    a.invoke(i)
a(i, j)	                a.invoke(i, j)
a(i_1, ..., i_n)        a.invoke(i_1, ..., i_n)
```


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/40-Sobrecarrega_d_operadors/Exemple1/src/main/kotlin/Main.kt)

Declararem una classe anomenada Vector que administri un vector de 5 elements de tipus enter  i carregui valors aleatoris entre 1 i 10. Sobrecarregarem els operadors +, -, * i /
A la main definirem una serie d'objectes de la classe Vector i operarem amb ells.

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/40-Sobrecarrega_d_operadors/Exemple2/src/main/kotlin/Main.kt)

Declararem una classe anomenada Vector que administrara un vector de 5 elements de tipus enter, tambe carregara valors aleatoris entre 1 i 10. Sobrecarregarem l'operador * per a que permeti multiplicar un vector amb un numero enter. Es te que multiplicar cada component del vector pel enter.

## [Exemple 3](https://github.com/marcmoiagese/curskotlin/blob/master/40-Sobrecarrega_d_operadors/Exemple3/src/main/kotlin/Main.kt)

Declararem una classe anomenada Vector que administri un vector de 5 elements de tipus enter, i carregarem valors aleatoris entre 1 i 10. Sobrecarregarem els operadors ++ i -- que tenen que incrementar o disminuit una unitat a cada element del vector.

## [Exemple 4](https://github.com/marcmoiagese/curskotlin/blob/master/40-Sobrecarrega_d_operadors/Exemple4/src/main/kotlin/Main.kt)

Implementarem una classe anomenada Persona que tindra com a propietats el seu nom i edat. Sobrecarregarem els operadors >>= i <<=.

## [Exemple 5](https://github.com/marcmoiagese/curskotlin/blob/master/40-Sobrecarrega_d_operadors/Exemple5/src/main/kotlin/Main.kt)

Implementarem una classe Joc que defineixi una propietat pel taulell que sigui un IntArray de 9 elements amb valor 0. Hi haura 2 jugadors que disposin fixes, el primer jugador carrega el 1 i el segon carrega un 2.
Mitjançant sobrecarrega d'operadors de subindex permitirem assignar les  fixes a cada posició del taulell a través de dos subindex que indiquen la fila i la columna del taulell.

## [Exemple 6]()

Crearem una classe Daus que administrara 10 valors de daus dins un vector de tipus IntArray.
Sobrecarregarem l'operador parentesis per la classe i accedirem mitjançant una posició al valor d'un costat especific.
