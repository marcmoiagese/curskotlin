# 34- POO: Vectors amb objectes

Varem definir un vector com una estructura de dades que ens permet enmagatzemar un conjunt de dades del mateix tipus. Amb un unic nom es defineix un vector i mitjançant un subindex fem referencia a cada element del mateix component.

Ja hem vist com crear vectors amb components tipo Int, Char, Float, Double, etc. Ara veurem com definir un vector amb components d'una determinada classe que declararem nosaltres.

```kotlin
class Producte(val nom: String, val preu: Double)

fun main() {
    val productes = arrayOf(
        Producte("Llibre", 29.99),
        Producte("Roba", 49.99),
        Producte("Electrònica", 99.99)
    )
}

```

En aquest exemple definim una variable productes que es un vector amb components de tipus Producte. Per a definir els seus components utilitzem la funció arrayOf que ens proveeix la llibreria estàndard de Kotlin.

Podem recorrer el vector a través d'un for, a cada cicle del for, a la variable producte es guardara un dels components del vector.

```kotlin
class Producte(val nom: String, val preu: Double)

fun main() {
    val productes = arrayOf(
        Producte("Llibre", 29.99),
        Producte("Roba", 49.99),
        Producte("Electrònica", 99.99)
    )

    for (producte in productes) {
        println("Nom: ${producte.nom}, Preu: ${producte.preu}")
    }
```

Però en cas que ho nesecitem, també podem accedir a un element concret

```kotlin
class Producte(val nom: String, val preu: Double)

fun main() {
    val productes = arrayOf(
        Producte("Llibre", 29.99),
        Producte("Roba", 49.99),
        Producte("Electrònica", 99.99)
    )
    
    val primerProducte = productes[0]
    println("Primer producte: ${primerProducte.nom}, Preu: ${primerProducte.preu}")
```

A un vector podem accedir-hi mitjançant un subindex, o mitjançant crides a mètodes, podem cambiar el valor enmagatzemat a un component, etc.


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/34-POO-Vectors_amb_Objectes/Exemple1/src/main/kotlin/Main.kt)

Declararem una classe Persona amb les propietats nom i edat, definirem com a mètodes la seva impresií i una altra que retorni true si es mes gran d'edat o false en cas contrari.
A la funció main definirem un vector amb cuatre elements de tipus Persona. Calcularem cuantes persones son majors d'edat.


## Problemes

### 1

Donada la declaració de la següent data class:

```kotlin
data class Article(val codi: Int, val descripcio: String, var preu: Float)
```

Definir un vector amb 4 elements de tipus Article
Implementar dues funcions, una a la que li enviarem el vector i ens ensenyi tots els seus components, i l'latra que també rebi el vector d'articles i procedeixi a augmentar un 10% tots els productes.  ( [Solucio]() )


### 2

Declarar una classe Dau que tingui com a propietat el seu valor i dos mètodes que permetin tirar el dau i imprimir el seu valo.
A la main definir un vector amb 5 objectes de tipus Dau.
Tirar els 5 daus i imprimir els valors de cada un. ( [Solucio]() )
