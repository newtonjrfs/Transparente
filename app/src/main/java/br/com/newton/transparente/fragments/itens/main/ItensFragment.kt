package br.com.newton.transparente.fragments.itens.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.newton.transparente.R
import kotlinx.android.synthetic.main.itens_fragment.*

class ItensFragment : Fragment() {

    companion object {
        fun newInstance() =
            ItensFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.itens_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        buttonConsultar.setOnClickListener {
            findNavController().navigate(R.id.action_itensFragment_to_detalheFragment)
        }
    }


}
