package JavaIntroductionLab_01;

import java.util.Scanner;

public class MultiplicationTableTwo_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier <= 10){
            for ( int i = multiplier; i <= 10; i++) {
                int result = integer * i;
                System.out.printf("%d X %d = %d%n", integer, i, result);
            }
        } else if (multiplier > 10) {
            int result = integer * multiplier;
            System.out.printf("%d X %d = %d", integer, multiplier,result);
        }
    }
}
