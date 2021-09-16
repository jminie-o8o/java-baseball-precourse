package baseball.domain;

import java.util.Scanner;

public class Playagain {
    public boolean playagain(){
        Scanner scanner = new Scanner(System.in);
        char answer = scanner.next().charAt(0);
        if(answer == '1'){
            return true;
        }
        return false;
    }
}
