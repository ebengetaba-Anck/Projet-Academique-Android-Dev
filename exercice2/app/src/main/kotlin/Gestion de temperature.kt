fun describeTemperature(temp: Int?): String = when {
    temp == null          -> "No data"
    temp <= 0             -> "Freezing"
    temp in 1..15         -> "Cold"
    temp in 16..25        -> "Mild"
    temp in 26..35        -> "Warm"
    temp in 36..45        -> "Hot"
    else                  -> "Extreme"   // > 45
}

fun main() {
    // Bonus : liste avec nulls + boucle
    val temperatures: List<Int?> = listOf(-5, 10, null, 20, 30, 40, 50, 18, null)

    println("Descriptions des températures :")
    temperatures.forEach { temp ->
        val description = describeTemperature(temp)
        println("Température ${temp ?: "inconnue"} → $description")
    }
}