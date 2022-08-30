fun main() {
    helloWord()
    println("A soma de a e b é ${sum (3,5)}")
    println("A divisão de a por b é ${divisao(50f,5f)}")
}
fun helloWord() = println("Hello Word!!")

fun sum(a: Int, b: Int) = (a+b)

fun divisao(a:Float, b:Float)= a/b