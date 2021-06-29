package one.digitalinnovation.collections

fun main() {
    // Exemplo de declaração de array do tipo double
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach {
        println(it)
    }

    // ForEach indexado, a variavel index seria o 'i' no for, assim pode ser atribuidos outros valores no vetor corretamente
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    println("")
    salarios.forEach {
        println(it)
    }

    // o doubleArrayOf, vc já inicializa os valores do array e pode incrementar outros valores
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    println("")
    println("")
    salarios2.forEach {
        println(it)
    }
}