package br.com.fiap.androidfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.fiap.androidfragment.databinding.FragmentTwoBinding

class FragmentTwo: Fragment(R.layout.fragment_two) {
    lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        val view = binding.root

        //Recuperação dos parâmetros - Início
        val bundle = this.arguments

        if (bundle!=null) {
            val nome = bundle.getString("EXTRA_NOME")
            val hardcode = bundle.getString("EXTRA_HARDCODE")
            binding.textViewNome.setText("Fragment 2 - nome: "+nome+", hardcode:"+hardcode)
        }
        //Recuperação dos parâmetros - Fim

        return view
    }
}