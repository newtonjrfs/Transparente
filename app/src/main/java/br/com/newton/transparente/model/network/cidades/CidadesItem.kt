package br.com.newton.transparente.model.network.cidades

import br.com.newton.transparente.model.view.CidadesView

data class CidadesItem(
    val id: Int?, // 3306305
    val microrregiao: Microrregiao?,
    val nome: String? // Volta Redonda
) {
    fun toView() = CidadesView(id = id ?: 0, nome = nome ?: "Indisponível")
}