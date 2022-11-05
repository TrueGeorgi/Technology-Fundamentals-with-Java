import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(calculation(number1, number2, operator)));
    }
    public static double calculation(int a, int b, String operator) {
        double result = 0;
        switch (operator) {
            case "*":
                result = a * b;
                break;
            case "/":
                result = a * 1.0 / b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
