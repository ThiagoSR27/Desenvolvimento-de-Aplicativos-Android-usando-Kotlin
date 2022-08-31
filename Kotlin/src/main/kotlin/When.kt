fun main() {

}

fun bonusWhen(cargo:String):Float{
    var bonus =0f
    when(cargo){
        "Gerente" ->{
            bonus=2000f
        }
        "Coordenador" ->{
            bonus=1500f
        }
        "Engenheiro de Software" ->{
            bonus=1000f
        }
        "Estagiario" ->{
            bonus=500f
        }
        else-> bonus
    }
    return bonus
}