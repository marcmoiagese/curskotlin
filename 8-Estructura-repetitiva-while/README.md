# Estructura repetitiva while

Fins ara hem emprat estructures secuencials i condicionals, pero tenim altres tipus d'estructures com les repetitives. Una estructura repetitiva permet executar una instrucció o un conjunt d'instruccions mes d'una vegada. Aquest tipus d'estructures, tenen una regla que detemina si es repeteix o no l'acció.

WHILE ( Mentres.. )

Una estructura WHILE com a primera acció verifica si la condició definida es compleix, en cas afirmatiu, s'executaran les instruccions indicades fins que aquesta condició cambio.
En cas que la condicio sempre retorni verdader com per exemple seria ( 1 == 1 ) tindriam un bucle infinit.

Un esquema que ens pugui ajudar a entendre mes el funcionament del while seria el seguent:

```less
Inici
├── Establir variable contador a 0
├── Mentre contador sigui menor que 10, fer:
│   ├── Imprimir contador
│   ├── Augmentar contador en 1
└── Fi del bucle while
Fi
```


