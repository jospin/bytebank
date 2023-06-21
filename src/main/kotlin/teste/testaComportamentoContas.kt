package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca
import modelo.ContaSalario

fun testaComportamentoContas() {
    val contaFran = ContaCorrente(titular = "Fran", numero = 4410)
    contaFran.deposita(valor = 1000.0)

    printa(contaFran)

    val contaAlex = ContaPoupanca(titular = "Alex", numero = 4411)
    contaAlex.deposita(valor = 400.0)

    printa(contaAlex)

    val contaLucien = ContaSalario(titular = "Lucien", numero = 4412)
    contaLucien.deposita(valor = 2000.0)
    printa(contaLucien)

    contaFran.saca(valor = 50.0);
    printa(contaFran)

    contaAlex.saca(valor = 400.0);
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