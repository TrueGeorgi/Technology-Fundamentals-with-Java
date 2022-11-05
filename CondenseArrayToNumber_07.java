import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] begin = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        while (begin.length > 1) {
            int[] condensed = new int[begin.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = begin [i] + begin[i + 1];
            }
            begin = condensed;
        }
        System.out.println(begin[0]);
    }
}
