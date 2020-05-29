package br.com.newton.transparente.network

class Interector {

    suspend fun getEstado() = RetrofitInicializerIbge().buscaIbge().buscarEstados()
    suspend fun getCidade(id: Int) = RetrofitInicializerIbge().buscaIbge().buscarCidades(id = id)

}