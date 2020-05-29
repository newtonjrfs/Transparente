package br.com.newton.transparente.model.network.estados

import br.com.newton.transparente.model.view.EstadosView

data class EstadosItem(
    val id: Int?, // 53
    val nome: String?, // Distrito Federal
    val regiao: Regiao?,
    val sigla: String? // DF
) {
    fun toView() = EstadosView(nome = nome ?: "Indisponivel", id = id ?: 0)
}