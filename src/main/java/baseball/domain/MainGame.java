package baseball.domain;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        GenerateRandomNum randomNum = new GenerateRandomNum();
        Playagain playagain = new Playagain();
        Judge judge = new Judge();
        Input input = new Input();
        boolean again = true;

        while (again){
            List<Integer> computer = randomNum.create();
            String result = "";
            while (!result.equals("0볼 3스트라이크")){
                result = judge.judgement(computer, input.playerNumber());
                System.out.println(result);
            }
            System.out.println("축하합니다! 경기를 다시 시작하겠습니까? 다시 시작 : 1, 종료 : 2");
            again = playagain.playagain();
        }
    }
}
