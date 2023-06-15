# Tipus de variables

Podríem definir una variable com un dipòsit on enmagatzemem un valor, que consta d'un nom i pertany a un tipus determinat. Per exemple, a Kotlin, si necessitem emmagatzemar un valor numèric sencer, podem definir una variable utilitzant un dels següents tipus:

- Int: per a valors enters
- Short: per a valors enters curts
- Long: per a valors enters llargs
- Byte: per a valors enters d'un byte

Depenent del valor màxim que vulguem enmagatzemar, utilitzarem un dels següents tipus de variables enters en Kotlin. Per exemple, si volem enmagatzemar un valor màxim de 2147483647, utilitzarem el tipus de variable Int. En general, tenim les següents opcions:

```kotlin
                                      Minim                           Maxim
- Byte                                 -128                            +127
- Short                             -32 768                         +32 767
- Int                        -2 147 483 648                  +2 147 483 647
- Long           -9 223 372 036 854 775 808      +9 223 372 036 854 775 807
```

Si necessitem enmagatzemar un valor amb part decimal, com podria ser el número π, hem d'utilitzar una variable del tipus:

Double: per a valors amb punt flotant de precisió doble (64 bits)
Float: per a valors amb punt flotant de precisió simple (32 bits)

Amb aquestes variables, podem enmagatzemar valors amb part decimal amb diferents nivells de precisió, depenent de les necessitats del nostre programa. Per exemple, el tipus Double té major precisió que el tipus Float. ja que el tipus Double utilitza 64 bits per a enmagatzemar valors amb punt flotant, mentre que el tipus Float només en utilitza 32. Això significa que el tipus Double pot representar valors amb més dígits decimals i amb menys errors d'arrodoniment que el tipus Float.

Un altre tipus de variable que tenim són les de tipus String, que ens permeten enmagatzemar un conjunt de caràcters. Les variables de tipus String són especialment útils per a enmagatzemar text, com ara noms, adreces o missatges que el nostre programa necessiti processar o mostrar a l'usuari.

Una variable en Kotlin pot ser immutable, és a dir, el seu valor és constant un cop s'ha assignat un valor, i no li podem canviar el valor, o pot ser mutable, és a dir, que podem canviar el valor emmagatzemat durant l'execució del programa.

Les variables immutables són útils quan necessitem assegurar-nos que el valor d'una variable no canvia en la nostra lògica de programació, cosa que pot ajudar a prevenir errors i simplificar el nostre codi. Les variables mutables, per altra banda, són útils quan necessitem actualitzar el valor d'una variable al llarg del temps, com ara en el cas d'un contador que incrementa en valor a mesura que el programa s'executa.

Quan vulguem definir variables immutables amb Kotlin, utilitzarem la paraula "val". Per exemple:

```kotlin
val edat: Int
edat = 35
val sou: Float
sou = 100000€
val total: Double
total = 70000.24
val titol: String
titol = "Ventes"
```

Si intentem modificar el valor d'una variable immutable, el compilador ens donarà un error.

També disposem de la variable 'char' per quan necessitem emmagatzemar un únic valor. Per exemple, si volem emmagatzemar una lletra en una variable mutable:

```kotlin
var continua:Char='s'
```

Finalment, si el que necessitem és emmagatzemar un valor de tipus lògic, hem de crear una variable booleana, que només pot contenir els valors vertader o fals.

```kotlin
var fin:Boolean=false
```


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/2-Tipus_de_variables/exemple1/src/main/kotlin/Main.kt)

El Seguent exemple crearem un programa que defineixi dues variables immutables de tipus Int. Després definir una tercera variable mutable que emmagatzemi la suma de les dues primeres variables i la mostri. Seguidament, emmagatzemar en la variable el producte de les dues primeres variables i mostrar el resultat.

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/2-Tipus_de_variables/exemple2/src/main/kotlin/Main.kt)

Un altre exemple per ser més concís és no indicar el tipus de la variable i fer que el compilador de Kotlin el dedueixi.

## Problemes:

- Definiu una variable immutable amb el valor 50 que representa el costat d'un quadrat. A continuació, creeu dues variables immutables per emmagatzemar la superfície i el perímetre del quadrat. Mostreu la superfície i el perímetre per la Consola. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/2-Tipus_de_variables/prob1/src/main/kotlin/Main.kt)
- Definiu tres variables immutables i assigneu-hi els pesos de tres persones amb valors Float. Calculeu la mitjana dels pesos de les persones i mostreu-la. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/2-Tipus_de_variables/prob2/src/main/kotlin/Main.kt) )

