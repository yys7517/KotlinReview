
// '이벤트'가 일어나는 것을 감시하는 감시자의 역할을 만든다고 하여 옵저버라고 한다.
// ex) 키의 입력, 터치의 발생, 데이터의 수신 등

// 함수로 직접 요청하지 않았지만, 시스템 또는 루틴에 의해서 발생하게 되는 동작들을 '이벤트'라고 부르며,
// 즉각적으로 처리할 수 있도록 만드는 패턴을 옵저버 패턴이라고 한다.

// 이벤트 수신(A class)  <-> 이벤트의 발생 및 전달(B class)
// A class 와 B class 를 연결 시켜주는 'interface' -> 'listener'
// 이벤트를 전달하는 행위를 'callback' 이라고 한다
fun main() {
    EventPrinter().start()
}


interface EventListener {
    fun onEvent( count : Int )  // 구현부가 없으므로 추상함수
}

class Counter1( var listener : EventListener) {
    fun count() {
        for( i in 1..100 ) {
            if( i % 5 == 0 ) listener.onEvent(i)
        }
    }
}

class EventPrinter {
    fun start() {
        val counter = Counter1(object : EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}

//class EventPrinter : EventListener {
//    override fun onEvent(count: Int) {  // 추상함수를 반드시 구현해야 한다.
//        print("${count}-")
//    }
//
//    fun start() {
//        val counter = Counter1(this)
//        counter.count()
//    }
//}