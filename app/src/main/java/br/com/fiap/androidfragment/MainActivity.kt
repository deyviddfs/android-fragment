package br.com.fiap.androidfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import br.com.fiap.androidfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //2 Etapa
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ACTIVITY", "onCreate")

        //3 Etapa
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonFragment1.setOnClickListener {
            replaceFragment(FragmentOne())
        }

        binding.buttonFragment2.setOnClickListener {
            replaceFragment(FragmentTwo())
        }

        binding.buttonActivity.setOnClickListener {
            val intent = Intent(this, NewActivity::class.java).apply {
                putExtra("EXTRA_NOME", binding.editText.text.toString())
                putExtra("EXTRA_HARDCODE", "fixo")
            }
            startActivity(intent)
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val bundle = Bundle()
        bundle.putString("EXTRA_NOME", binding.editText.text.toString())
        bundle.putString("EXTRA_HARDCODE", "fixo")
        fragment.arguments = bundle

        fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
        fragmentTransaction.commit()
    }

    override fun onStart() {
        super.onStart()
        Log.i("ACTIVITY", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ACTIVITY", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ACTIVITY", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ACTIVITY", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ACTIVITY", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ACTIVITY", "onRestart")
    }
}