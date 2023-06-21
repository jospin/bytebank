package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(titular = "Alex", numero = 1000)
    val contaPoupanca = ContaPoupanca(titular = "Fran", numero = 1001)
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