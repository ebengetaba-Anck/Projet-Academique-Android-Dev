// Exercice3_Drawable.kt

interface Drawable {
    fun draw()
}

class Circle(val rayon: Int) : Drawable {
    override fun draw() {
        println("Cercle de rayon $rayon :")
        println(" *** ")
        println(" *   * ")
        println(" *** ")
    }
}

class Square(val cote: Int) : Drawable {
    override fun draw() {
        println("Carré de côté $cote :")
        println("*****")
        println("*   *")
        println("*   *")
        println("*****")
    }
}

fun main() {
    val formes = listOf(Circle(5), Square(4))
    formes.forEach { it.draw() }
}