# 32- POO: Herència classes abstractes

En algunes ocasions, tenim mètodes i propietats que son comuns a un conjunt de classes, podem agrupar aquets mètodes i propietats en una classe anomenada classe abstracta.

No es possible definir objectes d'una classe abstracta i segurament sera heredada per altres classes de les que si podem  definir objectes.

Hi ha una sintaxis especial per declarar una classe abstracta amb kotlin.

```kotlin
abstract class Forma(val nom: String) {
    abstract fun calcularArea(): Double

    fun mostrarNom() {
        println("Aquesta forma és un $nom.")
    }
}

class Rectangle(nom: String, val amplada: Double, val alcada: Double) : Forma(nom) {
    override fun calcularArea(): Double {
        return amplada * alcada
    }
}

class Cercle(nom: String, val radi: Double) : Forma(nom) {
    override fun calcularArea(): Double {
        return Math.PI * radi * radi
    }
}

fun main() {
    val rectangle = Rectangle("rectangle", 5.0, 3.0)
    rectangle.mostrarNom()
    println("Àrea del rectangle: ${rectangle.calcularArea()}")

    val cercle = Cercle("cercle", 2.5)
    cercle.mostrarNom()
    println("Àrea del cercle: ${cercle.calcularArea()}")
}
```

Una classe abstracta es declara posant la paraula abstract al abans de class, es poden definir propietats que seran heredades i també podem declarar mètodes abstractes que obliguen a les classes que hereden d'aquesta,  realitzar la seva implementació, 

```kotlin
abstract fun calcularArea(): Double
```

Una classe abstracta tambe pot tenir els seus mètodes propis. D'altra banda, per declarar una classe heredada d'una classe abstracta es fa igual que amb les classes heredades

```kotlin
class Rectangle(nom: String, val amplada: Double, val alcada: Double) : Forma(nom) {}

class Cercle(nom: String, val radi: Double) : Forma(nom) {}
```

Finalment, com pots veure al main, podem definir objectes de Cercle o Rectangle, pero no de la classe abstracta.

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/32-POO-Herencia_classes_abstractes/Exemple1/src/main/kotlin/Main.kt)

Declararem una classe abstracta que representi una operació. Definirem a la mateixa tres propietats. valor1, valor2 i resultat, i dos mètodes, calcular i imprimir.
Plantejarem dues classes anomenades suma i resta que heredin de la classe operació.

## Problemes

Declara una classe abstracta Compte, i dos subclasses CaixaEstalvis i PlasFixe. Defineix les propietats i mètodes comuns entre una caixa d'estalvis i un plaç fixe i agrupals en una classe Compta.

Una caixa d'estalvis i un plaç fixe tenen un nom de titular i un monto. Un plaç fixe afegeix un plaç d'imposició en dies i una tasa de interés. Fer que la caixa d'estalvis no generi interessos.
A la funció main del programa, definir un objecte de la clase CaixaEstalvis i un altre de la clase PlasFixe. ( [Solucio]() )
