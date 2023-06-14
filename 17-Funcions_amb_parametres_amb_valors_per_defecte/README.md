# 17- Funcions: amb parametres amb valor per defecte

A Kotlin es pot definir parametres i asignarlos una dada a la mateixa capsalera de la funció. Després cuan cridem a la funció podem o no enviarli un valor al parametre.

Els parametres per defecte, ens permeten crear funcions mes flexibles i que es poden utilitzar en diferents condicions.

Podem declarar una funcio amb parametres per defecte de la seguent manera:

```kotlin
fun nomClasse(var: String = "-")
```

D'aquesta manera si no li indiquem el contrari, escriura -. Però podem modificar si al invocarla li passem una nova dada.

```kotlin
nomClasse("*")
```

En cas que la funció tingui dos o mes arguments, si no es passa l'argument de les que tenen un valor per defecte associat, no es queixara ja que te un valor asociat.

```kotlin
fun nomClasse(var1: Int, var2: String = "-"){
	algoritme
}

fun main(){
  nomClasse(argument_per_var1)
}
```

En aquest exemple nomes paso el valor que contindria la variable "argument_per_var1" a la variable dins la funcio var1, i no modifiquem  var2.
