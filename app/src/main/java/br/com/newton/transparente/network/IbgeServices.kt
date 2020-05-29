package br.com.newton.transparente.network

import br.com.newton.transparente.model.network.cidades.CidadesItem
import br.com.newton.transparente.model.network.estados.EstadosItem
import retrofit2.http.GET
import retrofit2.http.Path

interface IbgeServices {

    @GET("estados")
    suspend fun buscarEstados(): List<EstadosItem>

    @GET("estados/{id}/municipios")
    suspend fun buscarCidades(@Path("id") id: Int): List<CidadesItem>
}