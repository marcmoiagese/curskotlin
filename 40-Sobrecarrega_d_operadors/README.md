# Sobrecarrega d'operadors

El llenguatge kotlin permet que certs operadors puguin sobrecarregarse i actuin de diferents maneres depenen de l'objecte que s'apliqui.

La sobrecarrega d'operadors s'ha d'utilitzar sempre i cuan tingui sentit per la classe que s'esta implementan. Els conceptes matemàtics de vectors i matrius son casos on la sobrecàrrega d'operadors ens pot fer que el nostre codi sigui mes elegant i llegible.

Per sobrecarregar els operadors +, -, * i /  hem d'implementar una serie de mètodes especials dins de la classe

```kotlin
Operació    Nom del metode a definir
a + b        plus
a - b        minus
a * b        times
a / b        div
a % b        rem
a..b         rangeTo
```


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/40-Sobrecarrega_d_operadors/Exemple1/src/main/kotlin/Main.kt)

Declararem una classe anomenada Vector que administri un vector de 5 elements de tipus enter  i carregui valors aleatoris entre 1 i 10. Sobrecarregarem els operadors +, -, * i /
A la main definirem una serie d'objectes de la classe Vector i operarem amb ells.
