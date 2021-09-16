package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNum {
    public List<Integer> create(){
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3){
            if(computerNumber.contains(randomMake())){
                continue;
            }else {
                computerNumber.add(randomMake());
            }
        }
        return computerNumber;
    }

    public int randomMake(){
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
}
