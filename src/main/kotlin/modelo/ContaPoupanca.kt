package modelo

class ContaPoupanca(titular: String, numero: Int) : Conta(
    titular = titular,
    numero = numero
), Transferivel {

    override fun saca(valor: Double): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            return true
        } else {
            println("#ERRO# Não tem saldo para realizar o saque")
        }
        return false

    }

    override fun transfere(value: Double, destino: Conta): Boolean {
        if (saca(value)) {
            destino.deposita(value)
            return true
        }
        return false
    }
}