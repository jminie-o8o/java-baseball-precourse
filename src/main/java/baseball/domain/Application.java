package baseball.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 객체 지향 프로그래밍
 * 1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
 * 2. 필요한 기능을 (역할에 맞는) 인스턴스가 수행하게 한다.(의인화)
 * 3. 각 결과를 종합한다.
 */

public class Application {
    public static void main(String[] args) {
        boolean answer = true;
        while (answer) {
            NumberGenerator numberGenerator = new NumberGenerator();
            List<Integer> computerNumber = numberGenerator.createRandomNumbers();

            Referee referee = new Referee();
            String result = "";
            while (!result.equals("0볼 3스트라이크")) {
                result = referee.compare(computerNumber, askNumber());
                System.out.println(result);
            }
            answer = tryAgain();
        }
    }

    public static List<Integer> askNumber() {
        System.out.println("숫자를 입력해주세요 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();


        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }

    public static boolean tryAgain() {
        System.out.println("정답을 모두 맞추셨습니다! 게임을 다시 시작하시겠습니까? 다시 시작 1, 종료 2");
        Scanner scanner = new Scanner(System.in);
        char answer = scanner.next().charAt(0);
        if (answer == '1') {
            return true;
        }
        System.out.println("수고하셨습니다!");
        return false;
    }
}