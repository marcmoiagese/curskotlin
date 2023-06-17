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

Es importan recordar que només es pot cridar així quan estem dins de la mateixa classe.
