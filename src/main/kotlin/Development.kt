import java.util.*

class Development(
    var name: String,
    var language: Array<String>,
    var level: String
) {
    fun giveTask(): String {
        val timeId = UUID.randomUUID().toString()
        println("Возьми в работу таску $timeId")
        return timeId
    }
}