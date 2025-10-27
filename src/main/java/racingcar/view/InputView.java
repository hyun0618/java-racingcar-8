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

    public static int readAttemptCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();

        try {
            int count = Integer.parseInt(input.trim());
            if (count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1 이상의 정수여야 합니다.");
            }
            return count;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자로 입력해야 합니다.");
        }
    }
}
