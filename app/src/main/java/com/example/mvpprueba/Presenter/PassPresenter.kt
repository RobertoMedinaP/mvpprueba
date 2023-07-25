package com.example.mvpprueba.Presenter

import com.example.mvpprueba.Model.PassModel

class PassPresenter: IviewPresenter {

    private val model: PassModel=PassModel()
    private lateinit var view: IviewPresenter

    fun view(view: IviewPresenter){
        this.view=view
    }



    override fun setpassword(password: String) {
        model.setpassword(password)
        view.setpassword(password)
    }

    override fun letraspassword(): String {
        return letraspassword()
    }

    override fun colorpassword(color: String) {
        val color=model.colorpassword()
        view.colorpassword(color)
    }
}