package baseball.domain;

import java.util.List;

public class MainGame {
    public static void main(String[] args) {
        GenerateRandomNum computer = new GenerateRandomNum();
        List<Integer> random = computer.create();
        System.out.println(random.size());
    }
}
