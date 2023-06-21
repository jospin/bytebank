package br.com.lucienj.bytebank.teste

import br.com.lucienj.bytebank.modelo.ContaCorrente
import br.com.lucienj.bytebank.modelo.ContaPoupanca
import br.com.lucienj.bytebank.modelo.ContaSalario

fun testaComportamentoContas() {
    val contaFran = br.com.lucienj.bytebank.modelo.ContaCorrente(titular = "Fran", numero = 4410)
    contaFran.deposita(valor = 1000.0)

    br.com.lucienj.bytebank.teste.printa(contaFran)

    val contaAlex = br.com.lucienj.bytebank.modelo.ContaPoupanca(titular = "Alex", numero = 4411)
    contaAlex.deposita(valor = 400.0)

    br.com.lucienj.bytebank.teste.printa(contaAlex)

    val contaLucien = br.com.lucienj.bytebank.modelo.ContaSalario(titular = "Lucien", numero = 4412)
    contaLucien.deposita(valor = 2000.0)
    br.com.lucienj.bytebank.teste.printa(contaLucien)

    contaFran.saca(valor = 50.0);
    br.com.lucienj.bytebank.teste.printa(contaFran)

    contaAlex.saca(valor = 400.0);
    br.com.lucienj.bytebank.teste.printa(contaAlex)

    println("###############################")
    println("TRANSFERENCIA")
    contaFran.transfere(destino = contaAlex, value = 50.0)
    println("###############################")

    br.com.lucienj.bytebank.teste.printa(contaFran)
    br.com.lucienj.bytebank.teste.printa(contaAlex)

    println("###############################")
    println("TRANSFERENCIA")
    contaFran.transfere(destino = contaLucien, value = 50.0)
    println("###############################")

    br.com.lucienj.bytebank.teste.printa(contaLucien)


}