Escriu un programa que demani les coordenades d'un punt en un pla, es a dir dos valors enters X e Y
Despres imprimirem per pantalla a quin cuadran es troba el punt.

- El primer cuadrant seria si X > 0 i Y > 0
- El segon cuadrant seria si > < 0 i Y > 0
- El tercer cuadrant seria si X < 0  i Y < 0
- El cuart cuadrant seria si x > 0 i Y < 0
- Si algun dels dos valors es zero es per que el punt es troba al centre de l'eix

Escrivim la paraula clau when i entre claus les diferents condicions, seguides de l'operador -> seguit de les instruccions a executar si es cumpleix la condició

```kotlin
    when{
        x > 0 && y > 0 -> println("Primer cuadrant")
        x < 0 && y > 0 -> println("Segon cuadrant")
        x < 0 && y < 0 -> println("Tercer cuadrant")
        x > 0 && y < 0 -> println("Cuart cuadrant")
        else -> println("el punt esta en un eix")
    }
```

Si una de les condicions es certa, no s'analitzaran les següents, si cap de les cuatre condicions descrites es certa, s'executara la condició que hem descrit dins el else. El mateix problema es pot resoldre amb if aniuats, pero queda mes clar i concís amb when

```kotlin
   if (x > 0 && y > 0)
        print("Primer cuadrant")
    else
        if (x < 0 && y > 0)
            print("Segon cuadrant")
        else
            if (x < 0 && y < 0)
                print("Tercer cuadrant")
            else
                if (x > 0 && y < 0)
                    print("Cuart cuadrant")
                else
                    print("el punt esta en un eix")
```
