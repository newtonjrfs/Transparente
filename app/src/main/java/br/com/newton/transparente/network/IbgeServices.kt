package br.com.newton.transparente.network

import br.com.newton.transparente.model.network.cidades.Cidades
import br.com.newton.transparente.model.network.estados.EstadosItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IbgeServices {

    @GET("estados")
    suspend fun buscarEstados(): List<EstadosItem>

    @GET("estados/{id}/municipios")
    fun buscarCidades(@Path("id") id: String): Call<Cidades>
}