
// 제네릭 - 클래스나 함수에서 사용하는 자료형을 외부에서 지정할 수 있는 기능.
// Type 의 이니셜인 T를 사용하는 것이 관례.

// class A가 class B의 슈퍼 클래스라고 한다면
// fun castingExam(var a : A) 함수에 파라메터로 B 객체를 사용하면 자동으로 캐스팅 됨
// 두 클래스의 인스턴스 모두 파라메터로 사용할 수 있다.
// 하지만, 캐스팅 연산은 프로그램의 속도를 저하시킬 수 있는데, 제네릭을 사용하면 성능을 개선할 수 있다.

// 함수나 클래스를 선언할 때, 고정적인 자료형이 아닌 실제 자료형으로 대체 되는 Type 파라메터를 받아 사용한다.

// 특정한 수퍼 클래스를 상속받은 클래스 타입으로만 제한하려면,  < T : [SuperClass 명] > 형태로 사용한다.

// ex) fun<T> genericFunc( var param : T ) { }
// genericFunc()에 십진수 1의 값을 인수로 전달하면 fun<Int> genericFunc( var param : Int ) { } 로
// 인수의 값을 통해 타입 파라메터를 자동으로 추론하여 사용된다.

fun main() {

    UsingGeneric(A()).doShouting()  // 자기 자신도 포함.

    UsingGeneric(B()).doShouting()
    UsingGeneric(C()).doShouting()

    doShouting( A() )

    doShouting( B() )
    doShouting( C() )

}

fun < T: A > doShouting( t: T ) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리칩니다.")
    }
}

class B : A() {
    override fun shout() {
        println("B가 소리칩니다.")
    }
}

class C : A() {
    override fun shout() {
        println("C가 소리칩니다.")
    }
}

// 수퍼클래스가 A로 제한된 Type만 인자로 받는다는 뜻.
class UsingGeneric< T: A > ( val t : T ) {
    fun doShouting() {
        t.shout()
    }
}