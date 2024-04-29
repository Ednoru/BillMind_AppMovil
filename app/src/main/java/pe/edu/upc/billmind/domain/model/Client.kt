package pe.edu.upc.billmind.domain.model

data class Client (
    val id: Int,
    val firstName: String,
    val lastName: String,
    val mail: String,
    val phone: String,
    val password: String
)