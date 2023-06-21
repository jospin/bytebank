package br.com.lucienj.bytebank.teste

import br.com.lucienj.bytebank.modelo.Cliente
import br.com.lucienj.bytebank.modelo.ContaCorrente
import br.com.lucienj.bytebank.modelo.ContaPoupanca


fun testaContasDiferentes() {
    val clientAlex = Cliente(nome = "Alex", cpf = "222.222.222-22", 2)
    val contaCorrente = ContaCorrente(titular = clientAlex, numero = 2222)
    val clienteFran = Cliente(nome = "Fran", cpf = "111.111.111-11", 1)
    val contaPoupanca = ContaPoupanca(titular = clienteFran, numero = 1111)
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente:  ${contaCorrente.saldo}")
    println("saldo poupnança:  ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque:  ${contaCorrente.saldo}")
    println("saldo poupnança após saque:  ${contaPoupanca.saldo}")

    contaPoupanca.transfere(value = 150.0, destino = contaCorrente)
    contaCorrente.transfere(value = 50.0, destino = contaPoupanca)

    println("saldo corrente após transferência:  ${contaCorrente.saldo}")
    println("saldo poupnança após transferência:  ${contaPoupanca.saldo}")
}