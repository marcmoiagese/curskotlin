/**
 * Donada la declaració de la següent data class:
 *
 * data class Article(val codi: Int, val descripcio: String, var preu: Float)
 *
 * Definir un vector amb 4 elements de tipus Article Implementar dues funcions, una a la que li enviarem el vector i ens ensenyi tots els seus components,
 * i l'latra que també rebi el vector d'articles i procedeixi a augmentar un 10% tots els productes.
 */

data class Article(val codi: Int, val descripcio: String, var preu: Float)

fun Imprimir (article: Array<Article>){
    for (i in article)
        println("Codi: ${i.codi}  Descripcio: ${i.descripcio} ${i.preu} ")
}

fun PujaPreu(article: Array<Article>){
    for (i in article)
        i.preu = i.preu + (i.preu * 0.10f)
}


fun main(args: Array<String>) {
    val article: Array<Article> = arrayOf(
        Article(1, "dentastix", 15f),
        Article(2, "Dolços", 20f),
        Article(3, "Pomes", 3f),
        Article(4, "Raspberry Pi", 40f)
    )

    Imprimir(article)

    PujaPreu(article)
    Imprimir(article)
}