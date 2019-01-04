package com.novadev.calcularcuadradomvp.presenter

interface IAlCuadradoPresenter {

    // el presentador se comunica con el modelo para pedirle el dato para calcular el cuadrado
    fun showResult(resutl: String)
    fun alCuadrado(data: String)
    fun showError(error: String)

}