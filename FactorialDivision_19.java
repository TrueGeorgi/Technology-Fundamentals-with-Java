import java.util.Scanner;

public class FactorialDivision_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        if (first != 0 || second != 0) {
            double result = factorial(first) * 1.0 / factorial(second);
            System.out.printf("%.2f", result);
        }
    }
    public static long factorial (int a) {
        long result = 1;
        for (int i = 1; i < a; i++) {
            result *= (i+1);
        }
        return result;
    }
}
