package br.senai.sp.jandira.rickandmorty.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// conexao - devemos criar um server para cada classe
class RetrofitFactory {

    private val BASE_URL = "https://rickandmortyapi.com/api/"
    // em caso de haver mais de uma url base, devemos ter duas bases e dois retrofitFactory

    // converte o objeto em json e converte o json em objeto - responsavel pela fabrica
    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getCharacterService(): CharacterService {
        return retrofitFactory.create(CharacterService::class.java)
    }

}