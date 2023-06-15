# 3- Entrada de dades per consola

Quan volem imprimir dades per pantalla, utilitzem les funcions print i println. Si el que necessitem és introduir dades per teclat, podem utilitzar la funció readln.

Per recollir dades des de la consola, disposem de la funció readln(), que ens permet llegir les dades que l'usuari introdueixi per teclat.
Aquesta funció retorna una cadena de caràcters amb els valors introduïts fins que es prem la tecla Enter. Per convertir aquesta cadena a un valor numèric,
podem utilitzar el mètode toInt() de la classe String. D'aquesta manera, podem guardar el valor numeric dins de la variable val1.

Si l'operador prem enter sense haver introduït cap valor, es produeix una excepció que més endavant veurem com tractar.

## [Exemple 1](https://github.com/marcmoiagese/curskotlin/blob/master/3-Entrada_dades_consola/Exemple1/src/main/kotlin/Main.kt)

El següent exemple ens ensenya com carregar per teclat dos números enters i imprimir per pantalla la suma i el seu producte.

## [Exemple2](https://github.com/marcmoiagese/curskotlin/blob/master/3-Entrada_dades_consola/Exemple2/src/main/kotlin/Main.kt)

En aquest cas, farem un exemple en el que se'ns demanarà la longitud del costat d'un quadrat i es mostrarà el seu perímetre.

## [Exemple3](https://github.com/marcmoiagese/curskotlin/blob/master/3-Entrada_dades_consola/Exemple3/src/main/kotlin/Main.kt)

En aquest exemple, S'ha de desenvolupar un programa que demani la introducció del preu d'un article i la quantitat que porta el client. Mostrar el que ha d'abonar el comprador.

## Problemes

- Escriu un programa en el qual s'ingressin quatre números enters, calcula i informa la suma dels dos primers i el producte del tercer i quart. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/3-Entrada_dades_consola/prob1/src/main/kotlin/Main.kt) )
- Realitza un programa que llegeixi per teclat quatre valors numèrics enters i informi de la seva suma i promig. ( [Solucio](https://github.com/marcmoiagese/curskotlin/blob/master/3-Entrada_dades_consola/prob2/src/main/kotlin/Main.kt) )
