import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number.length; i++) {
            for (int j = number.length - 1; j > i ; j--) {
                if (number[i] + number[j] == magicNumber) {
                    System.out.printf("%d %d%n", number[i], number[j]);
                }
            }
        }
    }
}
