package StringCalculatorTDD.StringCalculatorTdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    @Test
    public void testAddWithNewLineDelimiter() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();
        assertEquals(6, calculator.add("1\n2,3"));
    }
    @Test
    public void testAddWithCustomDelimiter() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    public void testAddNegativeNumbers() {
        StringCalculatorTDD calculator = new StringCalculatorTDD();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add("1,-2,3,-4");
        });

        assertEquals("negative numbers not allowed: -2, -4", exception.getMessage());
    }



}



