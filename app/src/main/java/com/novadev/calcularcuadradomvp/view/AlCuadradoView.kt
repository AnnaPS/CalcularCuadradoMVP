package com.novadev.calcularcuadradomvp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.novadev.calcularcuadradomvp.R
import com.novadev.calcularcuadradomvp.presenter.AlCuadradorPresenter
import com.novadev.calcularcuadradomvp.presenter.IAlCuadradoPresenter
import kotlinx.android.synthetic.main.activity_main.*


class AlCuadradoView : AppCompatActivity(), IAlCuadradoView {


    lateinit var mPresenter: IAlCuadradoPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = AlCuadradorPresenter(this)
        button.setOnClickListener { calcular() }
    }


    private fun calcular() {
        mPresenter.alCuadrado(editTextNumero.text.toString())
    }

    //Muestra el texto que reciba
    override fun showResult(result: String) {

        textViewResult.text = result
        editTextNumero.text.clear()
    }
    //Muestra error en caso de que el resultado sea null
    override fun showError(error: String) {
        textViewResult.text = error
        editTextNumero.text.clear()
    }
}
