package com.novadev.calcularcuadradomvp.view

interface IAlCuadradoView {

    //cuando se envie el dato a calcular la vista mostrará el resultado
    fun showResult(result: String)
    fun showError(error: String)
}