package JavaInroductionExercises_01;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1;j <= i; j++) {
                if (j == i) {
                    System.out.println(i);
                }else
                System.out.print(i + " ");
            }
        }
    }
}
