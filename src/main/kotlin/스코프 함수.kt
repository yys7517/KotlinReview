
// 스코프 함수

/*
    apply
    run
    also

 */

fun main() {
    // apply
    // main 함수와 별도의 apply 스코프에서 인스턴스의 변수와 함수를 조작하므로
    // 코드가 깔끔해지는 장점이 있다.

    // 인스턴스의 변수와 함수를 생성과 함께 조작한다.
    var book = Book("디모의 코틀린", 10000).apply {
        name = "[초특가]$name" // apply 스코프에서 참조연산자를 사용하지 않아도 된다.
        discount()              // apply 스코프에서 참조연산자를 사용하지 않아도 된다.
    }
    // apply 구문이 끝난 후, 조작된 인스턴스를 반환하여 book 에 조작된 인스턴스가 담긴다.

    // run
    // apply 와는 다르게 람다함수처럼 인스턴스 대신 마지막 구문의 결과 값을 반환한다는 차이점이 있다.
    // *** 이미 인스턴스가 만들어진 후, 인스턴스의 함수나 속성을 scope 내에서 사용해야 할 때 유용하다 ***

    var bookName = book.run {
        println("상품명 : ${name}, 가격: ${price}원")
        book.name  // a.name 이 반환되어 bookName 값에 할당된다.
    }

    println( bookName )


    // with
    // run 과 동일한 기능을 가지지만, 단지 인스턴스를 참조연산자 대신 파라메터로 받는 차이점이 있다.
    // a.run{ ... } == with(a) { ... }


    // also / apply
    // 처리가 끝나면 인스턴스를 반환

    // let / run
    // 처리가 끝나면 최종값을 반환

    // also 와 let 은 apply 와 run 과 같이 참조연산자를 사용하지 않아도 되는 기능이 없다.
    // 하지만 it 을 사용하여 인스턴스를 사용할 수 있다.

    // 왜 사용할까 ? main 함수 스코프 내에 같은 이름을 가진 멤버가 있다면,
    // main 함수에서 정의된 멤버의 값으로 우선순위가 가게 된다.
    // 이러할 경우, also 와 let 을 사용하여 main 함수의 멤버가 아닌 인스턴스의 멤버를 참조할 수 있다.
}

class Book( var name: String, var price : Int )
{
    fun discount() {
        price -= 2000
    }
}
