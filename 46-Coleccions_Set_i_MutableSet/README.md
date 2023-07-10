# 46-  Coleccions: Set i MutableSet

La classe Set i MutableSet (conjunt) permeten guardar un conjunt d'elements que poden ser tots diferents. Però no permeten guardar dades repetides

Un conjunt es una colecció d'elements sense un ordre especific a diferencia de les llistes.

Si voleu mes informació per coneixer totes les propietats i metodes de MutableSet podem visitar la documentació de la [biblioteca estandard](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/)
també pel [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/)

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/46-Coleccions_Set_i_MutableSet/Exemple1/src/main/kotlin/Main.kt)

Crearem un conjunt mutable (MutableSet) amb una serie de valors Int. Probarem les propietats i metodes principals per administrar un conjunt.

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/46-Coleccions_Set_i_MutableSet/Exemple2/src/main/kotlin/Main.kt)

Crearem un conjunt inmutable que guardi els festius d'enguany.
Després, introduirem per teclat una data i verificarem si es festiu o no.

## Problemes

- Defineix un MutableSet que guardi 6 valors aleatoris compresos entre 1 i 50. L'objecte de tipus MutableSet representa una butlleta de lotaría. 
  Genera valors aleatoris compresos entre 1 i 5, que siguin tots diferents i aturarse quan surtin tots els que conté la butlleta de loteria.
  Ensenya cuants numeros han tingut que sortejarse fins que es completa el cartró. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/46-Coleccions_Set_i_MutableSet/Problema1/src/main/kotlin/Main.kt) )
