import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (a != 0) {
            int b = a % 10;
            sum += b;
            a /= 10;
        }
        System.out.println(sum);
    }
}
