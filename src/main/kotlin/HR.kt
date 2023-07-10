class HR(
    val name: String
) {
    var taxQa: Int = 20_000
    var taxDeveloper: Int = 40_000
    fun getSalary(tester: Tester) {
        if (tester.testApi) {
            tester.grade = 2
        } else {
            tester.grade = 1
        }
        println("Ваша зарплата ${tester.grade * taxQa}")
    }
}