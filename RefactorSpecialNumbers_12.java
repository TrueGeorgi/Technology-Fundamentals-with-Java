import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int test = 0;
        boolean toe = false;
        for (int i = 1; i <= n; i++) {
            test = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            toe = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", test, toe);
            sum = 0;
            i = test;
        }

    }
}
