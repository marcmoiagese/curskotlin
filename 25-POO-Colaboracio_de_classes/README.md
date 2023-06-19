# 26 - POO - Colaboració de classes

Normalment, a un programa resolt amb la metodologia d'orientació a objectes, no interve una sola classe, sino que hi ha moltes classes que interactuen i es comuniquen.

Plantejarem problemes separan les activitats en diferents classes

## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/25-POO-Colaboracio_de_classes/Exemple1/src/main/kotlin/Main.kt) 

Un Banc te 3 clients que poden fer diposits i extraccions. El banc també requereix que al final del dia calculi la cantitat de diners que hi ha depositats.

El primer que farem es identificar les classes. Podríam dir que hi ha dos classes, la client i la del banc

Després definir les propietats i mètodes que tindra cada classe

```txt
 Cloent
      Propietats
           Nom
           Saldo
      Metodes
           Diposit
           Extreure
           Imprimir
 Banc
      Propietats
           3 Clients ( 3 objectes de la classe client )
      Mètodes
           Operar
           Diposits totals
```

## [Exemple2](https://github.com/marcmoiagese/curskotlin/blob/master/25-POO-Colaboracio_de_classes/Exemple2/src/main/kotlin/Main.kt)

Fes un programa que permeti jugar a daus. Les regles del joc son:

Es tiraran tres daus, si els tres surten amb el mateix valor ensenyar un missatge que posi "Has guanyat", sino "has perdut".

El primer que fem es identificar les classes i despres les propietats i els mètodes

```txt
 Dau
      propietats
          valor
      metodes
          tirar
          imprimir
 JocDeDaus
      propietats
          3 daus ( 3 objectes de dau )
      metode
          jugar
```
