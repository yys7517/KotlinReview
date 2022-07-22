
fun main() {

    var a = 7

    // 조건문 if
    if( a > 10 ) {
        println("a는 10보다 크다.")
    } else {
        println("a는 10보다 작거나 같다.")
    }

    // 비교연산자
    // <, <=, >, >=, ==

    // = 은 할당 연산자이다.

    // is 연산자
    // [ is 자료형 ] 형태로 사용
    // ex) is Int, is Long

    // 다중 조건문 when
    // java 에서의 switch 와 유사

    doWhen( 1 )
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.141592)
    doWhen("Kotlin")
}

fun doWhen( a : Any ) {
    // Any 는 어떤 자료형이든 허용되는 Kotlin 의 최상위 자료형

    /*

    when( a ) {
        // 등호나 부등호의 사용은 불가능하다.
        1 -> println("정수 1입니다.")
        "DiMo" -> println("디모입니다.")
        is Long -> println("Long 타입입니다.")
        is Int -> println("Int 타입입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }

     */

    val result = when( a ) {
        // 등호나 부등호의 사용은 불가능하다.
        1 -> "정수 1입니다."
        "DiMo" -> "디모입니다."
        is Long -> "Long 타입입니다."
        is Int -> "Int 타입입니다."
        !is String -> "String 타입이 아닙니다."
        else ->"어떤 조건도 만족하지 않습니다."
    }

    println( result )
}