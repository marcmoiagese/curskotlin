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

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/35-Funcions_d_ordre_superior/Exemple1/src/main/kotlin/Main.kt)

Definirem una funció d'ordre superior anomenada operar. Li arribaran com a parametre dos enters i una funció. Al bloc de la funció cridar a la funcio que arribi com a parametre i enviar els altres dos parametres.

La funció retornara un enter

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/35-Funcions_d_ordre_superior/Exemple2/src/main/kotlin/Main.kt)

Declararem una classe que enmagatzemi el nom i l'edat d'una persona. Definirem un mètode que retorni true o false depenen si la persona es major d'edat o no. Aquesta funció ha de rebre com a paràmetre una funcio que al cridarla passant-li l'edat de la persona retorni si es major o no d'edat.
Tindrem en compte que si viu a Estats units, la majoria d'edat es a partir dels 21 anys, i que a Españistan ho es a partir dels 18.


