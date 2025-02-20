package StringCalculatorTDD.StringCalculatorTdd;

import java.util.ArrayList;
import java.util.List;

public class StringCalculatorTDD {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();
        for (String num : numArray) {
            int number = Integer.parseInt(num);
            if (number < 0) {
                negatives.add(number);
            }
            sum += number;
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + negatives.toString().replaceAll("[\\[\\]]", ""));
        }
        return sum;



    }


}
