# 38- Expresions lambda: Acces a les variables externes a la expresio lambda

Hem vist anteriorment que una expresió lambda es cuan enviem a una funcio d'ordre superior directament una funcio anonima.
Dins de la funcio lambda podem accedir als parametres de la mateixa si els te, definir variables locals i ara veurem que tambe podem accedir a les variables externes a la expresió lambda definida.

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/38-Expresions_lambda_Acces_a_les_variables_externes_a_la_expresio_lambda/Exemple1/src/main/kotlin/Main.kt)

Crearem una funció d'ordre suoperior que rebi un vector d'enters i una funcio amb un parametre de tipus init, que no retorni res.

La funcio ha d'enviar cada element del vector a l'expresio lambda definida.

A la funcio main, definirem un vector d'enters de 10 elements i enmagatzemar valors aleatoris compresos entre 0 i 99.

Imprimir del vector:
- La cantitat de multiples de 3
- La suma de tots els components que siguin superiors a 50
