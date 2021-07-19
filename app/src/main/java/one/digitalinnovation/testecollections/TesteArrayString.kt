package one.digitalinnovation.testecollections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Carla"
    nomes[2] = "José"

    for (nome in nomes){ println(nome) }
    println("-----------")
    nomes.sort()
    nomes.forEach { println(it) }
    println("-----------")
    val nomes2 = arrayOf("Vinicius", "Isabela", "Carlos")
    nomes2.sort()
    nomes2.forEach { println(it) }
}