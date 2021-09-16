package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JudgeTest {
    Compare compare;
    Judge judge;

    @BeforeEach
    void setUp(){
        compare = new Compare();
        judge = new Judge();
    }

    @Test
    @DisplayName("볼 스트라이크 확인")
    void cheak(){
        assertThat("0볼 3스트라이크").isEqualTo(judge.judgement(Arrays.asList(1,2,3),Arrays.asList(1,2,3)));
    }
}