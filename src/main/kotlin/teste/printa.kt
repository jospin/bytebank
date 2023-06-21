package teste

import modelo.Conta

fun printa(conta: Conta) {

    println("################################################")
    println("Titular ${conta.titular}")
    println("Número da conta ${conta.numero}")

    testaCondicoes(conta.saldo)

    println("################################################")
    println()

}