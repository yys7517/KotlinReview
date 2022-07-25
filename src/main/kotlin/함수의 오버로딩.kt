// 함수의 이름은 같으나, 매개변수의 개수 또는 자료형이 다를 경우
// 같은 이름의 함수를 다양한 방면으로 사용가능하게끔 하는 것을 의미.


fun main() {

    read(8)
    read("8")
}

fun read( x : Int ) {
    println("숫자${x} 입니다.")
}

fun read( x : String ) {
    println("문자열${x} 입니다.")
}