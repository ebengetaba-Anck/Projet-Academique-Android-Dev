fun <T : Comparable<T>> maxOf(list: List<T>): T? {
    if (list.isEmpty()) return null

    // Utilisation de fold (scope function implicite via extension)
    return list.fold(list[0]) { currentMax, item ->
        if (item > currentMax) item else currentMax
    }
}

fun main() {
    println(maxOf(listOf(3, 7, 2, 9)))                    // 9
    println(maxOf(listOf("apple", "banana", "kiwi")))     // kiwi
    println(maxOf(emptyList<Int>()))                      // null
}