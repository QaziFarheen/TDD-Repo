package StringCalculatorTDD.StringCalculatorTdd;

public class StringCalculatorTDD {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] numArray = numbers.split("[,\n]");
        int sum = 0;
        for (String num : numArray) {
            sum += Integer.parseInt(num);
        }
        return sum;


    }


}
