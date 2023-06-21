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

A Kotlin, podem sobreescriure cualsevol dels mètodes que ens proveeix un data class i definir un nou algoritme del mateix.


## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/28-POO-data_class/Exemple1/src/main/kotlin/Main.kt)

Declararem un *data class* anomenat Article que enmagatzema el codi del producte, la seva descripció i preu. Després definirem diferents objectes d'aquesta classe des de main.

## [Exemple2]()

Declararem un data class anomenat Persona que enmagatzemi el nom i l'edat. Sobreescriurem el mètode toString per retornar un String amb la concatenació del nom i l'edat separan per una coma.
