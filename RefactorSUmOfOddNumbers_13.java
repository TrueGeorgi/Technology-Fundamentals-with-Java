package JavaIntroductionLab_01;

import java.util.Scanner;

public class RefactorSUmOfOddNumbers_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d%n", sum);

        // was :
        // Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());
        //int sum = 1;
        //for (int i = 0; i <= n; i++) {
        //    System.out.print(2 * i + 1);
        //    sum += 2 * i;
        //}
        //System.out.printf("Sum: %d%n", sum);


    }
}
