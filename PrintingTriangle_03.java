import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
            pyramid(i);
        }
        for (int i = input - 1; i >= 1; i--) {
            pyramid(i);
        }
    }

    private static void pyramid(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}
