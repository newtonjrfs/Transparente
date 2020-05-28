package br.com.newton.transparente.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInicializerIbge {

    private val BASE_URL = "https://servicodados.ibge.gov.br/api/v1/localidades/"

    private val retrofitIbge = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun buscaIbge() = retrofitIbge.create(IbgeServices::class.java)
}