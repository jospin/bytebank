package br.com.lucienj.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : br.com.lucienj.bytebank.modelo.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), br.com.lucienj.bytebank.modelo.Autenticavel {

    override val bonificacao: Double
        get() {
            return salario
        }

    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }
}