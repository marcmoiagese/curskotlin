# 29- POO: enum class

A Kotlin tenim un altre tipus especial de classe que es declara amb les paraules clau *enum class*.

S'utilitzen per definir un conjunt de constants.

Per declarar un enum class ho podem fer de la seguent manera:

```kotlin
enum class TipusFruita{
	POMA,
	PRESSEC,
	MADUIXA,
	PERA
}
```

Després cuan volguém cridar, crearem una variable del tipus del enum class.

## Propietats de una enum class

Igual que les classes comuns, les enum class poden tenir propietats definides al constructor, despres hem d'indicar un valor per cada una d'elles a les constants definides. Al exemple seguent definirem 3 noms de colors en euskera i el seu valor assignat serà el nom del color en català.

```kotlin
enum class Color(val descripcio: String) {
    GORRI("vermell"),
    BERDE("verd"),
    URDINA("blau")
}

class ColorDescrip(val colo: Color, val intensitat: Int, val saturacio: Int) {
    fun donamLadescripcioDelColor(): String {
        val descripcioDelColor = when (colo) {
            Color.GORRI -> "vermell"
            Color.BERDE -> "verd"
            Color.URDINA -> "blau"
        }
        return "El color $descripcioDelColor té una intensitat de $intensitat i una saturació de $saturacio."
    }
}

fun main() {
    val colorDescripcio1 = ColorDescrip(Color.GORRI, 50, 75)
    println(colorDescripcio1.donamLadescripcioDelColor())  // El color vermell té una intensitat de 50 i una saturació de 75.
    
}
```

Com pots veure cada propietat de l'enum class, tè assignat el valor de la propietat "descripcio" que es un String. Després he creat la classe ColorDescrip que te un objecte de tipus Color fent referencia als valors de la enum class, i dos enters. Aquesta classe conté un mètode que l'hem anomenat "donamLadescripcioDelColor" 

Aquest mètode, depenen del que tingui enmagatzemat la propietat "colo" enmagatzemara a la variable "descripcioDelColor" el valor respectiu.



## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/29-POO-enum_class/Exemple1/src/main/kotlin/Main.kt)

Declararem una enum class amb els noms de cartes del model ingles.
Definirem una classe carta que tingui una propietat de la classe enum class.

## [Exemple2](https://github.com/marcmoiagese/curskotlin/blob/master/29-POO-enum_class/Exemple2/src/main/kotlin/Main.kt)

Declararem una enum class que representi les cuatre operacions bàsiques, asociarem a cada constant un String amb el signe de l'operació.
També definirem una classe Operacio que definirà tre propietats, les dos primeres tenen que ser els numeros i la tercera el tipus d'operació
