package one.digitalinnovation.collections

fun main() {
    // ArrayOf com esse tipo vc não precisa definir o tamanho na declaração e pode aumentar o tamanho do array
    val values = intArrayOf(2,3,4,1,10,7)

    values.forEach {
        println(it)
    }

    println("")

    values.sort()
    values.forEach {
        println(it)
    }
}