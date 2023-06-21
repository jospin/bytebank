package br.com.lucienj.bytebank.modelo

import br.com.lucienj.bytebank.modelo.Conta

interface Transferivel {
    fun transfere(value: Double, destino: br.com.lucienj.bytebank.modelo.Conta): Boolean
}