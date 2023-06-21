# 28- POO: data class

Hem parlat que una classe encapsula un conjunt de funcionalitats (mètodes) i dades (propietats)

En moltes ocasions volem guardar un conjunt de dades sense nesecitat d'implementar funcionalitats, en aquestes ocasions, Kotlin ens proveeix una estructura anomenada: *data class*.

Per declarar el data class ho podem fer de la següent manera.

```kotlin
data class nomDelDataClass(val var1: Int, var var2: String)
```

Com pots veure, hem de posar la paraula data al inici, el constructor pot tenir dades de tipus val o var. Per definir els objectes d'una data class, es fa igaul que quan ho fem d'una classe.

si li passem a la funció println una variable de tipo data class, ens retornarà el nom del data class, els noms de les propietats i els seus valors, per exemple

```kotlin
data class socUnaDataClass(val nom: String, var anys: Int)

fun main(){
   val dataClass1 = socUnaDataCllass("pepito",30)
```

El println d'això retornaria

```kotlin
socUnaDataCllass(nom=pepito, anys=30)
```

Realment tota data class te una serie de metodes basics: toString, copy, etc.  Per lo tan quan passem la data class a la funció println el que passa es que la funció crida al mètode toString, per lo tan seria el mateix que cridar la data class de la següent manera.

```kotlin
println(dataClass1.toString())
```

podríam cambiar el valor de la propietat cridanla directament asignan el nou valor

```kotlin
dataClass1.anys = 20
```

també podem realitzar una copia del objecte amb el mètode copy

```kotlin
var dataClass2 = dataClass1.copy()
dataClass1.anys = 15
println(dataClass1) // socUnaDataCllass(nom=pepito, anys=15)
println(dataClass2) // socUnaDataCllass(nom=pepito, anys=30)
```

També podem comparar data classes a traves de condicionals, si comparem dos data class dins un condicional comparara que totes les propietats siguin identiques, i de ser així retornarà TRUE.

## Redefinició de mètodes de un data class.

Hem comentat que al declarar un data class, ja heredem una serie de mètodes que ens son utils per, despres poder processar els objectes que definim, d'aquella classe. 

A Kotlin, podem sobreescriure cualsevol dels mètodes que ens proveeix un data class i definir un nou algoritme del mateix. Per poder fer-ho, declarem la data class i dins d'aquesta amb override midifiquem el comportament del mètode desitjat.

```kotlin
data class nomDelDataClass(val var1: Int, var var2: String)
     override fun toString(): String{
	return "El que ens doni la gana"
     }
}
``` 

## Propietats declarades dins el cos de la classe

```kotlin
data class Jugador(val nom:String){
    var punts:Int=0
}

fun main(){
    val jugador1=Jugador("Pere")
    val jugador2=Jugador("Pere")
    jugador1.punts=10
    jugador2.punts=20
    if(jugador1==jugadior2)
        println("Els dos jugadors tenen el mateix nom")
    else
        println("Els jugadors no tenen el mateix nom")
}
```

Si executessim l'exemple el if donaria TRUE, això passa per que nomes te en compte les propietats definides dins el constructor primari de la classe. En aquest cas nom. Tot i que podem tenir altres propietats dins el data class, només les propietats definides dins el constructor principal es tindran en compte als mètodes: toString(), equals(), hashCode(), copy().

## Desestructuració de data class

Podem extreure algunes propietats d'un data class amb una sintaxis senzilla

```kotlin
data class cercle(val x: Int, val y: Int, val radi: Int)

fun main(){
  val cercle1 = Cercle(10,3,40)
  val (centrex, centrey) = cercle1
  println("Punt central del cercle ($centrex,$centrey)")
}
```

com pots veure a l'exemple, podem extreure el valor de les dues primeres propietats de la data class assignat a dues variables.

```kotlin
  val (centrex, centrey) = cercle1
```


### Mètode componentN

El compilador de Kotlin crea un  mètode per cada una de les propietats definides dins el constructor, despres cada mètode te un nom 'component' seguit d'un numero que representa la posició durant la seva declaració.

```kotlin
data class cercle(val x: Int, val y: Int, val radi: Int)

fun main(){
  val cercle1 = cercle(10,3,40)
  val centrex=cercle1.component1()
  val centrey=cercle1.component2()
  val radi=cercle1.component3()
  println("$centrex $centrey $radi")
}
```
No te massa sentit cridar els mètodes a través de componentX, pero son indispensables cuan volem recorrer un vector amb un for i desestructurar les seves propietats, ja que la instrucció for els requereix.

```kotlin
data class cercle(val x: Int, val y: Int, val radi: Int)

fun main(){
  val cercles = arrayOf<cercle>(
    cercle(20,6,50)
    cercle(10,3,40)
    cercle(30,9,10) 
  )
  
  for ( (x,y,radi) in cercles)
     println("Coordenada x=$x, coordenada y=$y, radi=$radi")
```

Les variables x,y i radi guarden els valors retornats per component1(), component2() y component3().

## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/28-POO-data_class/Exemple1/src/main/kotlin/Main.kt)

Declararem un *data class* anomenat Article que enmagatzema el codi del producte, la seva descripció i preu. Després definirem diferents objectes d'aquesta classe des de main.

## [Exemple2](https://github.com/marcmoiagese/curskotlin/blob/master/28-POO-data_class/Exemple2/src/main/kotlin/Main.kt)

Declararem un data class anomenat Persona que enmagatzemi el nom i l'edat. Sobreescriurem el mètode toString per retornar un String amb la concatenació del nom i l'edat separan per una coma.

## Problemes

- Planteja una Data class que es digui Dau amb una unica propietat anomenada valor. Sobreescriu el mètode toString per que ensenyi tants asteriscs com indigui la propietat valor. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/28-POO-data_class/Problema1/src/main/kotlin/Main.kt) )
