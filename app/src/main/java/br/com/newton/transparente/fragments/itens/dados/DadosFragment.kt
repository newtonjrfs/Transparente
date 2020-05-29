package br.com.newton.transparente.fragments.itens.dados

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.newton.transparente.R
import br.com.newton.transparente.model.view.CidadesView
import br.com.newton.transparente.model.view.EstadosView
import br.com.newton.transparente.utils.handleDate
import kotlinx.android.synthetic.main.dados_fragment.*

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
        editDate.handleDate()
        viewModel = ViewModelProvider(this).get(DadosViewModel::class.java)
        viewModel.requisitarEstados()
        viewModel.buscarListaDeEstados().observe(viewLifecycleOwner, Observer { list ->
            populationSpinnerEstados(list)
        })
        viewModel.buscarListaDeCidades().observe(viewLifecycleOwner, Observer { list ->
            populationSpinnerCidades(list)
        })
        button.setOnClickListener {
            if (editDate.text.toString().length == 7) {
                buscarDados()
            } else {
                editDate.error = getString(R.string.campo_invalido)
            }
        }
    }

    private fun buscarDados() {

    }

    private fun populationSpinnerCidades(list: List<CidadesView>) {
        val listname = list.map { it.nome }
        val listSpinner =
            ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, listname)
        listSpinner.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        spinnerCidades.adapter = listSpinner
    }

    private fun populationSpinnerEstados(list: List<EstadosView>) {
        val listname = list.map { it.nome }
        val listSpinner =
            ArrayAdapter(requireContext(), R.layout.support_simple_spinner_dropdown_item, listname)
        listSpinner.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        spinnerEstados.adapter = listSpinner

        spinnerEstados.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                    viewModel.requisitarCidades(list[position].id)
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    viewModel.requisitarCidades(list[0].id)
                }
            }
    }

}
