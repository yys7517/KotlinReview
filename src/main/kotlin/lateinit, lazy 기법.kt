// lateinit - 늦은 초기화
// ex) lateinit var [변수이름] : [변수자료형]
// 기본 자료형에는 사용할 수 없음. (String 에는 사용 가능)
//

// 초기값 할당 전까지 변수를 사용할 수 없다.
// => " ::[lateinit 변수이름].isInitialized " 을 통해 lateinit 변수가 할당 되었는 지 확인 하여 오류를 막을 수 있다.



// lazy delegate properties (자연 대리자 속성) - 변수를 사용하는 시점까지 초기화를 자동으로 늦춰주는 기법.
// ex) val a : Int by lazy { 7 }

// 코드 모양으로는 선언 시, 객체를 생성 및 할당하는 것으로 보이지만 실제로는 사용하는 시점에 변수가 초기화된다.
// 코드의 실행시간을 최적화할 수 있다.
// 람다함수로 초기화가 진행되므로, { } 안에 여러 구문이 들어갈 수 있으며, 마지막 구문으로 값이 할당된다.

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if (::text.isInitialized) {
            return text
        } else {
            return "기본값"
        }
    }
}

fun main() {
    val a = LateInitSample()

    println( a.getLateInitText() )
    a.text = "새로 할당된 값"
    println( a.getLateInitText() )
    // 결과
    // 기본값
    // 새로 할당된 값

    val number : Int by lazy {
        println("초기화를 합니다.")
        7
    }

    println("코드를 시작합니다.")
    println( number )
    println( number )
    // 결과
    // 코드를 시작합니다.
    // 초기화를 합니다.
    // 7
    // 7 -> 위에서 사용 시 한 번 초기화가 되었으므로, 초기화를 더 하지 않는다.
}
