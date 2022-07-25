
fun main() {
//    val test1 = "Test.Kotlin.String"
//
//    println(test1.length)
//
//    println(test1.toLowerCase())
//    println(test1.toUpperCase())
//
//    val test2 = test1.split(".")
//    println(test2)
//
//    println( test2.joinToString() )
//    println( test2.joinToString("-"))
//
//    println( test1.substring(5..10) )

//    val nullString : String? = null
//    val emptyString = ""
//    val blankString = " "
//    val normalString = "A"
//
//    // isNullOrEmpty => 문자열이 null 이거나 empty 상태이면 true 를 반환한다.
//    println(nullString.isNullOrEmpty())
//    println(emptyString.isNullOrEmpty())
//    println(blankString.isNullOrEmpty())    // Space 문자열이 있으므로 null(X), empty(X)
//    println(normalString.isNullOrEmpty())
//
//    // Blank 문자열 -> 눈에 보이지 않는 문자열( Space, Tab, Line Feed, Carriage Return )
//    println(nullString.isNullOrBlank())
//    println(emptyString.isNullOrBlank())
//    println(blankString.isNullOrBlank())    // Space 는 Blank 문자열
//    println(normalString.isNullOrBlank())


    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))       // false
    println(test4.startsWith("java"))       // true

    println(test3.endsWith(".kt"))          // true
    println(test4.endsWith(".kt"))          // false

    println(test3.contains("lin"))          // true
    println(test4.contains("lin"))          // false



}