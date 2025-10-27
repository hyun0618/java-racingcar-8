package racingcar.view;

import racingcar.domain.Car;
import java.util.List;

public class OutputView {

    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            String progress = "-".repeat(car.getPosition());
            System.out.println(car.getName() + " : " + progress);
        }
        System.out.println();
    }

    public static void printResultTitle() {
        System.out.println("\n실행 결과");
    }
}
