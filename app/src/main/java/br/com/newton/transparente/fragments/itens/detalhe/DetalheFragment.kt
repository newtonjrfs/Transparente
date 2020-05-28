package br.com.newton.transparente.fragments.itens.detalhe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import br.com.newton.transparente.R
import kotlinx.android.synthetic.main.detalhe_fragment.*

class DetalheFragment : Fragment() {

    companion object {
        fun newInstance() = DetalheFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.detalhe_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val args = Bundle()

        buttonBPC.setOnClickListener {
            args.putInt("id", 1)
            findNavController().navigate(R.id.action_detalheFragment_to_dadosFragment, args)
        }
        buttonBolsaFamilia.setOnClickListener {
            args.putInt("id", 2)
            findNavController().navigate(R.id.action_detalheFragment_to_dadosFragment, args)
        }
        buttonSafra.setOnClickListener {
            args.putInt("id", 3)
            findNavController().navigate(R.id.action_detalheFragment_to_dadosFragment, args)
        }
        buttonPeti.setOnClickListener {
            args.putInt("id", 4)
            findNavController().navigate(R.id.action_detalheFragment_to_dadosFragment, args)
        }
    }

}
