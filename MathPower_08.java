import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int numbersPower = Integer.parseInt(scanner.nextLine());
        double result = result(number, numbersPower);
        System.out.println(new DecimalFormat("0.####").format(result(number, numbersPower)));
    }
    public static double result (double number, int power) {
        double result = 1;
        for (int i = 1; i <= power ; i++) {
            result *= number;
        }
        return result;
    }
}
