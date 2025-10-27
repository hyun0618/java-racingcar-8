package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public void run() {

        String[] names = InputView.readCarNames();
        int attemptCount = InputView.readAttemptCount();


        List<Car> carList = new ArrayList<>();
        for (String name : names) {
            carList.add(new Car(name.trim()));
        }
        Cars cars = new Cars(carList);


        OutputView.printResultTitle();


        for (int i = 0; i < attemptCount; i++) {
            for (Car car : cars.getCars()) {
                car.move();
            }
            OutputView.printRoundResult(cars.getCars());
        }


        OutputView.printWinners(cars.getWinners());
    }

}
