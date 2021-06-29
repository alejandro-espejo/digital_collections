package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("")
    // Retorna o maior valor no array salario
    println("Maior salario: ${salarios.maxOrNull()}")

    // Retorna o menor valor no array salario
    println("Menor salario: ${salarios.minOrNull()}")

    // Retorna a média
    println("Media salario: ${salarios.average()}")

    println("")
    // Irá colocar na nova variavel todos os valores maiores que 2500
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    salariosMaiorQue2500.forEach { println(it) }

    println("")
    // Ira retornar a quantidade de elementos entre 2000 e 5000, que, seria 2
    println(salarios.count {it in 2000.0..5000.0})

    println("")
    // Ira retornar a quantidade de valor especifico, nesse, seria 1
    println(salarios.count {it == 2250.0})

    println("")
    // Ira retornar o valor dentro do array, caso não tenha, irá retornar, null
    println(salarios.find {it == 2250.0})

    println("")
    // Ira retornar o valor true or false depedendendo se a condição for verdadeira ou falsa
    println(salarios.any {it == 1000.0})
    println(salarios.any {it == 1100.0})


}