// 형변환과 배열

fun main(){

    /*
        명시적 형변환

        toByte()
        toShort()
        toInt()
        toLong()
        toFloat()
        toDouble()
        toChar()

        var a : Int = 54321
        var b : Long = a.toLong()

        코틀린은 암시적 형변환을 지원하지 않는다.

     */

    // 배열

    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullIntArr = arrayOfNulls<Int>(5)
    // <T> => 제네릭

    intArr[2] = 8
    println( intArr[4] )


}