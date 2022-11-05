import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesToFollow = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= linesToFollow; i++) {
            char letter = scanner.nextLine().charAt(0);
            sum += letter;
        }
        System.out.println("The sum equals: " + sum);
    }
}
