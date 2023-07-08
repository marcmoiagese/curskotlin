# 45- Coleccions: Map i MutableMap

L'estructura de dades Map utilitza una clau per accedir a un valor. El subindex pot ser cualsevol tipus de classe, igual  que el seu valor. Podem relacionarlo amb conceptes que coneixem:

 * Un diccionari tradicional que coneixem podem utilitzar un Map de Kotlin per representarlo. La clau sería la paraula i el valor seria la definicio d'aquest.

 * Una agenda personal també la podem representar com un Map. La data sería la clau i les activitats d'aquesta data sería el valor.

 * Un conjunt d'usuaris d'un lloc web podem guardarlo en un Map. El nom del usuari sería la clau i com a valor podríam guardar el seu correu, clau, dates de login, etc.

Hi ha molts problemes de la realitat que es poden representar mitjançant un Map.

Per crear un Map a Kotlin definim una variable i indiquem de quin tipus de dada son la clau del mapa i el valor que guarda amb la funció mapOf. Indican cada entrada a través del objecte Pair

```kotlin
val nomDeLaVariable: Map<TipusDadaClau, TipusDadaValor> = mapOf( Pair(Clau, Valor),
                                                                 Pair(Clau, Valor))
```
Si enviem la variable que conté el Map a println ens imprimira tot el contingut. També podem recorrer element per element amb un for, en cada iteració recuperarem un valor

```kotlin
 for ( (clau, valor) in nomDeLaVariable )
	println("La clau es $clau i el seu valor es $valor")
```

De la mateixa manera que amb les llistes, la classe Map disposa d'una propietat size que ens retornara la cantitat d'elements del mapa.

Si volem recuperar el valor per una determinada clau, podem fer-ho amb la següent sintaxis:

```kotlin
val varQueRepElresultat: Tipus? = nomDeLaVariable[clau]
```

Com que pot passar que la clau que vas a buscar no existeixi, es aconsellable definir el tupus de dada que se suposa que retornara amb un ?, així podra enmagatzemar un null si no existis. Despres amb if podem controlar la sortida.

També podem declarar Map amb de la seguent manera

```kotlin
val nomDeLaVariable: Map<TipusDadaClau, TipusDadaValor> = mapOf( Clau to Valor,
                                                                 Clau to Valor)
```

La funció "to" mitjançant la definició "infix" podem passarli un parametre, despres el nom de la funció i finalment el segon parametre. La funció to ja existeix i te la següent sintaxis.

```kotlin
public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
```

Mes endavan veurem funciona amb la notacio infix i amb parametres generics. Si vols coneixer totes les propietats i metodes de Map pots visitar la documentació de la [biblioteca estandard](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/) de Kotlin

Per generar Map que siguin mutables, ho podem fer amb MutableMap seguin la mateixa logica

```kotlin
val nomDeLaVariable: MutableMap<String, String> = mutableMapOf()
```
podem veure totes les propietats de MutableMap a la [llibreria estandar](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/) de Kotlin

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/45-Coleccions_Map_i_MutableMap/Exemple1/src/main/kotlin/Main.kt)

Al bloc principal del proframa definirem un Map inmutable que guardi els noms de paisos com clau i com valor la cantitat de habitans del país.
Probar diferents mètodes i propietats que ens proveeix la classe Map.

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/45-Coleccions_Map_i_MutableMap/Exemple2/src/main/kotlin/Main.kt)

Crea un mapa que permeti guardar 5 articles,  utilitza com a clau el nom del producte i com valor el preu del mateix. A més a més fes les seguents funcions:
- Imprimeix el dicconari sencer
- Mostra la cantitat d'articles amb preu superior a 20

## [Exemple 3](https://github.com/marcmoiagese/curskotlin/blob/master/45-Coleccions_Map_i_MutableMap/Exemple3/src/main/kotlin/Main.kt)

Farem una aplicació que ens permeti crear un diccionari ingles/català. La clau es la paraula amb ingles i el valor es la paraula en català. crearem les seguents funcions:
- Carregarem el diccionari (  introduin per teclat la paraula inglesa i la seva traducció al català)
- Listat complet del diccionari.
- Introduirem per teclat una paraula amb ingles i si existeix al diccionari ensenyara la seva traducció.

## [Exemple 4](https://github.com/marcmoiagese/curskotlin/blob/master/45-Coleccions_Map_i_MutableMap/Exemple4/src/main/kotlin/Main.kt)

Farem un programa que permeti caregar un codi de producte com clau en un Map. Guardarem per aquesta clau un objecte de classe Producte que defineixi com a propietats el nom del producte, el seu preu i la cantitat en stock.
Immplementa les seguents activitats.
- Carrega de dades al Map.
- Llista completa de productes.
- Consulta d'un producte per la seva clau, imprimir el nom, preu i stock.
- Cantitat de productes que tinguin un stock amb un valor 0.

## [Exemple 5]()

Volem guardar les dades de N alumnes (n s'introdueix per teclat). Definirem un MutableMap en que la seva clau sigui el numero de document del alumne.
Com a valor guardarem una llista amb components de la classe Materia on guardarem el nom de la materia i la seva nota.

Crearem les seguents funcions:
- Carrega els alumnes ( de cada alumne solicitarem el seu DNI i els noms de les materies i les seves notes)
- Llista de tots els alumnes amb les seves notes.
- Consulta d'un alumne pel seu dni, mostrar les materies que cursa i les seves notes.
