import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int[] arr2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();
        int sum = 0;
        int checked = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                sum += arr2[i];
                checked++;
            } else {
                checked++;
                System.out.printf("Arrays are not identical. Found difference at %d index.", checked);
                break;
            }
        }
        int arr1Sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1Sum += arr1[i];
        }
        if (arr1Sum == sum) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
