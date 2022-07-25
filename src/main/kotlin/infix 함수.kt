// infix functions
// 두 개의 변수 가운데 오는 함수를 말한다 => 함수를 연산자처럼 사용하고 싶을 때

// 사용 형식 => infix fun [ dispatcher ].[ 함수이름 ]( receiver ) : 반환형 { ... }

// dispatcher => Infix 함수 전에 오는 객체
// receiver => Infix 함수 뒤에 오는 객체

fun main() {

    // Kotlin 에서 기본적으로 정의된 infix 함수들 중 Pair를 만드는 to가 있다.
    // to 는 Pair 객체를 만들어주는 infix function.
    val pair : Pair<String,String> = "White" to "0xffffff"

    val map1 = mapOf( Pair("key1","value1"), Pair("key2","value2") )
    val map2 = mapOf("key1" to "value1", "key2" to "value2" )

    println( 6 multiply 4 )
    println( 6.multiply(4) )



    val myString = MyString()
    myString add "Hello"
    myString add "World"
    myString add "Kotlin"

    println(myString.string)
    // 결과
    // HelloWorldKotlin
}

infix fun Int.multiply( x : Int ) : Int = this * x


// 클래스 내에 Infix 함수 정의
class MyString {
    var string = ""
    infix fun add(other: String) {
        this.string = this.string + other
    }
}