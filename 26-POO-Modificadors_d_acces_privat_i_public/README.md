# 26- POO: Modificadors d'acces privat i public

Un dels principis fundamentals de la programació orientada a objectes es l'encapsulament, aixo ho conseguim agrupan una serie de mètodes i propietats dins d'una classe.

A Kotlin, cuan escrivim una classe, per defecte, totes les propietats i mètodes son de tipus public. Els mètodes o propietats publics son accesibles des d'on definim un objecte d'aquella classe.

Si volem definir algun metode que nomes es pugui accedir des de dins de la classe, l'hem de definir com a private.

Per declarar un metode com a privat ho farem escrivint la paraula "private" davan.

```kotlin
 private fun nomDelMetode(){

 }
```
Si intentessim accedir al mètode des de fora, obtindriam un error sintàctic. També podem ocultar les propietats de la mateixa manera.

```kotlin
  private var variable: Int = 0
```

D'altra banda, la paraula public, no es necessaria, ja que es el valor per defecte. Si la posem, no generarà cap error el compilador. Però es redundant posarla.

```kotlin
 public fun nomDelMetode(){

 }
```

## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/26-POO-Modificadors_d_acces_privat_i_public/Exemple1/src/main/kotlin/Main.kt)

En aquest cas, crearem una classe anomenada Operacions, que en un mètode soliciti la carrega de 2 entorns i posteriorment, cridi desde el mateix mètode a dos mètodes mes que siguin privats i que calculin el seu producte.


