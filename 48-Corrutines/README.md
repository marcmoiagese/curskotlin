# 48-Corrutines

La programació asincrona o sense bloqueig a kotlin es possible mitjançant una tecnologia anomenada Corrutines que ve implementada una part dins el porpi llenguatge Kotlin i una altra gran part mitjançant biblioteques de  funcions.

Aquesta metodologia es molt útil cuan tenim que treballar amb algoritmes que requereixen molts recursos, consultes a servidors d'internet, consultes a bases de dades, descarrega d'arxius grans, etc. Amb l'objectiu de no bloquejar el fil principal de la nostra aplicació  i que l'usuari es vegi impedit de interactuar amb el programa fins que acabi d'executar l'algoritme.

A més a més d'impedir que l'aplicació es bloquegi fins que s'acabi el procés també son indispensables per implementar aplicacions escalables. Podem tenir programes molt mes escalables executan diferents rutines de manera simultanea a diferents processadors.

Cuan volem treballar amb corutines a Kotlin hem d'importar la biblioteca kotlinx.corutines, podem visitar el lloc web on es publiquen les [ultimes actualitzacions](https://github.com/Kotlin/kotlinx.coroutines).

## [Exemple 1]()

Importarem la biblioteca per treballar amb corutines amb un projecte Kotlin. Implementarem una aplicació minima que ens mostri numeros del 1 al 10 ensenyan d'un a un cada 1 segon. I ho farem a través d'una corrutina.
 
