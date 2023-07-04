# 41- Funcions: Número variable de parametres

A Kotlin un mètode de una classe o funció pot rebre una cantitat variable de parametres  utilitzan una paraula clau "varag" previa al nom del paràmetre.

Des d'on cridem a la funció enviem una llista de valors i ho rep un unic paràmetre agrupan aquestes dades en un vector.

```kotlin
fun imprimir(vararg noms: String) {
    for(element in noms)
        print("$element ")
    println()
}

fun main(args: Array<String>) {
    imprimir("Joan", "Anna", "Lluís")
}
```

Com podem observar, utilitzem vararg previament al nom del paràmetre i el tipus de dada que guardarà el vector.

```kotlin
fun imprimir(vararg noms: String) {
    for(element in noms)
        print("$element ")
    println()
}
```

Dins de la funció tractarem al paràmetre nom com un vector. Cuan cridem a la funció imprimir no enviem un vector sino una llista de String, el compilador s'encarrega de transformar aquesta llista a un vector.

