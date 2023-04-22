# Bucle For
Els bucles 'for' a Kotlin tenen algunes variants. En aquest cas, veurem el 'for' amb expressions de rang.
Un rang defineix un interval amb un valor inicial i un valor final, i es defineix utilitzant el valor.

```kotlin
..
```
Exemples de definició de rang serien:

```kotlin
val undigit = 1..9
val dotzena = 1..12
var lletres = 'a'..'z'
```

Si necessitem conèixer si un valor es troba dins un rang, hem d'utilitzar l'operador 'in' o '!in'.

```kotlin

val dotzena = 1..12
if(5 in dotzena)
	println("el 5 esta dins el rang de la dotzena")

if(18 !in dotzena)
	println("el 18 no esta dins el rang de la dotzena")
```

Els dos if es verifiquen com a cert, el diagrama per poder compendre millor com funciona el bucle for seria:

```css
[INICI]
   │
   ▼
[BUCLE FOR]
   │
   ├──❏ Comptador = 0
   │
   ├──❏ Comptador és menor que 10?
   │       │
   │       ├──❏ Sí
   │       │   │
   │       │   ├──► [IMPRIMIR CONTADOR]
   │       │   │
   │       │   └──► [INCREMENTAR COMPTADOR]
   │       │
   │       └──❏ No
   │
   └──► [SORTIR DEL BUCLE FOR]
   │
   │
   ▼
[FI]
```




## Variants del Bucle Fror

Si necessitem que la variable for no recorri tots els valors compresos dins del rang, sinó que, per exemple, avanci de 2 en 2, podem utilitzar la següent sintaxi.

```kotlin
 in 1..10 step 2)
        println(i)
```

Amb aquest exemple s'imprimira els valors 1, 3, 5, 7, 9

En cas que necessitem que la variable prengui el valor 10, després el 9 i així successivament, és a dir, que recorri inversament, ho podem fer amb la següent sintaxi.

```kotlin
    for(i in 10 downTo 1)
        println(i)
```
S'imprimiran els valors 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

També podem utilitzar el step amb el downTo:


```kotlin
for(i in 10 downTo 1 step 2)
        println(i)
```

Imprimira els valors 10, 8, 6, 4, 2


També tenim la seguent variant la cual imprimira els valors de 0 a 9 excloent el numero 10

```kotlin
    for(x in 0 until 10)
        println(x)
```
