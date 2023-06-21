package br.com.lucienj.bytebank.modelo

interface Transferivel {
    fun transfere(value: Double, destino: Conta): Boolean
}