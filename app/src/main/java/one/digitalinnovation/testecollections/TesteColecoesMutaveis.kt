package one.digitalinnovation.testecollections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "CLT")
    val maria = Funcionario("Maria", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("-----------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("-----------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }
}