abstract class Animal {
    abstract var isEat: String
    abstract var size: Int
    abstract var environment: String
    fun eating() {
        println("я ем $isEat")
    }
}

fun main() {
    val cat = Cat()
    val tiger = Tiger()
    cat.eating()
    tiger.eating()
}
  class Cat: Animal(){
      override var isEat = "корм"
      override var size = 2
      override var environment = "дом"

  }

  class Tiger: Animal() {
      override var isEat = "мясо"
      override var size = 50
      override var environment = "саванна"
  }