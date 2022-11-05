import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] n = scanner.nextLine().split(" ");

        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }
}
