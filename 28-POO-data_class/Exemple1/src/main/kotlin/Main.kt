/**
 * Declararem un data classe anomenada Article, que guardi el codi del producte , la seva descripció i preu.
 * Despres definirem diversos objectes d'aquesta data class a la main.
 */

data class Article (var codi: Int, var descripcio: String, var preu: Float)

fun main(args: Array<String>) {
    val article1 = Article (1, "patates", 34f)
    var article2 = Article (2, "Pomes", 24f)

    println(article1)
    println(article2)

    val punter = article1
    punter.preu = 100f
    println(article1)

    var article3 = article1.copy()
    article1.preu = 200f

    println(article1)
    println(article3)

    if (article1 == article3)
        println("Son iguals $article1 i $article3")
    else
        println("Son diferents $article1 i $article3")

    article3.preu = 200f
    if (article1 == article3)
        println("Son iguals $article1 i $article3")
    else
        println("Son diferents $article1 i $article3")
}