package JavaIntroductionLab_01;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int oddNumbersCount = 0;
        int sumOddNumbers = 0;

        for (int i = 1; oddNumbersCount < input; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                oddNumbersCount++;
                sumOddNumbers += i;
            }
        }
        System.out.println(sumOddNumbers);
    }
}
