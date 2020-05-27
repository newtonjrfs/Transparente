package br.com.newton.transparente.fragments.itens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.newton.transparente.R

class ItensFragment : Fragment() {

    companion object {
        fun newInstance() =
            ItensFragment()
    }

    private lateinit var viewModel: ItensViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.itens_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ItensViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
