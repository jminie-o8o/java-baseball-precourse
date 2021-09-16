package baseball.domain;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        GenerateRandomNum randomNum = new GenerateRandomNum();
        List<Integer> computer = randomNum.create();

        Judge judge = new Judge();
        Input input = new Input();

        String result = "";
        while (!result.equals("0볼 3스트라이크")){
            result = judge.judgement(computer, input.playerNumber());
            System.out.println(result);
        }
    }
}
