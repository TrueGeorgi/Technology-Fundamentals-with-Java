package JavaInroductionExercises_01;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String reversedUsername = "";

        for (int i = 0; i < username.length(); i++) {
            reversedUsername += username.charAt(username.length() - i - 1);
        }
        String inputData = scanner.nextLine();
        int count = 0;
        while (!inputData.equals(reversedUsername)) {
            count++;
            if (count == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            inputData = scanner.nextLine();
        }
        if (inputData.equals(reversedUsername)) {
            System.out.printf("User %s logged in", username);
        }
    }
}
