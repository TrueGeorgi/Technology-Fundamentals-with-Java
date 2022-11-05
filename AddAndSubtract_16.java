import java.util.Scanner;

public class AddAndSubtract_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int forSubstraction = sumNumbers(firstNumber, secondNumber);
        System.out.println(subtractNumbers(forSubstraction, thirdNumber));

    }
    static int sumNumbers(int first, int second) {
        return first + second;
    }
    static int subtractNumbers (int first, int second) {
        return first - second;
    }
}
