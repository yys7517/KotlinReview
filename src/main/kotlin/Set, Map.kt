
// Set  =>  집합의 영어와 같음. 순서가 없으며, 중복이 허용되지 않는 컬렉션.
//          인덱스로 데이터의 위치를 지정하거나 참조할 수 없다.
//          데이터가 존재하는 지 확인하려면 contains() 메서드를 활용한다.
//          Set 역시 List 와 동일하게 Set 과 MutableSet 두 가지가 존재한다. 차이는 수정, 삭제가 가능하냐? 이다. => add(데이터), remove(데이터)

// Map  =>  Map 의 데이터는 key 에 따른 값 value 형태로 들어있다. <key, value>
//          고유한 key 를 통해 value 를 참조하는 컬렉션. key 는 고유하므로, key 가 중복될 수 없다.
//          같은 key 값에 여러 value 가 존재한다면, 마지막 삽입된 value 값으로 대체되니 이 점을 주의하자.
//          Map<K,V>, MutableMap<K,V>


fun main() {
    val a = mutableSetOf("귤","바나나","키위")

    for ( item in a ) {
        println("$item")
    }

    a.add("자몽")
    println(a)                      // [귤, 바나나, 키위, 자몽]

    a.remove("바나나")
    println(a)                      // [귤, 키위, 자몽]

    println(a.contains("귤"))        // true


    // Map 의 데이터를 삽입할 때는 내장 infix function 인 to를 사용하자.
    val b = mutableMapOf("레드벨벳" to "움파움파",
                            "트와이스" to "FANCY",
                            "ITZY" to "ICY"
                        )

    for( entry in b ) {
        println("${entry.key} : ${entry.value}")
    }

    // 결과
    // 레드벨벳 : 움파움파
    // 트와이스 : FANCY
    // ITZY : ICY



    // b.put("오마이걸", "번지")
    b["오마이걸"] = "번지"
    println(b)

    val remove = b.remove("ITZY")      // 반환 : the previous value associated with the key, or null if the key was not present in the map.
                                            // 기존에 존재했던 키에 대한 value 값을 반환한다. 하지만 key 가 맵에 존재하지 않았다면 null 을 반환한다.
    println("삭제된 값 : $remove")
    println(b)

    println(b["레드벨벳"])

    // 결과
    // {레드벨벳=움파움파, 트와이스=FANCY, ITZY=ICY, 오마이걸=번지}
    // 삭제된 값 : ICY
    // {레드벨벳=움파움파, 트와이스=FANCY, 오마이걸=번지}
    // 움파움파


}