package one.digitalinnovation.collections

fun main() {
    // Precisa informar o tamanho do Array de Int
    val values = IntArray(5)

    values[0] = 1
    values[1] = 9
    values[2] = 3
    values[3] = 6
    values[4] = 0

    for (valor in values) {
        println(valor)
    }

    println("")
    println("")

    // FOREACH - expressão lambda
    values.forEach {
        // O it seria a variavel que vai receber cada valor do array a cada interação
        println(it)
    }
    println("")
    println("")

    // Interação sobre o indice
    for (valor in values.indices) {
        println(values[valor])
    }

    println("")
    println("")
    // SORT() Ordena o array em Ordem Crescente
    values.sort()
    for (valor in values) {
        println(valor)
    }
}