# 37- Expresions lambda amb vecors IntArray, FloatArray, DoubleArray, etc

Hem vist en conceptes anteriors que pels tipus basics Byte, Short, Int, Long, Float, Double, Char  i Boolean tenim una serie de classes per definir vectors d'aquests tipus: ByteArray, ShortArray, IntArray, LongArray, FloatArray, DoubleArray, CharArray i BooleanArray.

Hem vist com crear un vector de tres enters i posteriorment la seva carrega amb la síntaxis:

```kotlin
var vector = IntArray(3)
    vector[0] = 10
    vector[1] = 10
    vector[2] = 10 
```

La classe IntArray te una serie de mètodes que requereixen una expresió lambda, com que no coneixiam les expresions lambda no les hem utilitzat als conceptes que hem vist cuan feiam vectors.

La classe IntArray com les altres que hem nombrat ( ByteArray, ShortArray, etc. ) tenen un segon constructor amb dos parametres, el primer indica la cantitat d'elements del vector i el segon ha de ser una expresió lambda a la que li indiquem el valor a guardar a cada component del vector. Al següent exemple crearia un vector de 10 elements i guardaria 5 a cada un d'ells.

```kotlin
var vector = IntArray(10) {5}
```

Si el que vulguessim es guardar al primer element 0, al segon 1 i aixi succesivament, podríam fer-ho amb la següent sintaxis

```kotlin
var vector = IntArray(10) {it}
```

Això funciona degut a que la funció d'ordre superior cuan crida a la nostra expresio lambda per cada component del vector ens envia la posició. Recordem que la seva forma llarga per expresar la mateixa síntaxis es:

```kotlin
var vector = IntArray(10) {index -> index}
```

En cas de voler guardar els valors 0,2,4,6,etc podíam fer-ho aixi

```kotlin
var vector = IntArray(10) {it * 2}
```

també podem enmagatzemar valors aleatoris per exemple entre 1 i 6 

```kotlin
var vector = IntArray(10) {((Math.random() * 6) + 1).toInt()}
```

Hi ha funcions que ens permeten coses com per exemple si volem  verificar que tots els elements d'un vector cumpleixen una condició ho podem validar mitjançant la funcio all

```kotlin
if (vector.all {it <= valor})
```

també podem validar si algun dels valors cumpleix una condicio amb l'expresio any

```kotlin
if (vector.any {it >= valor})
```

Sempre hem de consultar la pagina oficial de kotlin on podem trobar totes les classes de la llibrerira estàndard. En aquest cas tindriam que consultar la classe [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/)

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/37-Expresions_lambda_amb_vecors_IntArray_FloatArray_DoubleArray_etc/Exemple1/src/main/kotlin/Main.kt)

Crearem un objecte de la classe IntArray de 20 elements amb valors aleatoris compresos entre 0 i 10. del vector imprimirem les següents causistiques:
- tots els elements
- Cantitat d'elements menors o iguals a 5
- Imprimirem un missatge si tots els elements son meonors o iguals a 9
- Imprimirem un missatge si al menys un dels elements del vector guarda un 10

## Problemes

- Crea un vector de tipo  FloatArray de 10 elements, carregar els seus elements per teclat
  imprimir la cantitat de valors introduits que siguin menors de 50. Imprimir un  missatge si tots els valors son menors de 50. [ [Solucio]() ]
