package br.com.lucienj.bytebank.teste

import br.com.lucienj.bytebank.modelo.Conta

fun printa(conta: Conta) {

    println("################################################")
    println("Titular ${conta.titular.nome}")
    println("Número da conta ${conta.numero}")

    testaCondicoes(conta.saldo)

    println("################################################")
    println()

}