package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {

    // https://rickandmortyapi.com/api/
    @GET("character")
    fun getCharacter (): Call<CharacterList>
    // ele ira pegar a url la em cima e ira completar com o character assim fazendo a chamada do endpoint

    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Long):Call<Character>
    // recurso de interpolação - quem chamar esse método terá que fornecer um id

    @GET("character/")
    // query não é um path
    fun getCharactersByPage(@Query("page") pageNumber: Int): Call<CharacterList>
    // a query é anexada ao link principal, então deve ser o mesmo da api

    // quando precisamos de dois argumentos que são strings
    //
    // fun getCepByNumber(@Query("cep") cep: String, @Query("tipo") tipo: String)

    // https://rickandmortyapi.com/api/character/?name=rick&status=alive
    @GET("character/")
    fun getCharacterByNameAndStatus(
        @Query("name") name: String,
        @Query("status") status: String
    ): Call<CharacterList>


}