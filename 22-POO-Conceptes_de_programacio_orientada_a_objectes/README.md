# 22- POO - Conceptes de programació orientada a objectes

Kotlin ens permet emprar la metodologia de programació orientada a objectes.

Amb la metodología de programació orientada a objectes (POO) anirem introduin conceptes d'objecte, classe, propietat, camp, metode, constructor, herencia, etc. I de tots aquets temes anirem plantejan problemes resolts.

Casi tots els llenguatges desenvolupats els ultims 25 anys, implementen la posibilitat de treballar amb POO (Programació Orientada a Objectes)

## Conceptes bàsics d'objectes.

Hem d'imaginar un objecte com una entitat independent amb les seves propies dades i programació. Finestres, cadires, taules podríen ser identificats com objectes. Les característiques de cada element com el material el color  serien els camps si les seves propietats, i el funcionament del seu mecanisme seria el metode.

El concepte de la tecnologia orientada a objectes, es la suma de funcions a elements de dades, a aquesta unió se l'anomena encapsulament. Per exemple, un cotxe te rodes, motod, velocitat, color etc, que anomenem atributs. Encapsulats amb aquestes dades tenim els métodes per arrancar, aturar, girar, frenar, etc. La responsabilitat d'un objecte auto, consisteix en realitzar les accions apropiades i mantenir actualitzades les seves dades internes. Cuan una altra part del programa ( Altres objectes ) neseciten que el cotxe realtzi alguna d'aquestes tasques ( per exemple arrancar) li envia un missatge. Als objectes que envien missatges, no els interessa la manera en que l'objecte auto porta a terme les seves tasques, ni les estructures de dades que gestiona. per aixó, estan ocults. Llavors, podem dir que un objecte conté informació pública, el que neseciten els altres objectes per interactuar amb ell, i informació privada, interna, el que nesecita l'objecte per operar i que es irrelevant per als altres objectes de l'aplicació.

## Concepte de clase i definició d'objectes.

La programació orientada a objectes es basa amb la programació de classes, a diferencia de la programació estructurada, que esta mes centrada en les funcions.

Una classe es com un motlle o plantilla del que despres es poden crear multiples objectes amb característiques similars. aquest motlle o plantilla, defineix propietats (variables) i metodes (funcions)

La classe defineix les propietats i metodes comuns als objectes d'aquest tipus, pero despres, cada objecte tindra els seus valors propis i compartiran les mateixes funcions.

Hem de crear una classe abans abans de crear objectes (instancies) d'aquella classe. Al crear un objecte d'una classe, es diu que es crea una instancia de la classe o un objecte propiament dit.

L'estructura bàsica d'una classe a Kotlin, es:

```kotlin
class [nom de la classe] {
  [propietats de la classe]
  [métodes o funcions de la classe]
}
```
