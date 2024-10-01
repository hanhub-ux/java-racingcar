package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void getTotalMoveCnt() {
        Car car = getCar("carName");
        assertThat(car.getMoveTotalCnt()).isEqualTo(0);
    }

    @Test
    void run_전진() {
        Car car = getCar("carName");

        car.run(true);

        assertThat(car.getMoveTotalCnt()).isEqualTo(1);
    }

    @Test
    void run_멈춤() {

        Car car = getCar("carName");

        car.run(false);

        assertThat(car.getMoveTotalCnt()).isEqualTo(0);
    }

    @Test
    void getName_자동차이름부여확인() {

        Car car = getCar("pobi");

        assertThat(car.getName()).isEqualTo("pobi");
    }

    private static Car getCar(String carName) {
        CarManager carManager = new CarManager();
        return carManager.createCarsByCnt(Arrays.asList(carName)).get(0);
    }


}