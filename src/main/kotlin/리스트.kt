
// List 와 MutableList<T>

// List 는 수정, 삭제가 불가능 -> listOf() 를 사용해서 생성가능
// Mutable 은 수정 삭제가 가능하다 -> mutableListOf() 를 사용해서 생성가능

// MutableList
// 요소의 추가 - add(데이터), add(인덱스, 데이터)
// 삭제 - remove(데이터), removeAt(인덱스)
// 무작위 섞기 - shuffle()
// 정렬 - sort()
// 리스트이름[인덱스] => 데이터 값
fun main() {
    val a = listOf("사과","딸기","배")
    println(a[1])

    for( fruit in a ) {
        print("${fruit},")
    }
    println()

    val b = mutableListOf(6,3,1) // 타입 추론 가능
    println(b)

    b.add(4)
    println(b)

    b.add(2,8)
    println(b)

    b.removeAt( 1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)

}