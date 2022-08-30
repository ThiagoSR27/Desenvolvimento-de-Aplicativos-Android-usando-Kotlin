fun main() {
    amdhminseg(2)
    contLetras("alberto jose")
    cubo(60)
    conv(1)
    troca("alberto alfredo")
}

fun amdhminseg(ano:Int){
    println("${ano} ano(s) equivalem a: ")
    var meses = ano * 12
    println("${meses} Meses")
    var dias = meses * 30
    println("${dias} Dias")
    var horas = dias * 24
    println("${horas} Horas")
    var minutos = horas * 60
    println("${minutos} Minutos")
    var segundos = minutos * 60
    println("${segundos} Segundos")
}

fun contLetras(txt : String){

    val letras = txt.length

    return println("A quantidade de letras é ${letras}")
}

fun cubo(num:Int) {
    val c = (num*num*num)
    return println("O valor do cubo do numero ${num} é ${c}")
}

fun conv(num: Int){
    val res = num * 1.6
    return println("A conversão de ${num} milhas corresponde a ${res} kilometros")
}

fun troca(texto :String){
    val troca = texto.replace("a","x",true)

    return println("O texto final é ${troca.uppercase()}")
}
