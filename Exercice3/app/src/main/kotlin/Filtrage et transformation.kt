fun main() {
    val numbers: List<Int?> = listOf(1, null, 3, null, 5, 6, null, 8)

    // Version one-liner (le défi)
    val sumDoubled = numbers
        .filterNotNull()           // enlève les null
        .map { it * 2 }            // double chaque valeur
        .sum()                     // somme tout

    println("Somme des valeurs doublées (sans null) : $sumDoubled")

    // Pour vérifier étape par étape (facultatif)
    println("Valeurs non nulles     : ${numbers.filterNotNull()}")
    println("Valeurs doublées       : ${numbers.filterNotNull().map { it * 2 }}")
}