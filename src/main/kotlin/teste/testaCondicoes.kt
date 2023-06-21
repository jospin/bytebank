package teste

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("modelo.Conta positiva")
    } else if (saldo == 0.0) {
        println("modelo.Conta neutra")
    } else {
        println("modelo.Conta negatva")
    }

    when {
        saldo > 0.0 -> println("modelo.Conta positiva: $saldo")
        saldo == 0.0 -> println("modelo.Conta neutra: $saldo")
        else -> println("modelo.Conta negatva: $saldo")
    }
}
