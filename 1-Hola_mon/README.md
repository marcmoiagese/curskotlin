# Hola Mon

tots els programes escrits en Kotlin han de contenir la funció main. Més endavant, veurem per a què serveix el paràmetre que rep la funció main entre parèntesis "(args: Array<String>)". Les funcions en Kotlin comencen amb la paraula "fun", i després entre parèntesis es defineixen els paràmetres que la funció acceptarà. Entre claudàtors, disposem de l'algoritme que resoldrà el nostre problema. En aquest exemple, volem mostrar el missatge "Hola Món" per consola, per això utilitzarem la funció print() amb el missatge "Hola Món" escrit entre cometes dobles "".

A Kotlin La convenció per a nombrar els fitxers, es que el nom del arxiu ha de ser igual al nom de la classe principal que el conté si la classe principal es diu main com en aquest cas, l'arixu s'ha d'anomenar Main.kt

```kotlin
fun main(args: Array<String>) {
   println("Hola, Catalunya!")
}
```

Quan es compila un programa amb Kotlin per a l'entorn JVM, la funció principal del programa ( Main ) es converteix en un mètode estàtic. Aquest mètode estàtic s'emplaça dins d'una classe que te un nom derivat del nom del fitxer en el qual es troba la funció principal.

Això significa que quan es compila un programa Kotlin per a la JVM, el nom del fitxer té un paper important perque determina el nom de la classe principal que s'utilitzarà per a l'execusió del programa.

Per canviar el nom de la classe que conté funcions de nivell superior per a un fitxer en concret, col·loqueu l'anotació següent a la part superior del fitxer, just abans de l'instrucció del paquet.

```kotlin
@file:JvmName("LaprimeraApp")
```

Amb aquest exemple doncs, podríam cambiar l'exemple anterior anomenat Main.kt a LaprimeraApp.kt

```kotlin
@file:JvmName("LaprimeraApp")

fun main(args: Array<String>) {
    println("Hola, Catalunya!")
}
```

[Exemple de primer programa en Kotlin](https://github.com/marcmoiagese/curskotlin/blob/master/1-Hola_mon/Exemple1/src/main/kotlin/Main.kt)
