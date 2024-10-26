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
    @Test
    public void testAddTwoNumbers() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();
        assertEquals(3, calculator.add("1,2"));
    }
    @Test
    public void testAddMultipleNumbers() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();
        assertEquals(6, calculator.add("1,2,3"));
    }


}



