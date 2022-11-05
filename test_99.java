import java.util.Scanner;

public class test_99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 5;
        int input = 0;
        int[] ab = new int[5];

        for (int i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                ab[input++] = i;
            }
        }
    }
}
