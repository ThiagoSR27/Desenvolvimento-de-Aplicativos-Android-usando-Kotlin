fun main() {
    xpto("gerente", 5)
    xpto("gerente", 1)
    xpto("estagiario", 5)
    xpto("engenheiro de software", 5)
    xpto("faxineiro", 5)

}

fun xpto(cargo:String, xp:Int){
    if(cargo.lowercase() == "gerente"){
        if (xp <= 2){
            println("Seu bonus sera de R$2000")
        }
        else{
            println("Seu bonus sera de R$3000")
        }
    }
    else if(cargo.lowercase() == "coordenadores"){
        if(xp <= 1){
            println("Seu bonus sera de R$1500")
        }
        else{
            println("Seu bonus sera de R$1800")
        }
    }
    else if(cargo.lowercase() == "engenheiro de software"){
        println("Seu bonus sera de R$1000")
    }
    else if(cargo.lowercase() == "estagiario"){
        println("Seu bonus sera de R$500")
    }
    else{
        println("Cargo nao identificado")
    }
}