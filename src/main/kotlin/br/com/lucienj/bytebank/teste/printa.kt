package br.com.lucienj.bytebank.teste

import br.com.lucienj.bytebank.modelo.Conta

fun printa(conta: br.com.lucienj.bytebank.modelo.Conta) {

    println("################################################")
    println("Titular ${conta.titular}")
    println("Número da conta ${conta.numero}")

    br.com.lucienj.bytebank.teste.testaCondicoes(conta.saldo)

    println("################################################")
    println()

}