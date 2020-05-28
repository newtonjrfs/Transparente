package br.com.newton.transparente.network

import br.com.newton.transparente.model.estados.Estados
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Interector {

    fun getEstado(callback: (Estados?) -> Unit) {
        val call = RetrofitInicializerIbge().buscaIbge().buscarEstados()
        call.enqueue(object : Callback<Estados?> {
            override fun onFailure(call: Call<Estados?>, t: Throwable) {
                callback.invoke(null)
            }

            override fun onResponse(call: Call<Estados?>, response: Response<Estados?>) {
                response.body()?.let { result ->
                    callback.invoke(result)
                }
            }
        })
    }

}