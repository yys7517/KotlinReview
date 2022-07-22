
// 클래스는 단지 인스턴스 객체를 만들기 위한 '틀'에 불과하다.
// 내부에 있는 속성과 함수를 사용하려면 '생성자'를 통해 실체가 되는 '인스턴스'를 생성해야 합니다.

// Singleton Pattern - 클래스의 인스턴스를 단 하나만 만들어 사용하도록 하는 코딩 아키텍쳐 패턴

// 단 하나의 객체만으로 공통적인 속성과 함수를 사용하는 Singleton Pattern 같은 경우 오브젝트(object)를 사용하면 편리하다.

// object 로 생성된 객체는 최초 사용 시 자동으로 생성되며, 코드 전체에서 공용으로 사용된다.
// 프로그램이 종료되기 전 까지 사용할 내용들을 object 에 담아 사용하는 것이 좋다.



// companion object
// 클래스의 인스턴스 기능은 그대로 사용하면서,
// 여러 인스턴스 간의 공용으로 사용할 속성과 함수를 별도로 만드는 기능.

fun main() {
    println( Counter.count )

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)


    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} : ${a.count}")
    println("${b.name} : ${b.count}")
    println("총계 : ${FoodPoll.total}")
}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

class FoodPoll( val name : String ) {
    // 기존 다른 언어의 static 멤버와 유사하다.
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        total++
        count++
    }
}