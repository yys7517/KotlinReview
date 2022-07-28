// val 은 할당된 객체를 변경할 수 없을 뿐, 객체 내부의 속성을 변경할 수 없는 것은 아님.


// 상수 - 컴파일 시점에 결정되어 값을 절대 변경할 수 없다. val 앞에 'const' 키워드를 사용하여 선언할 수 있다.
// 대문자와 언더 바를 사용하여 상수임을 알린다.

class FoodCourt {

    /*
    const val CONST_A = 1234

    fun sample {
        const val CONST_A = 1234
    }

    """ 상수는 클래스의 속성이나, 함수의 지역 변수로 사용될 수 없다. """

    반드시 companion object 안에 선언하여, 객체의 선언과는 관계 없이 클래스와 관계된 고정적인 값으로만 사용한다.
     */

    fun searchPrice( foodName : String ) {
        val price = when(foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}원 입니다.")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"

    }
}

fun main() {
    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    /*
        FoodCourt.FOOD_CREAM_PASTA,
        FoodCourt.FOOD_STEAK,
        FoodCourt.FOOD_PIZZA 는 모두 상수이다.

        변수를 선언하여 사용해도 된다.
        하지만, 변수를 선언하면, 런타임 시 객체를 생성하는데 시간이 더 소요되어 성능의 하락이 있다.
        따라서, 늘 고정적으로 사용할 값은 '상수'를 통해 객체의 생성 없이 메모리에 값을 고정하여 사용함으로서, 성능을 향상시킬 수 있다.
     */

}