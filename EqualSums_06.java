import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length ; i++){
            numbers[i] = Integer.parseInt(input[i]);
        }
        boolean gotIt = false;
        for (int i = 0; i < numbers.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i ; j++){
                leftSum += numbers[j];
            }
            for (int j = numbers.length-1; j > i; j--){
                rightSum+= numbers[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                gotIt = true;
                break;
            }
        }
        if (!gotIt) {
            System.out.println("no");
        }
    }
}
