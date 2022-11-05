import java.util.Scanner;

public class TopNumbers_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= input; i++) {
            if (divisibleByEight(i) && oneOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean divisibleByEight(int a) {
        int[] numbers = arrayDigits(a);
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        if (result % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean oneOddDigit(int a) {
        int[] numbers = arrayDigits(a);
        boolean check = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                check = false;
            } else {
                check = true;
                break;
            }
        }
        return check;
    }

    private static int[] arrayDigits(int a) {
        int digits = 0;
        int checkDigitsLenght = a;
        while (checkDigitsLenght != 0) {
            digits++;
            checkDigitsLenght /= 10;
        }
        int[] numbers = new int[digits];
        for (int i = 0; i < digits; i++) {
            numbers[i] = a % 10;
            a /= 10;
        }
        return numbers;
    }
}
