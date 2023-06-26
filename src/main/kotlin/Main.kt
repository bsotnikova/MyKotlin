fun main() {

    val range = 1..100
    var sum = 0
    for (n in range) {
        sum += n
    }
    println(sum)

}
// дз на 22.06
//    val string = "F2p)v\"y233{0->c}ttelciFc"
//    val stringLenght = string.length
//    val first = string.take(stringLenght / 2)
//    val second = string.takeLast(stringLenght / 2)
//    val firstString9 = encryptFirstHalf(first)
//    val secondString4 = encryptSecondHalf(second)
//    println(firstString9 + secondString4)


//     fun encryptFirstHalf (first: String): String {
//         val firstString = first.map { char -> char + 1 }.joinToString("")
//         val firstString5 = firstString.replace("5", "s")
//         val firstString6 = firstString5.replace("4", "u")
//         val firstString7 = firstString6.map { char -> char - 3 }.joinToString("")
//         val firstString8 = firstString7.replace("0", "o")
//         return firstString8
//     }
//
//      fun encryptSecondHalf(second: String) : String {
//          val secondString = second.reversed()
//          val secondString2 = secondString.map { char -> char - 4 }.joinToString("")
//          val secondString3 = secondString2.replace("_", " ")
//          return secondString3
//      }


//    val x = listOf<String>(f, 2, p, ), V, ", Y, 2, 3, 3, {, 0)
//    val string = "F2p)v\"y233{0"
//    val word = string.map { it.uppercaseChar() }
//    println(word)
//    val shiftedString = word.map {char -> char + 1}.joinToString("")
//    println(shiftedString)
//    val sourceString = mutableMapOf<Int, String>( 1 to "a", 2 to "b", 3 to "c")
//    val separator = ", "
//
//    val str = input.joinToString(separator, transform = Int::toString)
//
//    println(str)

//    val name = "Bella"
//    val surname = "Sotnikova"
//    val height: Int = 160
//    height.toShort()
//    val childHeight = 100
//    val isChild = height > childHeight
//    println("I am $name")
//    val listBuy= listOf("milk", "eggs", "meat")
//    val listCount= listOf(1,10,5)
//    val map = mapOf("milk" to 1, "eggs" to 10)
//    println(map["milk"])
//    val map2 = listBuy.zip(listCount)
//    println(map2)


//    val phoneBook = mutableMapOf("Viktor" to 89967877875, "Olga" to 87766754756, "Elena" to 87768764637,
//    "Andrey" to 89978746756)
//    val phoneBookSize = phoneBook.size
//    val isBig = phoneBook.size > 10
//    println(isBig)
//    println(phoneBook)
//    println(phoneBook.keys)
//    println(phoneBook.values)
//    fun addContact(x: String, y: Long) {
//    phoneBook[x] = y
//}
//    fun deleteContact (x: String = "Olga"){
//        phoneBook.remove(x)
//    }
//    addContact("Olga", 38764739)
//    println(phoneBook)
//    deleteContact()
//    println(phoneBook)







