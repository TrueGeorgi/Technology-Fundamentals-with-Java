package JavaInroductionExercises_01;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
          int symbol = Integer.parseInt(String.valueOf(input.charAt(i)));
            int middleSum = 1;
            for (int j = 1; j <= symbol; j++) {
                middleSum *= j;
            }
            sum += middleSum;
        }
        if (sum == number) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
