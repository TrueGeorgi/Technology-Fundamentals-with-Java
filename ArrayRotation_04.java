import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int icomingRotations = Integer.parseInt(scanner.nextLine());
        int realRottations = icomingRotations % input.length;
        for (int i = 0; i < realRottations; i++) {
            String save = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j+1];
            }
            input[input.length-1] = save;
        }
        for (int i = 0; i < input.length; i++) {
            if (i == input.length-1) {
                System.out.print(input[i]);
            } else {
                System.out.print(input[i] + " ");
            }
        }
    }
}
