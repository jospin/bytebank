package br.com.lucienj.bytebank.modelo

import br.com.lucienj.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : br.com.lucienj.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
)
{

    open fun autentica(senha: Int): Boolean {
        println("Autentica via modelo.Funcionario Admin")
        return this.senha == senha
    }
}