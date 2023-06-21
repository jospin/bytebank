package br.com.lucienj.bytebank.modelo

import br.com.lucienj.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(autenticavel: br.com.lucienj.bytebank.modelo.Autenticavel, senha : Int): Boolean {
        if(autenticavel.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            return true
        } else {
            println("Falha na autenticação")
        }
        return false
    }
}