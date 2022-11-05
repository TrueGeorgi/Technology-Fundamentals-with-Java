import java.util.Scanner;

public class PasswordValidator_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        if (sixToTenCharacters(input) ) {
            count++;
        }
        if (isLetterOrInteger(input) ) {
            count++;
        }
        if (atLeastTwoDIgits(input)) {
            count++;
        }
        if (count == 3) {
            System.out.println("Password is valid");
        }

    }

    static boolean sixToTenCharacters(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    static boolean isLetterOrInteger(String input) {
        int notOK = 0;
        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            if (Character.isLetter(check) || Character.isDigit(check)) {

            } else {
                notOK++;
            }
        }
        if (notOK > 0) {
            System.out.println("Password must consist only of letters and digits");
            return false;
        } else {
            return true;
        }
    }

    static boolean atLeastTwoDIgits (String input) {
        int digits = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digits++;
            }
        }
        if (digits >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}
