package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MultiplierTest {
    Multiplier multiplier;
    @BeforeEach
    void start(){
        multiplier = new Multiplier();
    }

    @Test
    @DisplayName("곱하기 두개")
    void multiply() {
        assertThat(42).isEqualTo(multiplier.Multiply(6,7));
    }

    @Test
    @DisplayName("곱하기 세개")
    void testMultiply() {
        assertThat(12).isEqualTo(multiplier.Multiply(2,2,3));
    }
}