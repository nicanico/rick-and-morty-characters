package br.senai.sp.jandira.rickandmorty.model

data class Character(
    val id: Long,
    val name: String,
    val status: String,
    val species: String,
    val image: String,
    // caso seja um objeto no json, ela tambem deve ser um objeto aqui
    val location: Location
)
