fun main() {

    //declaração explicita do tipo de uma variavel
    var c : Char = 'a'
    var s : String = "khefasdhgslehagfhelwgfwel"
    var b : Boolean = true

    var double: Double = 10.0
    var float : Float = 10f
    var long: Long = 10L
    var short: Short = 10
    var byte: Byte = 10

    println("double max ${Double.MAX_VALUE} - min ${Double.MIN_VALUE}")
    println("float max ${Float.MAX_VALUE} - min ${Float.MIN_VALUE}")
    println("Long max ${Long.MAX_VALUE} - min ${Long.MIN_VALUE}")
    println("int max ${Int.MAX_VALUE} - min ${Int.MIN_VALUE}")
    println("Short max ${Short.MAX_VALUE} - min ${Short.MIN_VALUE}")
    println("Byte max ${Byte.MAX_VALUE} - min ${Byte.MIN_VALUE}")

    // numeros unsigned (sem sinal)
    println("Ulong max ${ULong.MAX_VALUE} - min ${ULong.MIN_VALUE}")
    println("Uint max ${UInt.MAX_VALUE} - min ${UInt.MIN_VALUE}")
    println("UShort max ${UShort.MAX_VALUE} - min ${UShort.MIN_VALUE}")
    println("UByte max ${UByte.MAX_VALUE} - min ${UByte.MIN_VALUE}")

}