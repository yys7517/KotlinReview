import com.sun.jdi.LongValue

// 변수와 자료형 공부
/*
    주석 공부
    여러 줄
    주석 가능
 */

fun main() {
    /*
        var : 값을 변경 가능한 변수 자료형
        val : 초기화 된 값을 계속 사용해야 하는 변수 자료형
     */

    /*
        초기화 하지 않은 값을 출력할 수 없다.
        var a : Int
        println( a )

        nullable 변수 - 변수의 값이 NULL 이 될 수 있다는 뜻.
        var a : Int? = null
        println( a )


     */

    var a : Int = 123
    println( a )

    //  10진수

    // Int
    var intValue : Int = 1234

    // Long 타입
    var LongValue : Long = 1234L

    // 실수 타입 ( Double, Float )
    var doubleValue : Double = 123.5
    var doubleValueWithExp : Double = 123.5e10
    var floatValue : Float = 123.5f

    // 16진수 (0x)
    var intValueByHex : Int = 0x1af

    // 2진수  (0b)   b - binary
    var intValueByBin : Int = 0b10110110


    // 문자형
    var charValue : Char = 'a'

    // 문자열
    var stringValue : String = "String Text"

    // 여러 줄 문자열 ( """ """ )
    var multiLineStringValue = """multiline
        |string
        |test
    """

    // Boolean 형
    var trueValue : Boolean = true
    var falseValue : Boolean = false

}