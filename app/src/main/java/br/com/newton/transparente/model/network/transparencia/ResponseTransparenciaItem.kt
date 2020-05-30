package br.com.newton.transparente.model.network.transparencia

import br.com.newton.transparente.model.view.Transparencia

data class ResponseTransparenciaItem(
    val dataReferencia: String?, // 2020-05-29
    val id: Int?, // 0
    val municipio: Municipio?,
    val quantidadeBeneficiados: Int?, // 0
    val tipo: Tipo?,
    val valor: Int? // 0
) {
    fun toView() = Transparencia(valor = valor ?: 0, quantidade = quantidadeBeneficiados ?: 0)
}