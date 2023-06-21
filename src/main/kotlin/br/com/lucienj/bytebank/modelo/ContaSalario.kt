package br.com.lucienj.bytebank.modelo

class ContaSalario(titular: String, numero: Int) : br.com.lucienj.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
) {

    override fun saca(valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        } else {
            println("#ERRO# Não tem saldo para realizar o saque")
        }
        return false

    }

}