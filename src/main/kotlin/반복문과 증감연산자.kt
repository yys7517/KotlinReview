
fun main() {

    var a = 0

    // 증감 연산자 -> 후위, 전위

    // 후위 -> 다음 구문부터 증가, 감소
    // 전위 -> 현재 구문부터 증가, 감소

    println("후위 증가")
    while ( a < 5 ) {
        println( a++ )
        /*
            후위 증가
            0
            1
            2
            3
            4
         */
    }
    println()

    a = 0

    println("전위 증가")
    while ( a < 5 ) {
        println( ++a )
        /*
            전위 증가
            1
            2
            3
            4
            5
         */
    }
    println()

    // i in a..b
    // i가 a부터 b까지
    for ( i in 0..9 ) {
        print(i)
        // 0123456789
    }

    println()

    for( i in 0..9 step 3 ) {
        print(i)
        // 0369
    }

    println()

    for( i in 9 downTo 0 ) {
        print(i)
        // 9876543210

    }

    println()

    for( i in 9 downTo 0 step 3 ) {
        print(i)
        // 9630
    }
    println()

    for( i in 'a'..'e' ) {
        print(i)
        // abcde
    }
    println()
}