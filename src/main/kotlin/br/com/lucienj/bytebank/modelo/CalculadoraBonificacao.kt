package br.com.lucienj.bytebank.modelo

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: br.com.lucienj.bytebank.modelo.Funcionario) {
        this.total += funcionario.bonificacao
    }
}