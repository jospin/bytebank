package br.com.lucienj.bytebank.teste

import br.com.lucienj.bytebank.modelo.ContaCorrente
import br.com.lucienj.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = br.com.lucienj.bytebank.modelo.ContaCorrente(titular = "Alex", numero = 1000)
    val contaPoupanca = br.com.lucienj.bytebank.modelo.ContaPoupanca(titular = "Fran", numero = 1001)
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