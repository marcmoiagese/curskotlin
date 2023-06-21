# 27- POO: Propietats i els seus mètodes opcionals set i get

Hem vist que cuan definim una propietat publica, podem accedir al seu contingut per modificarlo o consultarlo des d'on definim l'objecte.

A una propietat, podem asociarli un mètode anomenat set al moment que se li assigni un valor i un altre mètode anomenat get cuan s'accedeix al contingut de la propietat.

A la programació orientada a objectes es habitual l'us dels metodes get() i set() per obtenir i establir respectivament, el valor d'una propietat. Però a Kotlin son opcionals ja que es generen automaticament.

són molt utils, ja que ens permeten validar la dada a asignar a la propietat o el valor de retorn.

Kotlin fenera internament els metodes get i set per les propietats mutables (var) i get per les propietats de nomes lectura (val) i s'encarrega d'invocarlos cada vegada que accedim o modifiquem el valor d'una propietat. Es defineixen inmediatament despres de definir la propietat, sense importar l'ordre en el cas de les porpietats mutables.

```kotlin
val id: Int = id
    get() = field

var nom: String = nom
    get() = field

    set(valor) {
	field = valor
    }
```

field contè el valor de la propetat, i en el cas del set, no indiquem el tipus, ja que es del mateix tipus que la propietat. Dins del mètode set, podem modificar el contingut de la propietat. 

```kotlin
var nom: String = nom
    set(valor) {
        field = if ("Felip VI" == value) 
		"persona no Benvinguda"
        else
            value

    }
```

També podem fer el mateix amb el metode get().

Es importan entendre, que aquets metodes també es criden cuan definim un objecte i li assignem un valor a una de les seves propietats.

## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/27-POO-Propietats_i_els_seus_metodes_opcionals_set_i_get/Exemple1/src/main/kotlin/Main.kt)

Declarar una classe anomenada Persona amb dues propietats que enmagatzemin el nom i l'edat de la persona. A la propietat nom, enmagatzemar sempre en majuscula el nom i quan es recuperi el seu valor retornarlo entre parèntesis. també controlar que no es pugui introduir una edat amb un valor negatiu, si això passa, guardar 0.

## Problemes

Fes una classe que representi un treballador. Defineix com a propietats el seu nom i el seu salari.
- No permetis que el salari sigui un valor negatiu.
- Fes un metode imprimir dins la classe. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/27-POO-Propietats_i_els_seus_metodes_opcionals_set_i_get/Problema1/src/main/kotlin/Main.kt) )
