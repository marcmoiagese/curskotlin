# Funcions: amb una unica expresio

Les funcions que tenen una unica expresió a Kotlin es poden expresar sense el bloc de claus i mitjançant una asignacio el valor a retornar.

```kotlin
fun funcio(var: Int) = var * var
```
com pots veure, la implementació completa de la funció es fa en una sola linea. Despues de cridar la funció posem = i seguidament l'expersió, com pots veure en aquest cas no hem indicat qun es el tipus de dada que retornara, ja que no es necessari indicar quin es el tipus de dada que retorna la funció. Aixó es per que el compilador interpreta quin es el resultat de var * var.

Tenin en compte que l'expresió if pot escriures com una expresió, també la podem utilitzar a les funcions amb una unica expresió.

```kotlin
fun nomFuncio(var1: Tipo, var2: Tipo) = if (var1 > var2) var1 else var2
```


