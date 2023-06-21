# 29- POO: enum class

A Kotlin tenim un altre tipus especial de classe que es deckara amb les paraules clau *enum class*.

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

Igual que les classes comuns, les enum class poden tenir propietats definides al constructor, despres hem d'indicar un valor per cada una d'elles a les constants definides.


## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/29-POO-enum_class/Exemple1/src/main/kotlin/Main.kt)

Declararem una enum class amb els noms de cartes del model ingles.
Definirem una classe carta que tingui una propietat de la classe enum class.

## [Exemple2]()

Declararem una enum class que representi les cuatre operacions bàsiques, asociarem a cada constant un String amb el signe de l'operació.
També definirem una classe Operacio que definirà tre propietats, les dos primeres tenen que ser els numeros i la tercera el tipus d'operació
