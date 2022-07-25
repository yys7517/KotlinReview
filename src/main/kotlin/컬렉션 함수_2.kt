
// 10. flatmap
// 감싸져 있는 collection 을 하나로 합치기 위한 연산.
// Collection 내부에 collection 이 들어있을 경우, 내부의 Collection 을 합쳐서 펼쳐주는 연산이다.
// collection.flatMap{ 연산 }


// 11. getorElse
// collection.getOrElse(1){50}
// 괄호 안에 지정한 인덱스에 개체를 반환하고, 없는 경우, 중괄호 안에 값을 반환해준다.

// 12. zip - List 를 묶는 연산
// 컬렉션 두 개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어준다.
// 두 List 의 각 순서에 맞게 매칭해준다.
// zip 된 list 의 각 객체는 Pair 객체이다.
// 결과 컬렉션의 아이템의 개수는 더 작은 컬렉션의 개수를 따라가게 된다.


/* ex)
    // list1 = [1,2,3,4] , list2 = [A,B,C,D]
    // list1 zip list2 = [ (A,1), (B,2), (C,3), (D,4) ]

    // list1 = [1,2,3,4] , list2 = [A,B,C]
    // list1 zip list2 = [ (A,1), (B,2), (C,3) ]
 */




fun main() {

    val testList = listOf("A","B","C")
    val newList1 = testList.map {
        "$it!"
    }
    println( newList1 ) // [A!, B!, C!]

    val newList2 = testList.flatMap {
        "$it!".toList()
    }
    println( newList2 ) // [A, !, B, !, C, !]

    val numbers = listOf(-3, 7, 2, -10, 1)

    // 10. flatmap
    println( numbers.flatMap { listOf( it * 10 , it + 10 ) })
    // 결과
    // [-30, 7, 70, 17, 20, 12, -100, 0, 10, 11]

    // 11. getorElse
    println(numbers.getOrElse(1) { 50 })    // 1번 인덱스에 7이 있으므로, 7을 반환해주고
    println(numbers.getOrElse(10) { 50 })   // 10번 인덱스가 없으므로, 중괄호 안에 값 50을 반환한다.
    // 결과
    // 7
    // 50

    val names = listOf("A","B","C","D")

    // 12. zip
    println( names zip numbers )
    // 결과 => [(A, -3), (B, 7), (C, 2), (D, -10)]

}
