package br.com.newton.transparente.network

class Interector {

    suspend fun getEstado() = RetrofitInicializerIbge().buscaIbge().buscarEstados()
    suspend fun getCidade(id: Int) = RetrofitInicializerIbge().buscaIbge().buscarCidades(id = id)

    suspend fun getBpc(date: Int, codigo: String, pagina: Int) =
        RetrofitInicializerTransparencia().buscaTransparencia()
            .buscarBpc(date = date, codigo = codigo, pagina = pagina)

    suspend fun getBolsa(date: Int, codigo: String, pagina: Int) =
        RetrofitInicializerTransparencia().buscaTransparencia()
            .buscarBolsa(date = date, codigo = codigo, pagina = pagina)

    suspend fun getSafra(date: Int, codigo: String, pagina: Int) =
        RetrofitInicializerTransparencia().buscaTransparencia()
            .buscarSafra(date = date, codigo = codigo, pagina = pagina)

    suspend fun getPeti(date: Int, codigo: String, pagina: Int) =
        RetrofitInicializerTransparencia().buscaTransparencia()
            .buscarPeti(date = date, codigo = codigo, pagina = pagina)

}