package br.com.lucienj.bytebank.teste

import br.com.lucienj.bytebank.modelo.novomodelo.Cliente as NovoCliente

fun testaAmbiguidadePacote() {

    val cliente = br.com.lucienj.bytebank.modelo.Cliente(nome = "Alex", cpf = "", senha = 1)
    val novoCliente = NovoCliente()

    println("Funcionou com alias")

}