package JavaIntroductionLab_01;

import java.util.Scanner;

public class BackIn30mins_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int totalminsAfterDelay = h * 60 + min + 30;
        int newH = totalminsAfterDelay / 60;
        int newMin = totalminsAfterDelay % 60;

        if (newH > 23) {
            newH = 0;
        }
        System.out.printf("%d:%02d", newH, newMin);
    }
}
