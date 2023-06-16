# Condicional IF

Quan ens trobem davant de la presa de decisions, disposem de les estructures condicionals per ajudar-nos a triar. Haig d'optar per uns estudis o per uns altres? Prefereixo menjar pollastre o sopa? He de decidir entre seguir el camí A o el camí B, entre altres opcions. 

## Estructura condicional simple

Una estructura condicional simple és quan, enfrontats a una decisió, prenem una única opció en funció d'una condició específica.

```css
[INICI]
   │
   ▼
[IF]
   │
   ├──❏ Condició és veritable?
   │       │
   │       ├──❏ Sí
   │       │   │
   │       │   └──► [FAI X]
   │       │
   │       └──❏ No
   │           │
   │           └──► [SORTIR DEL IF]
   │
   └──► [SORTIR DEL IF]
   │
   │
   ▼
[FI]
```

La paraula "if" indica que ens trobem davant d'una estructura condicional. Després, disposem de la condició entre parèntesis i, finalment, entre claus d'ator, les instruccions a seguir en cas que es compleixi. Tingueu en compte que les claus d'ator són una forma d'indicar l'inici i el final de la condicional, però, Si la situació on es compleix només conté una línia, podem ometre les claus.

Només es pot passar variables, valors constants i operadors relacionals com a paràmetres a una condició.

Com a operadors relacionals tenim:

```
>  (Mes gran que)
<  (Mes petit que)
>= (Mes gran o igual que)
<= (Mes petit o igual que)
== (Igual)
!= (Diferent)
+ (mes)
- (menys)
* (producte)
/ (divisió)
% (resta d'una divisió)
```

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/4-Condicional_if/Exemple1/src/main/kotlin/Main.kt)

Per exemple, donat el salari d'una persona i aquest supera els 1500€, mostrarem un missatge per pantalla indicant que ha de pagar impostos.

## [Exemple 2](https://github.com/marcmoiagese/curskotlin/blob/master/4-Condicional_if/Exemple2/src/main/kotlin/Main.kt)

Estructura condicional composta, Son les que quan tenim que pendre la desició podem realitzar mes d'una acció

## [Exemple 3](https://github.com/marcmoiagese/curskotlin/blob/master/4-Condicional_if/exemple3/src/main/kotlin/Main.kt)

Es demanen per teclat dos valors enters. Si el primer és menor que el segon, es calcula la suma i la resta d'aquests i es mostra el resultat per pantalla.
Si el primer és igual o major que el segon, es calcula el producte i la divisió d'aquests i també es mostra el resultat.

## [Exemple 4](https://github.com/marcmoiagese/curskotlin/blob/master/4-Condicional_if/Exemple4/src/main/kotlin/Main.kt)

Es demanen tres notes d'un alumne, si la seva mitjana és igual o superior a 7, es mostrarà un missatge indicant que ha aprovat.

## [Exemple 5](https://github.com/marcmoiagese/curskotlin/blob/master/4-Condicional_if/Exemple5/src/main/kotlin/Main.kt)

Es dona per teclat un enter compres entre 1 i 99, mostrar un missatge si el numero te un o dos numeros
