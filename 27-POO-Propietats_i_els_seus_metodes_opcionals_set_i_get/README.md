# 27- POO: Propietats i els seus mètodes opcionals set i get

Hem vist que cuan definim una propietat publica, podem accedir al seu contingut per modificarlo o consultarlo des d'on definim l'objecte.

A una propietat, podem asociarli un mètode anomenat set al moment que se li assigni un valor i un altre mètode anomenat get cuan s'accedeix al contingut de la propietat.

Aquets mètodes son opcionals i ens permeten validar la dada a asignar a la propietat o el valor de retorn.

Si no definim aquets mètodes, el mateix compilador els crea per defecte.

## [Exemple1](https://github.com/marcmoiagese/curskotlin/blob/master/27-POO-Propietats_i_els_seus_metodes_opcionals_set_i_get/Exemple1/src/main/kotlin/Main.kt)

Declarar una classe anomenada Persona amb dues propietats que enmagatzemin el nom i l'edat de la persona. A la propietat nom, enmagatzemar sempre en majuscula el nom i quan es recuperi el seu valor retornarlo entre parèntesis. també controlar que no es pugui introduir una edat amb un valor negatiu, si això passa, guardar 0.
