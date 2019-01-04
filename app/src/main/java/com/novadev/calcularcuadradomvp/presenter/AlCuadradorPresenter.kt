package com.novadev.calcularcuadradomvp.presenter

import com.novadev.calcularcuadradomvp.model.AlCuadradoModel
import com.novadev.calcularcuadradomvp.view.IAlCuadradoView

class AlCuadradorPresenter(iView: IAlCuadradoView) : IAlCuadradoPresenter{

    // El presentador se comunica con el modelo y con la vista, necesitamos instancias de ambas interfaces
    val mView: IAlCuadradoView = iView
    val model = AlCuadradoModel(this)

    // metodo que muestra el resultado. La vista mostrará ese resultado.
    override fun showResult(resutl: String) {
        mView?.showResult(resutl)
    }

    // Metodo que es llamado desde el model para realizar las operaciones
    override fun alCuadrado(data: String) {
       if(mView!=null)
         model.alCuadrado(data)
    }
    override fun showError(error: String) {
        mView?.showResult(error)
    }
}