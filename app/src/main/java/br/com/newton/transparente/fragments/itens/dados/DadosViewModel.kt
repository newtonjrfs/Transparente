package br.com.newton.transparente.fragments.itens.dados

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.newton.transparente.model.network.transparencia.ResponseTransparencia
import br.com.newton.transparente.model.view.CidadesView
import br.com.newton.transparente.model.view.EstadosView
import br.com.newton.transparente.model.view.Transparencia
import br.com.newton.transparente.network.Interector
import kotlinx.coroutines.launch

class DadosViewModel : ViewModel() {

    private val interector by lazy { Interector() }
    private val listEstados = MutableLiveData<List<EstadosView>>()
    private val listCidades = MutableLiveData<List<CidadesView>>()

    fun buscarListaDeEstados(): LiveData<List<EstadosView>> {
        return listEstados
    }

    fun buscarListaDeCidades(): LiveData<List<CidadesView>> {
        return listCidades
    }

    fun requisitarEstados() {
        viewModelScope.launch {
            val estado = interector.getEstado()
            val list = estado.map { it.toView() }
            listEstados.value = list
        }

    }

    fun requisitarCidades(id: Int) {
        viewModelScope.launch {
            val cidades = interector.getCidade(id = id)
            val list = cidades.map { it.toView() }
            listCidades.value = list
        }

    }

    private val request = MutableLiveData<Transparencia>()

    fun buscarRequisicao(): LiveData<Transparencia> {
        return request
    }

    private lateinit var responseTransparencia: ResponseTransparencia

    fun requisitarDados(id: Int, data: Int, codigo: String) {
        viewModelScope.launch {
            when (id) {
                1 -> responseTransparencia =
                    interector.getBpc(date = data, codigo = codigo, pagina = 1)
                2 -> responseTransparencia =
                    interector.getBolsa(date = data, codigo = codigo, pagina = 1)
                3 -> responseTransparencia =
                    interector.getSafra(date = data, codigo = codigo, pagina = 1)
                4 -> responseTransparencia =
                    interector.getPeti(date = data, codigo = codigo, pagina = 1)
            }

            val item = responseTransparencia.firstOrNull()
            if (item == null) {
                request.value = Transparencia(0, 0)
            } else {
                request.value = item.toView()
            }
        }
    }

}
