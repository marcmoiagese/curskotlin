# 35- Funcions d'ordre superior

Kotlin es un llenguatge orientat a objectes, pero introdueix característiques existents d'altres llenguatges funcionals que ens permeten crear codi mes clar i expresiu.

Una de les característiques del paradigma de la programació funcional, son les funcions d'ordre superior.

Les funcions d'ordre superior, son funcions que poden rebre com a parametres altres funcions i/o retornarles com a resultats. Basicamen, es quan solicitem a una funció una acció i aquesta li demana a una tercera per la raò que sigui.

Veurem un seguit d'exemples molt senzills per veure com Kotlin implementa el concepte de funcions d'ordre superior, i a mesura que abansem al curs, podrem veure les ventatges d'aquest paradigma.

```kotlin
fun operarSobreEnter(enter: Int, operacio: (Int) -> Int): Int{
    return operacio(enter)
}

fun duplicar(enter: Int) = enter * 2

fun main(args: Array<String>) {
    val resultat = operarSobreEnter(5, ::duplicar)
    println("El doble de 5 es: $resultat")

}
```

De les dues funcions que hem declarat, la que s'anomena "operarSobreEnter" es la d'ordre superior i se li passen dos paràmetres, un de tipus Int i l'altra anomenada operacio es de tipus funció. Cuan un parametre es de tipus funcio hem d'indicar els parametres que te la funcio indicada, en aquest cas te un parametre enter i despres l'operador -> indicant el tipus de dada que ens retornarà aquesta funció, que en aquest cas serà de tipo int. 

Si tenim una funció com a paràmetre que no retorna cap dada indicarem que la dada que retorna es de tipus Unit

```kotlin
operacio: (Int) -> Unit
```
L'algoritme de la funció operarSobreEnter, consisteix cridar operacio i passarli l'enter que espera aquella funció

```kotlin
return operacio(enter)
```

Com que la funció operarSobreEnter retorna un enter, hem d'indicar amb la paraula clau return que retorna una dada que retorna la funció "operacio".

Cuan fem la crida a la funció operarSobreEnter li passem tres parametres, el numero 5 com a enter i la crida a la funcio "duplicar" que es la funció que cridarà operacio des de dins de operarSobreEnter.

```kotlin
val resultat = operarSobreEnter(5, ::duplicar)
```

Com pots veure, per passar la referencia d'una funcion ho indiquem amb "::nom de la funcio"

Es importan entendre el funcionament de la funció operarSobreEnter que rep 2 parametres i utilitza un per cridar una altra funció en aquest cas "duplicar" que retorna un valor enter i que després aquest valor el retorna operarSobreEnter, i finalment arriba a la variable "resultat".

Les funcions d'ordre superior, es poden utilitzar als mètodes d'una classe.

```kotlin
data class Persona(val nom: String, val edat: Int)

class GestorPersones(private val persones: List<Persona>) {
    fun filtrarPersones(filtre: (Persona) -> Boolean): List<Persona> {
        return persones.filter(filtre)
    }
}

// Exemple d'ús de la classe GestorPersones
fun main() {
    val persones = listOf(
        Persona("Maria", 25),
        Persona("Joan", 30),
        Persona("Laura", 28),
        Persona("Marc", 22)
    )

    val gestor = GestorPersones(persones)

    // Filtrar les persones amb edat superior a 25
    val personesFiltrades = gestor.filtrarPersones { persona ->
        persona.edat > 25
    }

    println("Persones amb edat superior a 25:")
    for (persona in personesFiltrades) {
        println(persona.nom)
    }
}
```

En aquest exemple, tenim la data class persona que se li passen com atributs nom i edat, i la classe GestorPersones que te com a propietat privada una variable de tipus llista<Persona> 

```kotlin
data class Persona(val nom: String, val edat: Int)

class GestorPersones(private val persones: List<Persona>) {
```

El mètode filtrarPersones es una funció d'ordre superior que li passem un parametre, de tipus Persona i retornarà un boleà.

La funció filtrarPersones utilitza el mètode filter aplicat a la llista de persones (persones). El mètode filter és una funció de la classe List en Kotlin, que pren una funció de predicat com a argument i retorna una nova llista que conté només els elements que compleixen aquest predicat.

En resum, la funció filtrarPersones és una funció d'ordre superior que s'utilitza per filtrar una llista de persones basant-se en un criteri específic proporcionat com a argument. 

Dins de la funció main generem una llista de persones utilitzan la funcio listOf. aquesta llista conté diverses instàncies de l'objecte "Persona" amb els noms i edats especificats.

Després, creem una instancia de la clase "GestorPersones" anomenada "gestor" i li passem la llista de persones com a argument al constructor. Això crea una instància del gestor de persones amb la llista de persones proporcionada.

A continuació utilitzem la funció "filtrarPersones" de la instància "gestor" per filtrar les persones amb edat superior a 25 anys. això ho fem mitjançant l'us de la funció lambda que veurem mes endavant "{ persona -> persona.edat > 25 } ", que actua com a criteri de filtratge. La funció lambda rep una persona com a paràmetre i retorna un valor boleà que indica si l'edat de la persona es superior a 25.

El resultat del filtratge es guarda dins la variable "personesFiltrades", que serà una nova llista que conté només les persones que compleixen el criteri de filtratge. I finalment utilitzem for per recorrer la llista i imprimirla.


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/35-Funcions_d_ordre_superior/Exemple1/src/main/kotlin/Main.kt)

Definirem una funció d'ordre superior anomenada operar. Li arribaran com a parametre dos enters i una funció. Al bloc de la funció cridar a la funcio que arribi com a parametre i enviar els altres dos parametres.

La funció retornara un enter

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/35-Funcions_d_ordre_superior/Exemple2/src/main/kotlin/Main.kt)

Declararem una classe que enmagatzemi el nom i l'edat d'una persona. Definirem un mètode que retorni true o false depenen si la persona es major d'edat o no. Aquesta funció ha de rebre com a paràmetre una funcio que al cridarla passant-li l'edat de la persona retorni si es major o no d'edat.
Tindrem en compte que si viu a Estats units, la majoria d'edat es a partir dels 21 anys, i que a Españistan ho es a partir dels 18.


