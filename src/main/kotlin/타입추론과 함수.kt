fun main() {

    // 타입 추론 ( : 뒤에 자료형을 명시하지 않아도 추론이 가능 )
    var intValue = 1234
    var longValue = 1234L

    var doubleValue = 12.45
    var floatValue = 12.45f

    var hexValue = 0xABCD
    var binaryValue = 0b01010101

    var trueValue = true
    var falseValue = false

    var charValue = 'c'
    var stringValue = "string"


    println( add(1,2,3) )
}

// 함수 -> 특정한 동작을 하거나 원하는 결과 값을 반환해주는 코드 덩어리
// fun 함수이름

/*
fun add(a : Int, b : Int, c : Int ) : Int {
    return a + b + c
}
 */

// 단일 표현식 함수 - 반환형 생략 가능
fun add(a : Int, b : Int, c : Int )  = a + b + c


