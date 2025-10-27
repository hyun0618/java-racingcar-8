package racingcar.view;

import racingcar.domain.Car;
import java.util.List;
import java.util.stream.Collectors;

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

    public static void printWinners(List<String> winners) {
        String result = winners.stream()
                .collect(Collectors.joining(", "));
        System.out.println("최종 우승자 : " + result);
    }
}
