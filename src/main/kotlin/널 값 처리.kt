
// 우리는 Kotlin에서 nullable 변수를 만들 수 있다.

// NullPointerException 을 피하기 위해 처리하는 방법

// ?. => null safe operator
// ex) sample?.toUpperCase()
// sample 이 null 이면 null 을 반환하고,
// sample 이 null 값이 아니면 뒤에 toUpperCase() 구문을 실행 후 반환한다.

// ?: => elvis operator
// ex) sample ?: default
// sample 이 null 이면 default 값을 반환
// sample 이 null 이 아니면 sample 을 반환

// !!. => non-null assertion operator
// ex) sample!!.toUpperCase()
// sample 이 null 값이 아니면 구문이 실행되지만
// null 값이라면 NullPointerException을 발생

fun main() {
    var a : String ? = null

//    println( a?.toUpperCase() )           // a가 null 이므로, 뒤 구문을 진행하지 않음.
//    println( a?:"default".toUpperCase() ) // a가 null 이므로 default 를 대문자로
//    println( a!!.toUpperCase() )          // a가 null 이므로 NullPointerException


    a = "Kotlin Exam"

    a?.run {    // a 값이 null 이므로, 뒤 구문인 run 스코프 함수 전체가 실행되지 않는다.
      println( toUpperCase() )
      println( toLowerCase() )
    }


}
