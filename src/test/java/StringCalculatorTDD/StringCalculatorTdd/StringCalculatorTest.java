package StringCalculatorTDD.StringCalculatorTdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
   public  void testAddEmptyString() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();
        assertEquals(0, calculator.add(""));
    }
    @Test
    public void testAddSingleNumber() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();
        assertEquals(1, calculator.add("1"));
    }

}



