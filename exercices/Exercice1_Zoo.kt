// Exercice1_Zoo.kt

abstract class Animal(val nom: String) {
    open val legs: Int = 4
    abstract fun makeSound()
}

class Dog(nom: String) : Animal(nom) {
    override fun makeSound() {
        println("$nom dit Woof !")
    }
}

class Cat(nom: String) : Animal(nom) {
    override fun makeSound() {
        println("$nom dit Miaou !")
    }
}

fun main() {
    val zoo = listOf(Dog("Buddy"), Cat("Whiskers"))
    zoo.forEach { it.makeSound() }
}