package br.com.newton.transparente.network

import br.com.newton.transparente.model.cidades.Cidades
import br.com.newton.transparente.model.estados.Estados
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IbgeServices {

    @GET("estados")
    fun buscarEstados(): Call<Estados>

    @GET("estados/{id}/municipios")
    fun buscarCidades(@Path("id") id: String): Call<Cidades>
}