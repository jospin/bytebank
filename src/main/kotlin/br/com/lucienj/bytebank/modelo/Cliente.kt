package br.com.lucienj.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int
) : br.com.lucienj.bytebank.modelo.Autenticavel