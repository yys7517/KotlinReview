// 오버라이딩과 추상화

/*
    오버라이딩
    - 수퍼클래스의 함수와 같은 이름을 가진 함수를 서브클래스에서 만들 수 없다.
    - 하지만 수퍼클래스에서 허용(open)한다면, 서브클래스에서 오버라이딩(재정의)하여 사용할 수 있다.
 */
/*
    추상화

    추상화의 방법
    1. 추상함수를 가진 추상클래스
        - 선언부만 있고 기능이 구현되지 않은 추상함수.
        - 추상함수를 포함하는 추상클래스.
        - 추상클래스는 미완성 클래스이므로 단독으로 인스턴스를 생성할 수 없다.
        - 추상클래스를 상속받는 서브클래스에 추상함수를 재정의 해놓고, 그 서브클래스의 인스턴스를 생성하여 사용하여야 한다.

    2. 인터페이스( 속성 + 추상함수 + 일반함수 )
        - 추상클래스는 생성자를 가질 수 있는 반면, 인터페이스는 생성자를 가질 수 없다.
        - 인터페이스 내에 구현부가 있는 함수 -> open 함수로 간주
        - 인터페이스 내에 구현부가 없는 함수 -> abstract 함수로 간주.
        - 따라서 인터페이스 내에 있는 함수 앞 별도의 키워드가 없어도 모든 함수를 서브 클래스에서 구현 및 재정의가 가능.
 */

fun main() {
    var t = Tiger()

    // 오버라이딩하지 않을 경우
    // t.eat() // 음식을 먹습니다.

    // 오버라이딩 한 이후는, 서브클래스에 재정의된 함수가 실행이 된다.
    t.eat() // 호랑이가 고기를 먹습니다.

    var r = Rabbit()
    r.eat()
    r.sniff()
    // 당근을 먹습니다.
    // 킁킁


    var d = Dog2()

    d.eat()
    d.run()
}

interface Runner {
    fun run()

}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

// 인터페이스는 다중 상속이 가능.
class Dog2 : Runner, Eater {
    // run 의 경우, 구현부가 없으므로 추상함수처럼 간주됨.
    // 필수적으로 서브클래스에서 구현해줘야 함.
    override fun run() {
        println("우다다다 뜁니다.")
    }

    // eat 의 경우, 인터페이스에 구현부가 있으므로, open 함수로 간주되어
    // 서브클래스에서 재정의하여 사용하여도 되고, 그대로 사용하여도 된다.
    override fun eat() {
        println("허겁지겁 먹습니다.")
    }
}

abstract class Animal3 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal3() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}

open class Animal2 {
    // 상속 받는 클래스의 함수 앞에 open 키워드가 붙어있다면,
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger : Animal2() {
    // 서브 클래스에서 오버라이딩을 통해 재정의 하여 사용(재구현)할 수 있다.
    override fun eat() {
        println("호랑이가 고기를 먹습니다.")
    }
}
