package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private int moveTotalCnt;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void run(boolean isMove) {
        if (isMove) {
            moveTotalCnt++;
        }
    }
    public int getMoveTotalCnt() {
        return moveTotalCnt;
    }

    public String getName() {
        return name;
    }
}