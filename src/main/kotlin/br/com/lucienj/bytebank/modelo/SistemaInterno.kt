package br.com.lucienj.bytebank.modelo

class SistemaInterno {

    fun entra(autenticavel: Autenticavel, senha: Int): Boolean {
        if (autenticavel.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            return true
        } else {
            println("Falha na autenticação")
        }
        return false
    }
}