package com.example.mvpprueba

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvpprueba.Presenter.IviewPresenter
import com.example.mvpprueba.Presenter.PassPresenter
import com.example.mvpprueba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), IviewPresenter {

    private lateinit var binding: ActivityMainBinding
    private lateinit var presenter: PassPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter= PassPresenter()
        presenter.view(this)


    }

    override fun setpassword(password: String) {
        presenter.setpassword(binding.textInputLayout.editText?.text.toString())
    }

    override fun letraspassword(): String {
        return presenter.letraspassword()
    }

    override fun colorpassword(color: String) {
        binding.textView3.setBackgroundColor(Color.parseColor(color))
    }
}