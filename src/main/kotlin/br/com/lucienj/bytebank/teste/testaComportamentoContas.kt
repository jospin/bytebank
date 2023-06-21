package br.com.lucienj.bytebank.teste

import br.com.lucienj.bytebank.modelo.Cliente
import br.com.lucienj.bytebank.modelo.*

fun testaComportamentoContas() {
    val clienteFran = Cliente(nome = "Fran", cpf = "111.111.111-11", 1)
    val contaFran = ContaCorrente(titular = clienteFran, numero = 1111)
    contaFran.deposita(valor = 1000.0)

    printa(contaFran)
    val clientAlex = Cliente(nome = "Alex", cpf = "222.222.222-22", 2)
    val contaAlex = ContaPoupanca(titular = clientAlex, numero = 2222)
    contaAlex.deposita(valor = 400.0)

    printa(contaAlex)
    val clientLucien = Cliente(nome = "Lucien", cpf = "333.333.333-33", 3)
    val contaLucien = ContaSalario(titular = clientLucien, numero = 3333)
    contaLucien.deposita(valor = 2000.0)
    printa(contaLucien)

    contaFran.saca(valor = 50.0)
    printa(contaFran)

    contaAlex.saca(valor = 400.0)
    printa(contaAlex)

    println("###############################")
    println("TRANSFERENCIA")
    contaFran.transfere(destino = contaAlex, value = 50.0)
    println("###############################")

    printa(contaFran)
    printa(contaAlex)

    println("###############################")
    println("TRANSFERENCIA")
    contaFran.transfere(destino = contaLucien, value = 50.0)
    println("###############################")

    printa(contaLucien)


}