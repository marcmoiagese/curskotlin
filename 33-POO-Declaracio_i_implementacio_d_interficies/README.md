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

## [Exemple 1]()

Definirem una interficie anomenada Punt que declarara un mètode anomenat imprimir. Despres declararem dues classes que la implementin.
