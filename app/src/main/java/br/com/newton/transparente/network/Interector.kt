package br.com.newton.transparente.network

class Interector {

    suspend fun getEstado() = RetrofitInicializerIbge().buscaIbge().buscarEstados()

}