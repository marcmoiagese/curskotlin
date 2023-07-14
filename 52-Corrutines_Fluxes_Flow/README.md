# 52- Corrutines: Fluxes ( Flow )

Un fluxe es un tipus de corrutina que pot emitir diversos valors de manera secuencial, en comptes de les funcions de suspensió que poden retornar un unic valor.

Un fluxe conceptualment es una transmissió de dades que es pot fer de forma asíncrona.

Els valorss emesos tenen que ser del mateix tipus. Per exemple, un Flow es un fluxe que emet valors enters, pero poden ser de cualsevol altre tipus, String, Float, un data class Persona, etc.

Un fluxe pot enviar de manera segura una solicitut de xarxa per produir el seguent valor sense bloquejar el subproces principal de l'aplicació i evitar el seu bloqueig.

Anem a veure com podem administrar un fluxe mitjançant el API de Flow:

```kotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

data class Persona(val nom: String, val edat: Int)

fun retornaPersona(): Flow<Persona> = flow {
    val llista = listOf(
        Persona("Marti", 1),
        Persona("Arnald", 33),
        Persona("Anna", 32)
    )
    for (element in llista) {
        delay(1000)
        emit(element)
    }
}

fun main() = runBlocking {
    retornaPersona().collect { persona -> println("${persona.nom} ${persona.edat}") }
}
```

![IMG]()

Flow es una interficie mitjançant la crida a la funcio flow passem una funcio lambda on mitjansant la crida de la funcio emit retornem la dada que sera processada desde la crida a la duncio collect.

Com que collect es una funció de suspenció, aquesta s'ha de cridar des d'un bloc de corrutina, en aquest cas dins de runBlocking.

Podem imaginar la recuperacio de dades de persones que es troben en un servidor que requereix temps no trivial.

Podem fer la crida a la funcio retornaPersona de manera asincrona per seguir amb l'execusio del fil principal del programa i no tenir que esperar la recuperació de totes les dades.

```kotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

data class Persona(val nom: String, val edat: Int)


fun retornaPersona(): Flow<Persona> = flow {
    val llista = listOf(
        Persona("Marti", 1),
        Persona("Arnald", 33),
        Persona("Anna", 33)
    )
    for (element in llista) {
        delay(1000)
        emit(element)
    }
}

fun main() = runBlocking {
    async { retornaPersona().collect { persona -> println("${persona.nom} ${persona.edat}") }}
    println("Fin de la main")
}
```
