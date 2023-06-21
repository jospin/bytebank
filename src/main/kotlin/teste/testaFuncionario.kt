package teste

import modelo.*

fun testaFuncionarios() {
    println("Bem vindo ao Bytebank")
    val sistemaInterno = SistemaInterno()
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )
    println("#########################")
    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salario: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")

    val maria = Analista(nome = "Maria", "444.444.444-44", 1500.0)

    println("#########################")
    println("Nome: ${maria.nome}")
    println("CPF: ${maria.cpf}")
    println("Salario: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao}")

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
        println("Salario: ${fran.salario}")
        println("Bonificação: ${fran.bonificacao}")
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
        println("Salario: ${gui.salario}")
        println("PLR: ${gui.plr}")
        println("Bonificação: ${gui.bonificacao}")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)
    println("_____________________________________")
    println("Total de bonificação ${calculadora.total}")
}