import java.util.Scanner;

public class SmallestOfThreeNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.min(thirdNumber, min(firstNumber,secondNumber)));
    }
    static int min (int first, int second) {
        return Math.min(first,second);
    }
}
