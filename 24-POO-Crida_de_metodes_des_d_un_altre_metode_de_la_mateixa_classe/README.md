# 24- POO - Crida de mètodes desde un altre mètode de la mateixa classe

Fins ara tots els problemes plantejats hem cridat als mètodes des d'on hem definit un objecte de la classe. per exemple:

```kotlin
 val persona1 = Persona("Rita",3)
 persona1.imprimir()
 persona1.esMajordedat()
```

es a dir, utilitzant la síntaxis

```kotlin
[nom del objecte].[nom del mètode]
```

Si volem cridar el mètodes des de dins de la mateixa classe, ho tenim que fer de la següent manera:

```kotlin
this.[nom del mètode]
```
O també ho podem fer de la maera curta

```kotlin
[nom del mètode]
```

Es importan recordar que només es pot cridar així quan estem dins de la mateixa classe.

## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/24-POO-Crida_de_metodes_des_d_un_altre_metode_de_la_mateixa_classe/Exemple1/src/main/kotlin/Main.kt)

Crearem la classe Operacions que en un mètode demani la càrrega de 2 enters i posteriorment cridi a uns altres 2 mètodes que calculin la seva suma i producte.

## Problema

- Declara una classe anomenada Fills. Defineix dins de la mateixa un vector per enmagatzemar les edats de 5 persones.
  * Defineix un mètode carregar on s'introdueixi per teclat el vector de les edats, i cridi a 2 metodes que imprimeixin el que tingui l'edat mes gran i el promig de les edats. [Solució]()
