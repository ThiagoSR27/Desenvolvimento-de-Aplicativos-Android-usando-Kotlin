fun main() {
    val str = "Programação Kotlin"

    println("O tamanho da string é ${str.length}")
    println("Posição(index) 0 da string ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))

    println(str.substring(2,4))
    println(str.replace("Kotlin", "Kotlin é show"))
    println(str.lowercase())
    println(str.uppercase())

    "               meu nome é              ".trim()
}