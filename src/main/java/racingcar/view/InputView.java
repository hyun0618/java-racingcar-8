package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String[] readCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] names = input.split(",");

        for (String name : names) {
            String trimmed = name.trim();
            if (trimmed.isEmpty() || trimmed.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다: " + trimmed);
            }
        }
        return names;
    }
}
