import org.junit.Assert.*
import org.junit.Test

class CarsTest {
    @Test
    fun testaAccelerate() {
        var spider = Roma()
        spider.accelerate(35)
        var actual = spider.currentSpeed
        assertEquals(35, actual)
        spider.accelerate(20)
        actual = spider.currentSpeed
        assertEquals(55, actual)

    }

    @Test
    fun slowDown() {
        var spider2 = Roma()
        spider2.accelerate(40)
        spider2.slowDown(35)
        var actual = spider2.currentSpeed
        assertEquals(5, actual)

    }

    @Test
    fun startTheCar() {
        var spider3 = Roma()
        spider3.startTheCar()
        var actual = spider3.isStart
        assertEquals(true, actual)
    }
    @Test
    fun stopTheCar() {
        var spider4 = Roma()
        spider4.startTheCar()
        spider4.stopTheCar()
        var actual = spider4.isStart
        assertEquals(false, actual)
    }
}