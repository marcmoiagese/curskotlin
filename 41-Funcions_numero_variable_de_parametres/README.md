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

Només un parametre d'una funció pot ser de tipus vararg i normalment es l'ultim.

**Note**
A l'entorn IntelliJ IDEA si prems la tecla ctrl i poses la fletxa del ratolí sobre un mètode, ens apareix un link, si presionem  s'obrirà una pestanya on podrem veure on esta implementat el mètode. Això ens permet desplasarnos pel nostre programa de manera rapida i poder analitzar els algoritmes que ja estan definits a una llibreria estànbdard de Kotlin.

## Operador spread

Si una funció rep un paràmetre de tipus vararg i des d'on la cridem volem enviarli un vector, hem d'indicarli al compilador la situació.

```kotlin
fun imprimir(vararg noms: String) {
    for(element in noms)
        print("$element ")
    println()
}

fun main(args: Array<String>) {
    val persones = arrayOf("Joan", "Anna", "Lluis")
    imprimir(*persones)
}
```
es a dir l'antecedeix el caràcter * previ al vector que li envies a la funció.

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/41-Funcions_numero_variable_de_parametres/Exemple1/src/main/kotlin/Main.kt)

Farem una funció que rebi una cantitat variable d'enters i ens retorni la seva suma [Exemple optimitzat](https://github.com/marcmoiagese/curskotlin/blob/master/41-Funcions_numero_variable_de_parametres/Exemple1/src/main/kotlin/Optimitzat.kt)

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/41-Funcions_numero_variable_de_parametres/Exemple2/src/main/kotlin/Main.kt)

Realitzarem una funció que rebi com a primer paràmetre, el tipus d'operacio que vulguem realitzar ambe amb les seguents dades enters que li enviem.

## Problemes

*  Fes una funció que rebi una serie d'edats i ens retorni la cantitat que son mes grans o iguals a 18 (com a minim s'envia un enter a la funció) ( [Solució]() )
