package br.com.lucienj.bytebank.modelo

abstract class Conta(val titular: String, val numero: Int) {

    var saldo = 0.0
        protected set

    init {
        println("########################")
        println("Inicializa conta")
        println("Titular $titular")
        println("Número $numero")
        println("########################")
    }

    fun deposita(valor: Double) {
        if (valor > 0)
            this.saldo += valor
        else
            println("Apenas valores positivos podem ser depositados")
    }

    abstract fun saca(valor: Double): Boolean

}