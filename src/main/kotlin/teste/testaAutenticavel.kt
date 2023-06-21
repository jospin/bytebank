package teste

import modelo.Cliente
import modelo.Diretor
import modelo.Gerente
import modelo.SistemaInterno

fun testaAutenticavel() {

    val sistemaInterno = SistemaInterno()
    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 123
    )

    println("#########################")
    if (sistemaInterno.entra(fran, senha = 1234)) {

        println("Nome: ${fran.nome}")
        println("CPF: ${fran.cpf}")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("#########################")
    if (sistemaInterno.entra(gui, senha = 4000)) {
        println("Nome: ${gui.nome}")
        println("CPF: ${gui.cpf}")
    }

    val lucien = Cliente(
        nome = "Lucien",
        cpf = "333.333.333-33",
        123456
    )
    println("#########################")
    if (sistemaInterno.entra(lucien, senha = 123456)) {
        println("Nome: ${lucien.nome}")
        println("CPF: ${lucien.cpf}")
    }
}