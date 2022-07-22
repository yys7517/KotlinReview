
// 클래스의 생성자

fun main() {
    var a = Person2(1997,"윤영선")
    var b = Person2(1997,"전정국")
    var c = Person2(1990,"박보영" )


    var d = Person2("이루다")
    var e = Person2("차은우")
    var f = Person2("류수정")

}

class Person2( var birthYear: Int, var name: String ) {
    // 생성자를 사용하여 클래스의 인스턴스를 생성할 때,
    // init 메소드가 호출되어 init 내의 구문을 실행한다.
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성되었습니다.")
    }

    // 기본 생성자

    // 보조 생성자 - secondary constructor
    // 기본 생성자와 다른 형태의 인스턴스를 생성하거나
    // 추가적인 구문을 수행하는 기능을 제공하는 역할을 하기도 한다.

    constructor( name : String ) : this( 1997, name ) {
        println("보조 생성자가 사용되었습니다.")
    }
}