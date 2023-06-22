enum class Color(val descripcio: String) {
    GORRI("vermell"),
    BERDE("verd"),
    URDINA("blau")
}

class ColorDescrip(val colo: Color, val intensitat: Int, val saturacio: Int) {
    fun getColorDescription(): String {
        val colorDescription = when (colo) {
            Color.GORRI -> "vermell"
            Color.BERDE -> "verd"
            Color.URDINA -> "blau"
        }
        return "El color $colorDescription té una intensitat de $intensitat i una saturació de $saturacio."
    }
}

fun main() {
    val colorDescription1 = ColorDescrip(Color.GORRI, 50, 75)
    println(colorDescription1.getColorDescription())  // El color vermell té una intensitat de 50 i una saturació de 75.

}