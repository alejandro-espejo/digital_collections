package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    // setOf - irá retornar um conjunto somente de leitura
    val funcionario1 = setOf(joao,pedro)
    val funcionario2 = setOf(maria)

    //union - Irá juntar todos os elementos das duas coleções
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{ println(it)}

    println("----------")
    val funcionario3 = setOf(joao, pedro, maria)
    // subtract - Retorna uma subtração da coleção - nesse, irá retirar do fun3 a maria
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach{ println(it)}

    println("----------")
    // intersect - Retorna o que há de comum entre os conjuntos
    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach{ println(it)}
}