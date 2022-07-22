// 클래스의 다형성

fun main() {
    var a = Drink()
    a.drink()

    var b : Drink = Cola()
    b.drink()   // Cola 의 인스턴스를 담았으므로, Cola 의 오버라이딩 된 drink 메서드가 호출된다.

    if( b is Cola ) {
        // b 는 조건문에서만 잠시 Down-Casting 된다. 영구적 X
        b.washDishes()
    }

    // b 는 위 조건문에서만 잠시 Down-Casting 된다. 영구적 X
    // b.washDishes() => 오류 발생

    // ***** as 로 Down-Casting *****
   var c = b as Cola
    c.washDishes()
    b.washDishes()
    // """ as 를 사용하면 반환 인스턴스 뿐만 아니라, 변수 자체도 Down-Casting 된다. """

}

// 콜라를 콜라 자체로도 볼 수 있지만, 크게 음료라고 볼 수도 있다.

// 음료 클래스가 콜라 클래스보다 더 상위 클래스이다.
open class Drink() {
    var name = "음료"

    open fun drink() {
        println("${name}를 마십니다.")
    }

}

class Cola() : Drink() {
    var type = "콜라"

    override fun drink() {
        println("${name}중 ${type}를 마십니다.")
    }

    fun washDishes() {
        println("${type}로 설거지를 합니다.")
    }
}
// Up-Casting => 하위 자료형을 상위 자료형인 수퍼클래스의 자료형으로 변환한다.
// ex) var a : Drink = Cola()

// Down-Casting => Up-Casting 된 인스턴스를 다시 하위 자료형으로 변환한다.
// '별도의 연산자'가 필요하다. ( as, is )

// as
// ex) var b = a as Cola

// is
// 변수가 자료형에 호환되는 지를 먼저 체크한 후 변환해주는 캐스팅 연산자이다.
// ex)


