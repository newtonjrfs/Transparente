package br.com.newton.transparente.fragments.itens.detalhe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import br.com.newton.transparente.R

class DetalheFragment : Fragment() {

    companion object {
        fun newInstance() = DetalheFragment()
    }

    private lateinit var viewModel: DetalheViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detalhe_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetalheViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
