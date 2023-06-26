# 32- POO: Herència classes abstractes

En algunes ocasions, tenim mètodes i propietats que son comuns a un conjunt de classes, podem agrupar aquets mètodes i propietats en una classe anomenada classe abstracta.

No es possible definir objectes d'una classe abstracta i segurament sera heredada per altres classes de les que si podem  definir objectes.

Hi ha una sintaxis especial per declarar una classe abstracta amb kotlin.

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/32-POO-Herencia_classes_abstractes/Exemple1/src/main/kotlin/Main.kt)

Declararem una classe abstracta que representi una operació. Definirem a la mateixa tres propietats. valor1, valor2 i resultat, i dos mètodes, calcular i imprimir.
Plantejarem dues classes anomenades suma i resta que heredin de la classe operació.
