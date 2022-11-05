import java.util.Arrays;
import java.util.Scanner;

public class PalindromeIntegers_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            System.out.println(palindrome(input));
            input = scanner.nextLine();
        }
    }
    public static boolean palindrome (String input) {
        boolean ok = false;
      char[] numbers = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = input.charAt(i);
        }
        for (int i = 0; i < (input.length() / 2); i++) {
            if (numbers[i] == numbers[input.length()-1-i]) {
                ok = true;
            } else {
                ok = false;
                break;
            }
        }
        return ok;
    }
}
