import java.util.Scanner;

public class MiddleChar_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleChar(input);
    }

    private static void middleChar(String input) {
        char[] letters = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            letters[i] = input.charAt(i);
        }
        int numbersNeeded = input.length() / 2;
        if (input.length() % 2 == 0) {
            System.out.printf("%c%c", letters[numbersNeeded-1], letters[numbersNeeded]);
        } else {
            System.out.println(letters[numbersNeeded]);
        }
    }
}
