# 16 - Funcions: amb retorn de dades

Hem vist que una funció la definim mitjansant un nom i que pot rebre dades a través de parametres.

Els parametres son la manera que permet que la funció revi dades per ser procesades. Ara veurem una altra característica de les funcions, que es la tornar una dada a qui ha invocat la funció.

Cal recordar que una funció pot ser cridada, tant des de la funció main, com des d'una altra.

Cuan declarem una funció que ha de retornar un valor, hem de definir despres de passar els parametres, es a dir despres de tancar el parentesis, quin tipus de dada retornara. Per exemple, si volem retornar un ener definiriam la funció de la seguent manera:

```kotlin
fun inventada (parametre: tipus): int {
  <..> codi <..>
  return variable_de_retorn
}
```
A l'hora d'invocar la funció també hem de tenir en compte que hem de passar la sortida a una variable. Per exemple, l'exemple que anterior l'invocariam aixi:

```kotlin
val variable = inventada(valor)
```

També podem cridar la funció dins un string, engloban la variable entre ${}

```kotlin
println("EL retorn de la funcio es: ${inventada(valor)}")
```
 
