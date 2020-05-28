package br.com.newton.transparente.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInicializerTransparencia {
    private val BASE_URL = "http://www.transparencia.gov.br/api-de-dados"

    private val retrofitTransparencia = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}