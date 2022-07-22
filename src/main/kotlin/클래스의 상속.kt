
// 클래스와 상속

// 상속을 사용하는 이유 ?
// 1. 이미 존재하는 클래스를 확장하여 새로운 클래스를 만들 때
// 2. 여러 클래스들의 공통 기능을 분리하여 코드 관리를 편하게 하기 위해

// 부모 - 자식
// 슈퍼 - 서브

fun main() {
    var a = Animal("별이",5,"개")
    var b = Dog("별이",5)

    a.introduce()
    b.introduce() // Dog 인스턴스는 Animal 클래스를 상속받았기 때문에 introduce() 메서드를 사용할 수 있다.
    b.bark()

    var c = Cat("루이",1)

    c.introduce()
    c.meow()
}

// open 키워드가 없으면 이 클래스는 다른 클래스에 상속될 수 없다.
// 상속 받을 클래스에 open 키워드를 붙여줘야 한다.
open class Animal( var name : String, var age : Int, var type : String ) {
    fun introduce() {
        println("저는 ${type} ${name}이고, ${age}살 입니다.")
    }
}

// 상속 규칙 2가지
// 1. 서브 클래스는 수퍼 클래스에 존재하는 속성과 같은 이름의 속성을 가질 수 없다. -> 수퍼 클래스의 속성과 기능을 모두 물려 받는다.
// 2. 서브 클래스가 생성될 떄는 수퍼 클래스의 생성자를 호출해야 한다.

class Dog( name: String, age: Int ) : Animal( name, age, "개"){

    // Dog 인스턴스에서는 사용할 수 있지만, Animal 인스턴스에서는 사용할 수 없다.
    fun bark() {
        println("멍멍")
    }
}

class Cat( name: String, age: Int ) : Animal( name, age, "고양이"){

    fun meow() {
        println("야옹야옹옹")
   }
}