import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pound = Integer.parseInt(scanner.nextLine());
        double dollars = pound * 1.31;

        System.out.printf("%.3f", dollars);
    }
}
