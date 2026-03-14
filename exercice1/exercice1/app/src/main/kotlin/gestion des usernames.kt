// UserInfo.kt  ← nom de fichier propre

package com.example.userinfo   // ← package valide

data class User(val name: String, val email: String?)

fun main() {
    val users = listOf(
        User("Ebeng", "ebeng@example.com"),
        User("Etaba", null),
        User("Anck", "anck@work.com")
    )

    println("Emails en majuscules :")
    users.forEach { user ->
        user.email?.let { println(it.uppercase()) }
    }

    println("\nUtilisateurs sans email :")
    users.forEach { user ->
        if (user.email == null) {
            println("${user.name} has no email")
        }
    }

    val count = users.count { it.email != null }
    println("\n$count users have valid emails")
}