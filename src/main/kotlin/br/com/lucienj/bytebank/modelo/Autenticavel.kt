package br.com.lucienj.bytebank.modelo

interface Autenticavel {
    val senha: Int

    fun autentica(senha: Int): Boolean {
        println("Autentica via Interface")
        return this.senha == senha
    }
}