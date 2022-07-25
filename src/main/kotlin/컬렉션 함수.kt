
// 컬렉션 함수

// 코틀린 - 함수형 언어의 특징을 가지고 있다.
// list, set, map과 같은 컬렉션을 출력할 때, for 문을 사용하지 않아도 함수를 사용하여 출력할 수 있다.

// 1. foreach - it 은 컬렉션 내 각 데이터를 방문한다. Collection 의 데이터에 대한 반복을 시행.
// ex) collection.forEach{ println(it) } => 반환 X

// 2. filter - 조건에 맞는 데이터만 남겨서 다시 컬렉션으로 반환해준다. 조건에 맞지 않는 데이터는 삭제된 컬렉션이 된다.
// collection.filter{ it < 4 } => Collection 반환

// 3. map - 각 데이터들에 대한 연산을 한 후, 변화된 데이터들을 담은 컬렉션으로 반환해준다. 컬렉션의 데이터 값을 일괄적으로 수정한다.
// collection.map{ it * 2 } => Collection 반환

// 4. any, all, none
// collection.any { it 에 대한 조건 } - 하나라도 조건에 맞으면 true
// collection.all { it 에 대한 조건 } - 모두 조건에 맞으면 true
// collection.none { it 에 대한 조건 } - 하나도 조건에 맞지 않아야 true

// 5. first, last
// collection.first() => 첫 번째 데이터를 반환
// collection.first{ it 에 대한 조건 } => 조건에 맞는 첫 번째 데이터를 반환

// collection.last() => 마지막 데이터를 반환
// collection.last{ it 에 대한 조건 } => 조건에 맞는 마지막 데이터를 반환

// first 와 last 를 통해 찾은 데이터가 없을 경우 NoSuchElementException 이 발생한다. => firstOrNull, lastOrNull 을 사용해주는 것이 좋다.

// first -> find 로 대체 가능.
// last -> findLast 로 대체 가능.

// 6. count
// collection.count() => 데이터의 개수를 반환.
// collection.count{ it 에 대한 조건 } => 조건에 맞는 데이터의 개수를 반환.

// 7. associateBy - 아이템에서 key 를 추출하여 map 으로 변환하는 함수
// collection 의 데이터가 ( name, birthYear ) 형태 일 때
// collection.associateBy { it.name } => name 을 키로 하고 birthYear 을 value 로 하는 map 으로 변환한다.

// 8. groupBy - key 가 같은 아이템끼리 배열로 묶어 map 으로 만드는 함수
// collection.groupBy { it.birthYear } => birthYear을 key 로하고, birthYear이 같은 사람끼리 묶어 value 로 한다.

// 9. partition - 아이템에 조건을 걸어 두 개의 컬렉션으로 나누어 줌
// collection.partition{ it.birthYear > 2002 }
// 조건을 만족하는 컬렉션, 만족하지 못하는 컬렉션으로 나누어 줌.

// 이 두 컬렉션은 Pair 로 묶여서 Pair로 반환된다. 각 각의 컬렉션을 Pair.first와 Pair.second로 참조할 수 있다.

// val (over2002, under2002) = collection.partition{ it.birthYear > 2002 }
// 변수 over2002, under2002에 두 개의 컬렉션을 담아줄 수 있다.


data class DataPerson( val name : String, val birthYear : Int )

fun main() {

    val nameList = listOf( "박수영","김지수","김다현","신유나","김지우" )

    nameList.forEach{
        println("$it ")
    }
    // 결과
    // 박수영
    // 김지수
    // 김다현
    // 신유나
    // 김지우
    println()

    println( nameList.filter { it.startsWith("김") } )

    println( nameList.map { "이름 : $it" })

    println( nameList.any{ it == "김지연" })                   // "김지연" 이 하나라도 있다면 true
    println( nameList.all{ it.length == 3 } )                   // 모두 길이가 3이면 true
    println( nameList.none{ it.startsWith("이") })   // 이씨 성을 가진 사람이 없다면 true

    // 결과
    // [김지수, 김다현, 김지우]
    // [이름 : 박수영, 이름 : 김지수, 이름 : 김다현, 이름 : 신유나, 이름 : 김지우]
    // false
    // true
    // true

    println( nameList.first{ it.startsWith("김")} )
    println( nameList.last{ it.startsWith("김") })
    println( nameList.count{ it.contains("지")})

    // 결과
    // 김지수
    // 김지우
    // 2

    val personList = listOf( DataPerson("유나",1992),
        DataPerson("조이",1996),
        DataPerson("츄",1999),
        DataPerson("유나",2003)
    )

    println( personList.associateBy { it.birthYear })
    println( personList.groupBy { it.name } )
    // 결과
    // assoicateBy(birthYear) - {1992=DataPerson(name=유나, birthYear=1992), 1996=DataPerson(name=조이, birthYear=1996), 1999=DataPerson(name=츄, birthYear=1999), 2003=DataPerson(name=유나, birthYear=2003)}
    // groupBy(name) - {유나=[DataPerson(name=유나, birthYear=1992), DataPerson(name=유나, birthYear=2003)], 조이=[DataPerson(name=조이, birthYear=1996)], 츄=[DataPerson(name=츄, birthYear=1999)]}

    val (over98, under98) = personList.partition { it.birthYear > 1998 }    // 변수 over2002, under2002에 두 개의 컬렉션을 담아줄 수 있다.
    println(over98)
    println(under98)
    // 결과
    // [DataPerson(name=츄, birthYear=1999), DataPerson(name=유나, birthYear=2003)]
    // [DataPerson(name=유나, birthYear=1992), DataPerson(name=조이, birthYear=1996)]
}