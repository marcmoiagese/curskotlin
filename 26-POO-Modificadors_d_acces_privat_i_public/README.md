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

## [Exemple2](https://github.com/marcmoiagese/curskotlin/blob/master/26-POO-Modificadors_d_acces_privat_i_public/Exemple2/src/main/kotlin/Main.kt)

Crea una classe Dau. Defineix una propietat privada anomenada valor i tres metodes, un privat que dibuixi una linea d'asteriscos, i dos mes públics. un que generi un numero aleatori entre 1 i 6 i un altre que l'imprimeixi cridan finalment al que dibuixa la línea d'asteriscos.

## Promlemes

Fes una classe que defineixi una propietat privada de tipus vector de 5 enters. Al bloc init cridar a un mètode provat que carregui valors aleatoris compresos entre 0 i 10.
Definir tres metodes publics mes que mostrin el vector, l'element mes gran i l'element mes petit. i ( [Solucio]() )
