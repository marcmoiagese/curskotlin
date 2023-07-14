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