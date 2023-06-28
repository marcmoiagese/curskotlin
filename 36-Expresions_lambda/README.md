# 36- Expresions lambda

Una expresió lambda es cuan enviem a una funció d'ordre superior directament una funcio anonima.

Es mes habitual enviar una expresió lambda enlloc d'enviar la referencia d'una funció com hem estat veien al exemple anterior.

Una expresió lambda esta composta per una serie de paràmetres, el signe -> i el cos d'una funció.

```kotlin
{x, y -> x - y}
```

Com pots comprobar va tancada entre claus. Podem indicar el tipo de dada des dels parametres de la funció pero normalment no es sol posar

```kotlin
{x: Int, y: Int -> x - y}
```

El nom dels parametres es x i y pero podría tenir cualsevol parametre. 

Sempre hem d'indicar el tipus de dada que retorna la funció. Si no retorna cap dada posarem Unit

```kotlin
fun Inventada ( funcio: (Int) -> Int): Int{}
```
l'algoritme de la funció l'expresem despres de ->, a l'exemple de mes amun seria

```kotlin
x - y
```

Aixo indica que la resta de x i y es el valor que te que retornar. Podem crer algoritmes mes complexos dins les funcions lambda, També cuan una funcio lambda es l'ultim parametre d'una funció, podem indicar l'expresió lambda despres dels parentesis per que el codi sigui mes comprensible. Es a dir, el seguent codi:

```kotlin
val multiplicacio = matematica(2, 3) {x, y -> x * y}
```

La podem cambiar de la seguent manera per que sigui mes comprensible.

```kotlin
val multiplicacio = matematica(2, 3) {x, y ->
	 x * y
}
```

El mes comu es utilitzar aquesta síntaxis per passar una expresió lambda cuan es l'ultim parametre de la funció. Amb l'intenció de poder simplificar i fer codi mes concís, cuan tenim una expresió lambda a la que la seva funció rep nomes un parametre, podem obviarlo, inclos el signe ->. Per convenció a aquest unic parametre podem fer referència a ell amb la parula "it" quedan el següent codi:

```kotlin
funcio(parametre) {x -> x * 2 }
```

De la següent manera:

```kotlin
funcio(parametre) {it * 2 }
```


## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/36-Expresions_lambda/Exemple1/src/main/kotlin/Main.kt)

Definirem una funció d'ordre superior anomenada operar, li arribarà com a paràmetre dons enters i una funció. al bloc de la funció cridarem a la funció que arriba com a parametre i enviarem els dos primers parametres.

Des de la funció main cridarem a operar i enviar diferents expresions lambdas que permetran sumar, restar i elevar el primer valor al segon.

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/36-Expresions_lambda/Exemple2/src/main/kotlin/Main.kt)

Fes una funció d'ordre superior que rebi un vector d'enters i una funció amb un paràmetre del tipus Int i que retorni un Boolean.

La funcio te d'analitzar cada element del vector cridan a la funció que rebra com a parametre, si retorna un true procedira a ensenyar l'element.

A la funció main, definir un vector d'enters de 10 elements i guardar valors aleatoris compresos entre 0 i 99.

Imprimir del vector:
- Els valors multiples de 2
- Els valors multiples de 3 o 5
- Els valors mes grans o iguals a 50
- Els valors compresos entre 1 i 10, 20, 30, 90 i 95.

## [Exemple 3]()

Farem una funcio d'ordre superior que rebi un String i una funció amb un paràmetre de tipo Char que retorni un Boolean. La funció te d'analitzar cada element del String cridan a la funció que rep com a paràmetre, si retorna un true s'afegira el caracter esmentat al String que retornara.

A la funció main definirem un String amb una cadena cualsevol.

Cridar a la funció d'ordre superior i pasar expresions lambdas per filtrar i generar un altre Stringa amb les seguents restriccions:
- Un String nomes amb les vocals
- Un String nomes amb els caracters en minúscules
- Un String amb tots els caracters no alfabetics.
