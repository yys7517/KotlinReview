// 변수의 동일성 => 내용의 동일성, 객체의 동일성

// 내용의 동일성 => 서로 다른 변수의 내용(값)이 같느냐 ?
// 객체의 동일성 => 서로 다른 변수가 메모리 상에 같은 객체(=주소 값)를 가리키느냐 ?

// 내용의 동일성을 판단하는 연산자 "==" => Kotlin 의 모든 내부 클래스가 상속받는 Any 라는 최상위 클래스의 구현되어 있는 equals() 메서드를 통해 판별한다.
// 객체의 동일성을 판단하는 연산자 "==="

fun main() {
    var a = Product("콜라",1000)
    var b = Product("콜라",1000)
    var c = a
    var d = Product("사이다",1000)

    println( a == b )
    println( a === b )

    println( a == c )
    println( a === c )

    println( a == d )
    println( a === d )
}

// Custom class 를 선언하였을 때, 이 Custom class 의 객체의 동일성을 판별하기 위해
// equals 메서드를 override 하여 동일성을 판별할 수 있다.
class Product( val name : String, val price : Int ) {
    override fun equals(other: Any?): Boolean {
        if( other is Product ) {
            return other.name == name && other.price == price
        }

        return false
        // return super.equals(other)
        // super.equals() 는 Kotlin 의 모든 내부 클래스가 상속받는 Any 라는 최상위 클래스의 구현되어 있는 equals() 메서드
    }
}