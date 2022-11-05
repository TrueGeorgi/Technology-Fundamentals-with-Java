import java.util.Scanner;

public class MaxSumOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int biggestCounter = 0;
        int firstIndex = 0;
        int secondIndex = 0;
        int i = 0;
        while (i < numbers.length - 1) {
            int j = i + 1;
            int counter = 1;
            while (j < numbers.length && numbers[j] == numbers[i]) {
                counter++;
                j++;
            }
            if (counter > biggestCounter) {
                biggestCounter = counter;
                firstIndex = i;
                secondIndex = j;
            }
            i = j;
        }
        for (i = firstIndex; i < secondIndex ; i++) {
            System.out.print(numbers[i]+ " ");
        }
    }
}

