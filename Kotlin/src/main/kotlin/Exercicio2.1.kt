fun main() {
    //quadrado()
    //equilatero()
    portaria()

}

fun quadrado(){
    var lado1 = readLine()
    var lado2 = readLine()
    if(lado1 == lado2){
        println("Esses valores formam um quadrado")
    }
    else{
        println("Esses valores nao formam um quadrado")
    }

}

fun equilatero(){
    var lado1 = readLine()
    var lado2 = readLine()
    var lado3 = readLine()
    if (lado1 == lado2 && lado2 == lado3){
        println("Esse triangulo é equilatero")
    }
    else{
        println("Esse triangulo nao é equilatero")
    }
}

fun portaria(){
    var idade = readLine()
    var convite = readLine()?.lowercase()
    var codigo = readLine()?.uppercase()

    if(idade != null && idade != " ") {
        var idadec = idade.toInt()
        if (idadec >= 18) {
            if (convite == "comum" || convite == "premium" || convite == "luxo") {
                if (codigo == "XL" || codigo == "XT") {
                    println("Welcome")
                } else {
                    println("Negado: Convite invalido")
                }
            } else {
                println("Negado: Convite invalido")
            }
        } else {
            println("Proibido a entrada de menores de iddade")
        }
    }
}