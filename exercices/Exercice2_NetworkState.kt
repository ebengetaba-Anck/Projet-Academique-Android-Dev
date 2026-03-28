// Exercice2_NetworkState.kt

sealed class NetworkState {
    object Loading : NetworkState()
    data class Success(val data: String) : NetworkState()
    data class Error(val message: String) : NetworkState()
}

fun handleState(state: NetworkState) {
    when (state) {
        is NetworkState.Loading -> println("Chargement en cours...")
        is NetworkState.Success -> println("Données reçues : ${state.data}")
        is NetworkState.Error   -> println("Erreur : ${state.message}")
    }
}

fun main() {
    val states = listOf(
        NetworkState.Loading,
        NetworkState.Success("Données utilisateur chargées"),
        NetworkState.Error("Délai d'attente réseau")
    )
    states.forEach { handleState(it) }
}