
// Data Class => 데이터를 다루는 데에 최적화된 class, 5가지 기능을 내부적으로 자동으로 생성
// 생성 형태 data class [클래스명] ( 속성1, 속성2, 속성3, ... )

// 1. 내용의 동일성을 판단하는 equals()
// 2. 객체의 고유한 코드를 생성하는 hashcode()
// 3. 객체의 내용을 보여주는 toString()
// 4. 객체를 복사해주는 copy()
/* 5. 속성을 순서대로 반환하는 componentX()
    ex) 1, 2번째 속성 값을 반환 => component1(), component2()
 */

/*

 */

// Enum Class => 열거형 클래스.

class General( val name : String, val id : Int )
data class Data( val name : String, val id : Int )


fun main() {
    val a = General("보영",123)

    println( a == General("보영",123) )   // 서로 다른 인스턴스(메모리 상 주소 값이 다름)
    println( a.hashCode() )
    println( a )
    // 결과
    // false
    // 25126016
    // General@17f6480

    val b = Data("루다", 306)

    println( b == Data("루다",306) )
    println( b.hashCode() )
    println( b )

    println( b.copy() )
    println( b.copy(name = "아린") )
    println( b.copy(id = 618) )

    // 결과
    // true
    // 46909878
    // Data(name=루다, id=306)
    // Data(name=루다, id=306)
    // Data(name=아린, id=306)
    // Data(name=루다, id=618)

    val list = listOf( Data("보영",212),
                        Data("루다",306),
                        Data("아린",618)
                        )

    for( (a,b) in list ) {
        println("$a, $b")
    }

    for( value in list ) {
        println( "${value.component1()}, ${value.component2()}")
    }

    // 결과
    // 보영, 212
    // 루다, 306
    // 아린, 618


    var state = State.SING
    println( state )    // SING

    state = State.SLEEP
    println( state.isSleeping() )   // true

    state = State.EAT
    println( state.message )    // 밥을 먹습니다.
}

/*
enum class Color{
    RED,
    BLUE,
    GREEN
}
 */

enum class Color( val number : Int ){
    RED(1),
    BLUE(2),
    GREEN(3)
}

enum class State( val message : String ) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다."),
    SLEEP("잠을 잡니다"); // 다음으로 함수를 선언하기 위해서, 세미클론으로 마무리 한다.

    // 일반 클래스처럼 함수도 선언할 수 있다.
    fun isSleeping() = this == SLEEP

//    fun isSleeping() : Boolean {
//        return this == SLEEP
//    }

}