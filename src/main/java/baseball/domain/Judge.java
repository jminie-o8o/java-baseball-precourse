package baseball.domain;

import java.util.List;

public class Judge {
    Compare compare = new Compare();
    public String judgement(List<Integer> computer, List<Integer> player){
        int total = compare.howMany(computer, player);
        int strike = compare.countStrike(computer, player);
        int ball = total - strike;

        if(total == 0){
            return "낫싱";
        }
        return ball + "볼 " + strike + "스트라이크";
    }
}
