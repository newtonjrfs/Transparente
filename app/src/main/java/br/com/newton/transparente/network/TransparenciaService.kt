package br.com.newton.transparente.network

import br.com.newton.transparente.model.network.transparencia.ResponseTransparencia
import retrofit2.http.GET
import retrofit2.http.Query

interface TransparenciaService {

    @GET("/api-de-dados/bpc-por-municipio")
    suspend fun buscarBpc(
        @Query("mesAno") date: Int,
        @Query("codigoIbge") codigo: String,
        @Query("pagina") pagina: Int
    ): ResponseTransparencia

    @GET("/api-de-dados/bolsa-familia-por-municipio")
    suspend fun buscarBolsa(
        @Query("mesAno") date: Int,
        @Query("codigoIbge") codigo: String,
        @Query("pagina") pagina: Int
    ): ResponseTransparencia

    @GET("/api-de-dados/safra-por-municipio")
    suspend fun buscarSafra(
        @Query("mesAno") date: Int,
        @Query("codigoIbge") codigo: String,
        @Query("pagina") pagina: Int
    ): ResponseTransparencia

    @GET("/api-de-dados/peti-por-municipio")
    suspend fun buscarPeti(
        @Query("mesAno") date: Int,
        @Query("codigoIbge") codigo: String,
        @Query("pagina") pagina: Int
    ): ResponseTransparencia


}