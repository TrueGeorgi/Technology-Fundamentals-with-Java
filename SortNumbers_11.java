package JavaInroductionExercises_01;

import java.util.Scanner;

public class SortNumbers_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;

        for (int i = 1; i <= 3; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (a > pos1) {
                pos3 = pos2;
                pos2 = pos1;
                pos1 = a;
            } else if (a > pos2) {
                pos3 = pos2;
                pos2 = a;
            } else {
                pos3 = a;
            }
        }
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
    }
}
