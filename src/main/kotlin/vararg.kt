// variable number of arguments
// 같은 자료형을 개수에 상관없이 패러미터로 받고싶을 때 사용한다.

// 개수가 지정되지 않은 패러미터라는 특징이 있으므로,
// 다른 패러미터와 같이 사용할 때는, vararg 패러미터는 반드시 함수의 마지막 패러미터로 사용해야 한다.
// ex) fun sum( var text : String, vararg numbers : Int ) { ... }

fun main() {

    println( sum(1,2) )
    println( sum(1,2,3,4) )
    println( sum(1,2,3,4,5,6) )
}

fun sum( vararg numbers : Int ) : Int {
    var sum = 0
    for ( n in numbers ) {
        sum += n
    }

    return sum
}