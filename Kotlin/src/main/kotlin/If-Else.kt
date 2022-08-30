fun main() {
    maiorDeIdade(21)
    maiorDeIdade(9)
    maiorDeIdade(15)
    saudacao(true)
}

fun maiorDeIdade(idade:Int){
    if(idade>18){
        println("Maior de idade")
    }
    else if(idade < 10){
        println("criança")
    }
    else{
        println("Menor de idade")
    }
}

fun saudacao(dia: Boolean):String{
   return if (dia){
       "Bom dia"
   }
    else{
        "Boa noite"
   }
}