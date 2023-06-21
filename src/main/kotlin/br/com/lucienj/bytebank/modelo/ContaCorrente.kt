package br.com.lucienj.bytebank.modelo

class ContaCorrente(titular: String, numero: Int) : br.com.lucienj.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
), br.com.lucienj.bytebank.modelo.Transferivel {
    override fun saca(valor: Double): Boolean {
        val valorComTaxa = valor + valor * 0.1
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true
        } else {
            println("#ERRO# Não tem saldo para realizar o saque")
        }
        return false
    }


    override fun transfere(value: Double, destino: br.com.lucienj.bytebank.modelo.Conta): Boolean {
        if (saca(value)) {
            destino.deposita(value)
            return true;
        }
        return false
    }
}