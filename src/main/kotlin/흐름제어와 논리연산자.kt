
fun main() {

    // continue - 다음 반복을 수행
    // break    - 현재 반복문을 벗어남

    for( i in 1..10 ) {
        if( i==3 )
            continue
    }

    loop@for( i in 1..10 ) {
        for ( j in 1..10 ) {

            if( i == 1 && j == 2 )
                break@loop // loop 반복을 벗어남.

            println(" i : $i, j : $j")
        }
    }

    // 논리연산자
    // and, or, not
    // &&, ||, !

    // and
    // true && true => true
    // 하나라도 false => false
    println( true && true )
    println( true && false )

    // or
    // 하나라도 true 이면 true
    // false || false => false
    println( true || false )
    println( false || true )
    println( false || false )

    // not
    // true 이면 false, false 이면 true
    println( !true )
    println( !false )
}