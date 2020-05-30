package br.com.newton.transparente.fragments.ajustes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.newton.transparente.R

class AjustesFragment : Fragment() {

    companion object {
        fun newInstance() = AjustesFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ajustes_fragment, container, false)
    }

}
