class Tester (
        var name: String,
        var ageIt: Int,
        var knowBd: String,
        var countTests: Int,
        var testAuto: Boolean,
        var percentAuto: Double?,
        var percentManual: Double?,
        var testBackend: Boolean,
        var testFrontend: Boolean,
        var testApi: Boolean,
        var manager: Boolean
) {
        var grade: Int = 0
        fun speak() {}
        fun reviewDoc() {}
        fun writeTests(count:Int) {
                println("Я написал целых $count кейсов !")}
        fun fulfillTests() {}
        fun fixingTask(id: String) {
                println("Ура, мы протестировали таску $id")
        }
        fun controlWorkflow() {}
        fun writeInstructions() {}

        }


