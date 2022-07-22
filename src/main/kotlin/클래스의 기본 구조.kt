
fun main () {

    var a = Person(1997,"윤영선")
    var b = Person(1997,"전정국")
    var c = Person(1990,"박보영" )

    println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다.")
    println("안녕하세요, ${b.birthYear}년생 ${b.name}입니다.")
    println("안녕하세요, ${c.birthYear}년생 ${c.name}입니다.")

    a.introduce()
    b.introduce()
    c.introduce()

}

class Person( var birthYear : Int, var name : String ) {

    fun introduce() {
        println("안녕하세요, ${birthYear}년생 ${name}입니다.")
    }
}
