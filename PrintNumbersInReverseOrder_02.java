import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] test = new int[n];
        for (int i = 1; i <= n; i++) {   /// for (int i = 0; i <n; i++)
            test[i-1] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = test.length - 1; i >= 0; i--) {  /// i could also be equal to n-1;
            System.out.print(test[i] + " ");
        }
    }
}
