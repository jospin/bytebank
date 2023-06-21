package br.com.lucienj.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : br.com.lucienj.bytebank.modelo.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), br.com.lucienj.bytebank.modelo.Autenticavel {

    override val bonificacao: Double
        get() {
            return salario * 0.2 + plr
        }

    override fun autentica(senha: Int): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }

}