package StringCalculatorTDD.StringCalculatorTdd;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    @Test
    public void testAddEmptyString() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();
        assertEquals(0, calculator.add(""));
    }
}


}
