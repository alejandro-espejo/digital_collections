package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    // Um List de objeto Funcionario
    val funcionarios = listOf(joao, pedro, maria)

    // Esse it é o funcionário, ira retornar o nome e salario dos funcionarios
    funcionarios.forEach {
        println(it)
    }
    println("----------")
    // Exibir somente os dados da Maria
    println(funcionarios.find { it.nome == "Maria" })


    println("----------")
    // Nesse exemplo iremos ordenar as informações pelo salário em ordem crescente com o sortedBy
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("----------")
    // Irá agrupar dos dados de acordo com o que vc solicitar, onde esse irá virá chave e colocar os valores dentro de listas
    // nesse exemplo, a chave será a var tipoContracacao e as outras informações irão para listas desses tipos de Contratacao
    funcionarios
        .groupBy{ it.tipoContracacao }
        .forEach { println(it) }

}