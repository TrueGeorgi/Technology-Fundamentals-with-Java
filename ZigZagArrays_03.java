import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        int[] first = new int[a];
        int[] second = new int[a];

        for (int i = 0; i < a; i++) {
            String input = scanner.nextLine();
            String[] half = input.split(" ");

            if (i % 2 == 0) {
                first[i] = Integer.parseInt(half[0]);
                second[i] = Integer.parseInt(half[1]);
            } else {
                second[i] = Integer.parseInt(half[0]);
                first[i] = Integer.parseInt(half[1]);
            }


        }
        for (int i = 0; i < a; i++) {
            if (i != (a - 1)) {
                System.out.print(first[i] + " ");
            } else {
                System.out.println(first[i]);
            }
        }
        for (int i = 0; i < a; i++) {
            if (i != (a - 1)) {
                System.out.print(second[i] + " ");
            } else {
                System.out.println(second[i]);
            }
        }
    }
}
