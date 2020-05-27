package br.com.newton.transparente.fragments.ajustes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.newton.transparente.R

class AjustesFragment : Fragment() {

    companion object {
        fun newInstance() = AjustesFragment()
    }

    private lateinit var viewModel: AjustesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ajustes_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AjustesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
