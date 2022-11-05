import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        sign(a);
    }
    public static void sign(int b) {
        if (b < 0) {
            System.out.printf("The number %d is negative.", b);
        } else if (b > 0) {
            System.out.printf("The number %d is positive.", b);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
