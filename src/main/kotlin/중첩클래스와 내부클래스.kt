// 중첩 클래스(Nested Class)와 내부 클래스(Inner Class)

// 중첩 클래스(Nested Class) => 단순 식별자 Nested()만 속해있는 것, 실제로는 Outer Class 와 완전히 분리되어 있다.
//                              Nested 클래스의 멤버 함수는 Outer 클래스의 프로퍼티나 멤버 함수에 접근할 수 없다.
//                              서로( Outer <-> Nested ) 어떠한 프로퍼티나 멤버 함수를 공유하지 않는다. 완전히 별개의 클래스이다.

/*
    class Outer {
        private val bar : Int = 1
        class Nested {
            fun foo() = 2
            // fun foo() = bar // Unresolved reference property : 참조 오류 발생
        }
    }

    fun main() {
        val demo = Outer.Nested().foo()   //  2
    }

 */

class Outer {

    var text = "Outer Class"

    class Nested {
        fun introduce() {
            println("Nested Class")
        }
    }

    inner class Inner {
        var text = "Inner Class"

        fun introduceInner() {
            println(text)
        }

        fun introduceOuter() {
            println(this@Outer.text)    // this@Outer 키워드를 이용하여 내부 클래스는 자신이 속한 바깥 클래스의 인스턴스에 접근할 수 있다.
        }
    }
}

fun main() {

    Outer.Nested().introduce()

    val outer = Outer()         // Outer 클래스의 인스턴스
    val inner = outer.Inner()   // Outer 클래스의 인스턴스가 있어야만, Inner 클래스의 인스턴스를 생성할 수 있다. Outer 클래스의 인스턴스에 의해서 생성된다.

    inner.introduceInner()
    inner.introduceOuter()      // this@Outer 키워드를 이용하여 내부 클래스는 자신이 속한 바깥 클래스의 인스턴스에 접근할 수 있다.

    outer.text = "Changed Outer Class"     // inner 은 outer 에 의해 생성된 인스턴스이므로, outer 의 text 값이 수정되면, inner 의 외부 클래스인 text 값 또한 변경된다.
    inner.introduceOuter()

}



// 내부 클래스(Inner Class) => 인스턴스가 바깥 클래스의 인스턴스에 완전히ㅐ 소속된다.
// 혼자서 객체를 만들 수 없고, """외부 클래스의 인스턴스가 있어야만""" 생성과 사용이 가능하다.
// this@Outer 키워드를 이용하여 내부 클래스는 자신이 속한 바깥 클래스의 인스턴스에 접근할 수 있다.
// 내부 클래스의 인스턴스 생성 방법 => ""[외부 클래스의 인스턴스].생성자()"" 꼴로 생성한다.

/*
    class Outer( private val value : Int ){

        fun print() {
            println( this.value )
        }

        inner class Inner( private val innerValue: Int ) {
        fun print() {
            this@Outer.print()      // this@Outer 키워드를 이용하여 내부 클래스는 자신이 속한 바깥 클래스의 인스턴스에 접근할 수 있다.
            println(this.innerValue + this@Outer.value)
            }
        }
    }

    fun main() {
        val instance : Outer = Outer( 610 )
        val innerInstance : Outer.Inner = instance.Inner(40)
        instance.print()
        innerInstance.print()
    }

 */
//