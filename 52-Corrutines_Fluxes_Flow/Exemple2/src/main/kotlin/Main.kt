import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

data class Persona(val nom: String, val edat: Int)


fun retornaPersona(): Flow<Persona> = flow {
    val lista = listOf(
        Persona("Marti", 1),
        Persona("Arnald", 33),
        Persona("Anna", 33)
    )
    for (elemento in lista) {
        delay(1000)
        emit(elemento)
    }
}

fun main() = runBlocking {
    async { retornarPersona().collect { persona -> println("${persona.nombre} ${persona.edad}") }}
    println("Fin de la main")
}