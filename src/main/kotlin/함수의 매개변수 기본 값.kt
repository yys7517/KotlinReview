// 패러미터의 값을 받지 않아도 기본 값으로 동작하게 하려면 ?
// 기본 값 매개변수 - default arguments

// 패러미터에 값을 받았을 경우, 받은 값으로 동작하고, 받지 않은 값은 기본 값으로 동작한다.

fun main() {
    deliveryItem("짬뽕")
    deliveryItem("책",3,)
    deliveryItem("노트북",30,"학교")

    // 패러미터의 위치를 바꾸지 않고, 이름(name)과 목적지(destination) 값은 직접 입력하고,
    // 개수(count)값을 기본 값으로 동작시키려면 어떻게 해야할까 ? => named arguments

    // named arguments => 패러미터의 순서와 관계없이 "패러미터의 이름"을 사용하여 직접 값을 할당하는 기능
    deliveryItem("선물", destination = "친구집" )

}

fun deliveryItem( name : String, count : Int = 1, destination : String = "집" ) {
    println("${name}, ${count}개를 ${destination}에 배달하였습니다.")
}