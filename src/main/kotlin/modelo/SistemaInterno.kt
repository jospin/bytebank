package modelo

import modelo.Autenticavel

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha : Int): Boolean {
        if(autenticavel.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            return true
        } else {
            println("Falha na autenticação")
        }
        return false
    }
}