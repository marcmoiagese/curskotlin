# 33- POO: Declaració i implementació d'interficies.

Una interficie declara una serie de mètodes i propietats que tenen que ser implementades despres per una o mes classes, a Kotlin una interficie també pot tenir implementats mètodes.

Les interficies venen a suplir la imposibilitat de l'herencia multiple a Kotlin. S'utilitza la mateixa síntaxis que la herencia per indicar que una classe implementa una interficie.

Per exemple, podem tenir dos classes que representen un avió i un helicopter. Després implementar una interficie amb un mètode anomenat volar. Les dos classes poden implementar aquesta interficie i codificar el mètode volar. 

La síntaxis a Kotlin per declarar una interficie es:

```kotlin
interface [ nom de la interficie ] {
  [declaracio de propietats]
  [declaració de mètodes]
  [implementacio de mètodes]
}
```

Partin del següent exemple:

```kotlin
interface Animal {
    fun ferSo()
    fun moure()
}

class Gat : Animal {
    override fun ferSo() {
        println("El gat fa \"miau\".")
    }

    override fun moure() {
        println("El gat es mou amb agilitat.")
    }
}

class Gos : Animal {
    override fun ferSo() {
        println("El gos fa \"bup bup\".")
    }

    override fun moure() {
        println("El gos es mou ràpidament.")
    }
}

fun main() {
    val gat = Gat()
    gat.ferSo()
    gat.moure()

    val gos = Gos()
    gos.ferSo()
    gos.moure()
}
```

Com pots observar, per declarar la interficie utilitzem la paraula "interface" seguit del seu nom, en aquest cas Animal. Després entre claus indiquem totes les capseleres de mètodes, propietats i mètodes que es tinguin d'implementar, en aquest cas declaro la interficie Animal i indico que qui la implementi li tocarpa definir un mètode anomenat ferSo i moure, que no retornen res.

La síntaxis per indicar que una classe implementa una interfície es la mateixa que la herencia. Si una classe hereda una altra també pot implementar una o mes interficies separan per coma cada una de les interficies.


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/33-POO-Declaracio_i_implementacio_d_interficies/Exemple1/src/main/kotlin/Main.kt)

Definirem una interficie anomenada Punt que declarara un mètode anomenat imprimir. Despres declararem dues classes que la implementin.

## [Exemple 2]()

Si tenim la següent interficie:

```kotlin
interface Figura {
    fun calculaSuperficie(): Int
    fun calcularPerimetre(): Int
    fun titolResultat() {
        println("Dades de la figura")
    }
}
```

Definirem dues classes que representin un cuadrat i un rectangle. Implementarem la interficie figura a ambdues classes
