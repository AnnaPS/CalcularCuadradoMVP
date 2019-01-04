package com.novadev.calcularcuadradomvp.model

import com.novadev.calcularcuadradomvp.presenter.AlCuadradorPresenter

class AlCuadradoModel(presenter: AlCuadradorPresenter): IAlcuadradoModel {
    // instancia del presentador
    val mPresenter: AlCuadradorPresenter = presenter
    var resultado: Double = 0.0


    override fun alCuadrado(data: String) {
        if(data == ""){
        mPresenter.showError("Campo Vacio")
        }else{
            resultado = data.toDouble() * data.toDouble()
            // utilizamos el metodo del presenter para enviarle el resultado
            mPresenter.showResult(resultado.toString())
        }

    }

}