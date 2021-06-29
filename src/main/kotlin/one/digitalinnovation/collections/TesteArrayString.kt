package one.digitalinnovation.collections

fun main(){
    // Forma de declarar um array de String
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("")

    // O Sort irá ordenar em ordem Alfabética
    nomes.sort()
    for (nome in nomes) {
        println(nome)
    }

    // Forma resumida de declarar array de String
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")


}