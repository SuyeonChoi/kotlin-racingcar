package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import vo.Name

internal class CarTest {

    @Test
    @DisplayName("랜덤값이 4 이상일 때, 자동차 position + 1")
    fun whenOverFourRandomThenPositionAdd() {
        val car = Car(Name("pobi"))
        val notMovedCar = Car(Name("stop"))

        car.move(true)

        assertThat(car.position).isNotEqualTo(notMovedCar.position)
    }

    @Test
    @DisplayName("랜덤값이 4 미만일 때, 자동차 position 변화없음")
    fun whenUnderFourRandomThenPositionAdd() {
        val car = Car(Name("pobi"))
        val notMovedCar = Car(Name("stop"))

        car.move(false)

        assertThat(car.position).isEqualTo(notMovedCar.position)
    }
}
