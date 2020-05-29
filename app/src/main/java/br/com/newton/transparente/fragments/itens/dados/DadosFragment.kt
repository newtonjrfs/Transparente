package br.com.newton.transparente.fragments.itens.dados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.newton.transparente.R
import br.com.newton.transparente.model.view.EstadosView

class DadosFragment : Fragment() {

    companion object {
        fun newInstance() = DadosFragment()
    }

    private lateinit var viewModel: DadosViewModel
    private var identificador: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        identificador = arguments?.getInt("id") ?: 0
        return inflater.inflate(R.layout.dados_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DadosViewModel::class.java)
        viewModel.requisitarEstados()
        viewModel.buscarListaDeEstados().observe(viewLifecycleOwner, Observer { list ->
            val listIbge = ArrayList<EstadosView>()
            list.forEach {
                listIbge.add(EstadosView(it.nome, it.id))
            }
            populationSpinner(listIbge)
        })
    }

    private fun populationSpinner(list: List<EstadosView>) {
        val listname = list.map { it.nome }
    }

}
