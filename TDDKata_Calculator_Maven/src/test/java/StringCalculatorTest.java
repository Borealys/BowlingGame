import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    void addZeroNumbers() {
        Assertions.assertEquals(0,StringCalculator.add(""));
    }

    @Test
    void addOneNumber() {
        Assertions.assertEquals(5,StringCalculator.add("5"));
    }

    @Test
    void addTwoNumbers() {
        Assertions.assertEquals(6,StringCalculator.add("3,3"));
    }

    @Test
    void addUnlimitedNumbers() {
        Assertions.assertEquals(31,StringCalculator.add("1,2,4,8,16"));
    }

    @Test
    void addNewLines() {
        Assertions.assertEquals(6,StringCalculator.add("1\n2,3"));
    }
}