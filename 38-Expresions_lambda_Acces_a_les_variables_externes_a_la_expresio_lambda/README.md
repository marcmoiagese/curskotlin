# 38- Expresions lambda: Acces a les variables externes a la expresio lambda

Hem vist anteriorment que una expresió lambda es cuan enviem a una funcio d'ordre superior directament una funcio anonima.
Dins de la funcio lambda podem accedir als parametres de la mateixa si els te, definir variables locals i ara veurem que tambe podem accedir a les variables externes a la expresió lambda definida.

Podem accedir a una variable que estigui declarada fora de la funció lambda

```kotlin
var contador = 0
recorroVector(vectorX) {
    if (it != 0 )
        contador++
}
```

La variable contador es de tipo Int i s'inicialitza a 0 previament abans de cridar a la funció recorroVector i passar l'expresió lambda on incrementem el contador cada cop que analitzem un element del vector que ens envia la funció d'ordre superior.

També remarcar que cuan una funció no retorna cap dada i es un paràmetre d'una altra funció, hem de posar que el que retorna es de tipus Unit 

```kotlin
fun recorroVector(vector: IntArray, funcio:(Int) -> Unit) {
```

També cal tenir en compte que no es obligatori indicar com a Unit que la propia funció no retorna cap dada, ja que Kotlin es capas de detectar-ho, es a dir, no veuras gaires cops el seguent exemple per que no cal

```kotlin
fun recorroVector(vector: IntArray, funcio:(Int) -> Unit): Unit {
```

La classe IntAray com les altres classes similars ByteArray, ShortArray, FloatArray, etc disposen de un metode anomenat forEach que se li te d'enviar una expresio lambda, la cual s'executa per a cada element del vector.

```kotlin
vectror.dorEach {
    Funció lambda
}
```

La classe Array tambe disposa de un mètode forEach al que li passem una funció lambda i rep com a parametre un element del Array cada cop que s'executa. 

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/38-Expresions_lambda_Acces_a_les_variables_externes_a_la_expresio_lambda/Exemple1/src/main/kotlin/Main.kt)

Crearem una funció d'ordre suoperior que rebi un vector d'enters i una funcio amb un parametre de tipus init, que no retorni res.

La funcio ha d'enviar cada element del vector a l'expresio lambda definida.

A la funcio main, definirem un vector d'enters de 10 elements i enmagatzemar valors aleatoris compresos entre 0 i 99.

Imprimir del vector:
- La cantitat de multiples de 3
- La suma de tots els components que siguin superiors a 50

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/38-Expresions_lambda_Acces_a_les_variables_externes_a_la_expresio_lambda/Exemple2/src/main/kotlin/Main.kt)

Resoldrem el mateix problema pero en aquest cas utilitzarem el mètode forEach que disposa la classe IntArray per analitzar tots els components del vector.

A la funcio main definirem un vector d'enters de 10 elements i guardarem valors aleatoris compresos entre 0 i 99.

Imprimirem del vector:
- La cantitat de multiples de 3
- La suma de tots els components superiors a 50

## [Exemple 3](https://github.com/marcmoiagese/curskotlin/blob/master/38-Expresions_lambda_Acces_a_les_variables_externes_a_la_expresio_lambda/Exemple3/src/main/kotlin/Main.kt)

Declararem una classe Persona amb les propietats nom i edat, definirem com a metodes la seva impresio i una altra que retorni true si es major d'edat o false en cas contrari. A la funció main, definirem un vector amb cuatre elements de tipus Persona. Calcularem cuantes persones son majors d'edat cridan al mètode forEach de la classe Array.

## Problemes

- Decada una classe Dau que tingui com a propietat el seu valor i dos mètodes que permetran tirar el dau i imprimir el seu valor. A la main definirem un vector de 55 objectes de tipus Dau
  tirar els 5 daus i imprimir cuants 1,2,3,4,5 i 6 han sortit ( [Solució](https://github.com/marcmoiagese/curskotlin/blob/master/38-Expresions_lambda_Acces_a_les_variables_externes_a_la_expresio_lambda/Problema1/src/main/kotlin/Main.kt) )
