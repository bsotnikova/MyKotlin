abstract class Cars {
    abstract var model: String
    abstract var to: Int
    abstract var doorsCount: Int
    abstract var color: String
    abstract var speedMax: Int
    abstract var mileage: Int
    abstract var ratePetrol: Int
    var currentSpeed = 0
    abstract var isStart: Boolean

    fun accelerate(speed:Int){
     currentSpeed+=speed
     println("Ваша скорость равна $currentSpeed км/ч")
    }

    fun slowDown(speed:Int){
        currentSpeed-=speed
        println("Ваша скорость равна $currentSpeed км/ч")
    }

    fun startTheCar() {
        if (isStart==true) {
            println("Автомобиль заведен")
        } else
            println("Автомобиль НЕ заведен")
    }
    fun stopTheCar() {
        if (isStart==true) {
            isStart = false
            println("Автомобиль НЕ заведен")
        }
    }

    fun guarantee() {
        if (mileage < 100_000) {
            println("Данная машина находится на гарантии сервиса. Произведено $to технических проверок")
        } else
            println("Гарантия заончила свое действие")
    }

    fun petrol() {
        println("${mileage/100 * ratePetrol} литров бензина было израсходованно данным автомобилем за весь срок " +
                "эксплуатации.")
    }

    fun presentation() {
        println(
            "Перед вами $model, цвета $color, с $doorsCount дверями. Она способна развивать скорость " +
                    "до $speedMax км в час и расходовать при этом до $ratePetrol литров бензина на 100 км"
        )
    }
}


abstract class Toyota() : Cars() {
    override var doorsCount = 4
    override var color = "silver"
    override var speedMax = 245
    override var mileage = 87_000
}

abstract class Honda() : Cars() {
    override var doorsCount = 4
    override var color = "black"
    override var speedMax = 275
    override var mileage = 140_000
}

abstract class Ferrari : Cars() {
    override var doorsCount = 2

}

class Roma: Ferrari(){
    override var model = "Roma"
    override var to = 4
    override var color = "red"
    override var speedMax = 415
    override var mileage = 87_000
    override var ratePetrol = 45
    override var isStart = true
}

fun main() {
    val roma = Roma()
    roma.guarantee()
    roma.petrol()
    roma.presentation()
    roma.accelerate(20)
    roma.accelerate(20)
}