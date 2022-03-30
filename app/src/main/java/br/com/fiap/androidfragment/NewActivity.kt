package br.com.fiap.androidfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.androidfragment.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity(){

    lateinit var binding: ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nome = intent.getStringExtra("EXTRA_NOME")
        val hardcode = intent.getStringExtra("EXTRA_HARDCODE")

        binding.textViewNome.setText("Activity - nome:"+nome+", hardcode:"+hardcode)
    }

}
