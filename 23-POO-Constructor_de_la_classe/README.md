# 23- POO - Constructor de la clase

A Kotlin, podem definir un metode que s'executi automaticament cada cop que inicialitzem la classe. A aquest metode se l'anomena constructor. El constructor, te les seguents característiques:
* Es el primer metode que s'executa.
* S'executa automaticament.
* No pot retornar dades.
* Nomes s'executa una vegada.
* Te com a objectiu inicialitzar atributs.
* Una classe pot tenir diversos constructors pero nomes un es el principal.

El constructor principal de la classe, es declara inmediatament despres de definir el nom de la classe

```kotlin
class nomDeLaClasse constructor(parametre: tipo){
```

Dins la classe podém passar el valor del parametre a la propietat directament

```kotlin
class nomDeLaClasse constructor(parametre: tipo){
   var propietat: tipo = parametre
```

Per tan i coneixen el funcionament de les funcions, podem deduir que la manera que tenim per enviar parametres al declarar l'objecte.

```kotlin
val objecte = nomDeLaClasse ( "parametre" )
```

### La paraula clau constructor es opcional
 
En molts casos la paraula clau "constructor" es opcional, i per tal de ser mes consisos podem invocarlo de la seguent manera

```kotlin
class nomDeLaClasse(parametre: tipo){
```

Mes endavan veurem que es obligatori indicar la paraula constructor cuan afegim un modificador d'acces (private, protected, public, internal) previ al constructor o una anotació.

### Definició de propietats al mateix constructor

Amb la finalitat de que el codi sigui el mes concís possible kotlin ens permet reduir moltes línies definin la propietat d'aquestes dins el constructor. per exemple el seguent codi no te la definicio de les propietats dins el constructor:

```kotlin
class cotxe (color: String, portes: Int){
      var Color: String = color
      var Portes: Int = portes
```

Podríam resumir el codi definin les propietats dins el mateix constructor de la seguent manera:

```kotlin
class cotxe (var color: String,var portes: Int){
```

Si definim les propietats així ja no cal que les tornem a definir dins la classe, si ho fem, el compilador ens generarà un error sintactic. Això no significa que no puguis definir mes propietats dins la classe, només afecta a les que has definit dins el constuctor.

### Executar un algoritme inmediatament despres del constructor

En algunes ocasions, ens interesarà executar un algoritme inmediatament després del constructor, per conseguir aixó tenim l'anomenat bloc init. Amb aquest bloc podem per exemple validar les dades que  arriben al constructor i inicialitzar altres propietats de la classe.

```kotlin
class cotxe (var color: String,var portes: Int){

    init {
      if (portes < 0)
        portes = 0
    }
```

### Definició de multiples constructors.

Cuan definim un altre constructor a més a més del principal de la classe, s'ha d'implementar obligatoriament amb la paraula clau constructor, els seus paràmetres i la crida obligatoria al constructor prinipal de la classe. Eengloban l'algoritme que executarà entre claus.

```kotlin
class cotxe (var color: String,var portes: Int){

      constructor():this("",0){
	print("De quin color es el cotxe? ")
	color = readln().toString()
	print("Cuantes portes te? ")
	portes  = readln().toInt()	
      }
```
D'aquesta manera podém cridar un constructor o un altre en funció de les noestres nesecitats. es a dir, si cridem la classe de la seguent manera:

```kotlin
val cotxe1 = cotxe()
```
Entrara al segon constructor, i ens solicitarà els valors per realitzar la carrega a través del teclat. Però si li passem els valors al declarar la classe, no entrarà al segon constructor.

```kotlin
val cotxe1 = cotxe("Roig",5)
```

També pots veure, que el segon constructor, crida al primer amb la paraula this i entre parentesis les dades a enviar

```kotlin
constructor():this("",0){
```

## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/23-POO-Constructor_de_la_classe/Esemple1/src/main/kotlin/Main.kt)

Desenvoluparem una classe anomenada Persona que tindra com a propietats el seu nom i edat. Plantejarem un constructor al que li arribaran com a parametres el nom i l'edat.
A més a més, definirem dos metodes, un que imprimira les propietats i l'altre ens ensenyara si es major d'edat.


## [Exemple2](https://github.com/marcmoiagese/curskotlin/blob/master/23-POO-Constructor_de_la_classe/Exemple2/src/main/kotlin/Main.kt)

Desenvoluparem una classe que carregara els costats d'un triangle i implenetara els següents mètodes:
* Inicialitzara les propietats.
* Imprimira el valor del costat que sigui mes gran.
* Ens mostrarà si es equilater o no.

## [Exemple3](https://github.com/marcmoiagese/curskotlin/blob/master/23-POO-Constructor_de_la_classe/Exemple3/src/main/kotlin/Main.kt)

Farem una classe que carregui els costats d'un triangle, pero aquest cop, amb dos constructors. I amb els seguents metodes:
* Inicialitzar les propietatsi.
* Imprimirem el costat mes grani.
* Indicar si es equilater o no.

## Problemes

- Crea una classe anomenada Alumne que tingui com a propietats el seu nom i nota. Al constructor li arriva el seu nom i la seva nota.
  * Imprimir el nom i la nota
  * Imprimir un missatge si la nota es superior o igual a 5 indican que esta aprobat
  * Defineix dos objectes de la classe Alumne
  [Solució]()


- Fes una classe que representi un punt en un plà, la coordenada del punt sobre el plà es defineix entre dos valors x i y. Al constructor se li enviarà les coordenades del punt x i de y.
  * Crea un mètode que retorni un String indicant en quin cuadran esta el punt. tenin en compte els següents valors
	- 1er Cuadrant: si X > 0 i Y > 0
	- 2on Cuadrant: si X < 0 i Y > 0
	- 3er Cuadrant: si X < 0 i Y < 0
	- 4rt Cuadrant: si X > 0 i Y < 0
	- Si algun o els dos valors es 0, significa que el punt esta sobre l'eix
  * Defineix 5 objectes de la classe punt, un per cada un dels cuadrants i un per un eix.
  [Solució]() 
