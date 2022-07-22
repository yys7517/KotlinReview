/*
    고차함수
    - 함수를 인수로 취하거나 혹은 결과로 반환하는 함수를 말한다.
    - setOnclickListener 같은 콜백함수 또한 고차함수에 속한다.

    (자료형, 자료형, ...) -> 반환자료형
 */
fun a( str : String ) {
    println("$str 함수 a")
}

fun b( function : (String) -> Unit ) {
    function("b가 호출한")
}

/*
    람다함수
    - 람다함수는 일반함수와 달리 그 자체로 고차함수이다.
    - 별도의 연산자 없이도 변수에 담을 수 있다.
 */



fun main() {

    b(::a)   // 고차함수 b에 함수 a를 파라메터로 전달. ( 함수를 파라메터로 할 때는 ::을 사용한다. )
    /*
     fun b에 대한 설명
     ""String 타입을 매개변수로 하고, Unit 타입을 반환형으로 하는 함수"" 를 파라메터로 받을 수 있는
     b는 고차함수이다.
     */

    // 람다함수
    /*
    val c : (String) -> Unit = { str ->
        println("$str 람다함수")
    }
     */

    // 람다함수의 타입 추론
    val c = { str : String -> println("$str 람다함수") }

    b(c)


    // Lambda

    // original format
    val originalSum : (Int, Int) -> Int = { x, y -> x+y }
    calculator(5,7, originalSum)

    // simple format
    val simpleSum = { x : Int, y : Int -> x + y }
    calculator(5,7, simpleSum)

    // 람다를 활용해서 고차함수 만들어보기

    calculator( 2,4, { a : Int, b : Int -> a + b } ) // 2, 4 -> 6
    calculator( 2,4, { a : Int, b : Int -> a * b } ) // 2, 4 -> 8
    calculator( 2,4, { a : Int, b : Int -> a % b } ) // 2, 4 -> 2

    // 고차함수에 타입이 정의되어 있는 경우 타입을 생략할 수 있다.
    calculator( 2,4, { a ,b -> a + b } ) // 2, 4 -> 6
    calculator( 2,4, { a ,b -> a * b } ) // 2, 4 -> 8
    calculator( 2,4, { a ,b -> a % b } ) // 2, 4 -> 2

    // 람다함수가 아닌 일반함수를 인자로 넣으려면 일반함수 앞에 ::를 붙여 다음과 같이 하면 된다.
    fun sum( a : Int, b : Int ) = a + b

    calculator( 5,7,::sum ) // 5, 7 -> 12

}

// 고차함수 calculator에 타입이 정의되어 있다.
fun calculator( a : Int, b : Int, p : (Int, Int) -> Int ) {
    // calculator 는 고차함수라고 말할 수 있다.
    println( "$a, $b -> ${p(a,b)}")
}


// 람다 함수의 특별한 케이스

/*
    1. 람다함수도 여러 줄의 구문이 사용 가능.

    마지막 구문의 결과를 반환한다.
    val c: (String) -> Unit = { str ->
        println("$str 람다함수")
        println("여러 구문을")
        println("사용 가능합니다.")    // 마지막 구문의 결과를 반환한다.
    }

    val calculate : (Int, Int) -> Int = { a,b ->
        println(a)
        println(b)
        a+b // 마지막 구문의 결과를 반환한다.
    }
 */

/*
    2. 파라메터가 없는 람다함수는 실행할 구문들만 나열해서 사용한다.
    val a : () -> Unit = {
        println("파라메터가 없는 람다함수")
    }
 */

/*
    3. 파라메터가 하나 뿐이라면 it을 사용가능하다.
    val c: (String) -> Unit = {
        println("$it 람다함수")
        println("여러 구문을")
        println("사용 가능합니다.")    // 마지막 구문의 결과를 반환한다.
    }
 */
