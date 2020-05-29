package br.com.newton.transparente.fragments.itens.dados

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.newton.transparente.model.view.EstadosView
import br.com.newton.transparente.network.Interector
import kotlinx.coroutines.launch

class DadosViewModel : ViewModel() {

    private val interector by lazy { Interector() }
    private val listEstados = MutableLiveData<List<EstadosView>>()

    fun buscarListaDeEstados(): LiveData<List<EstadosView>> {
        return listEstados
    }

    fun requisitarEstados() {
        viewModelScope.launch {
            val estado = interector.getEstado()
            val list = estado.map { it.toView() }
            listEstados.value = list
        }

    }

}
