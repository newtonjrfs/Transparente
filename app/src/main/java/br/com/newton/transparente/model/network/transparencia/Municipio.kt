package br.com.newton.transparente.model.network.transparencia

data class Municipio(
    val codigoIBGE: String?, // string
    val nomeIBGE: String?, // string
    val nomeIBGEsemAcento: String?, // string
    val pais: String?, // string
    val uf: Uf?
)