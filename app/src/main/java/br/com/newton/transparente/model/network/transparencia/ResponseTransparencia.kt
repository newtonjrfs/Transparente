package br.com.newton.transparente.model.network.transparencia

data class ResponseTransparencia(
    val dataReferencia: String?, // 2020-05-29
    val id: Int?, // 0
    val municipio: Municipio?,
    val quantidadeBeneficiados: Int?, // 0
    val tipo: Tipo?,
    val valor: Int? // 0
)