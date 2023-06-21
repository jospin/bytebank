package modelo

import modelo.Conta

interface Transferivel {
    fun transfere(value: Double, destino: Conta): Boolean
}