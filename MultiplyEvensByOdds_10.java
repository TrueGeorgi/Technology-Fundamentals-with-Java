import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        System.out.println(getMultipleOfEvensAndOdds());
    }
    public static int getMultipleOfEvensAndOdds () {
        Scanner scanner = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(scanner.nextLine()));
        int sumOfOdds = getSumOfAllOdds(n);
        int sumOfEvens = getSumOfAllEvens(n);
        return sumOfOdds * sumOfEvens;

    }
    public static int getSumOfAllEvens (int n) {
        int sumEvens = 0;
        while (n > 0) {
            int number = n % 10;
            if (number % 2 == 0) {
                sumEvens += number;
            }
            n /= 10;
        }
        return sumEvens;
    }
    public static int getSumOfAllOdds (int n) {
        int sumOdds = 0;
        while (n > 0) {
            int number = n % 10;
            if (number % 2 != 0) {
                sumOdds += number;
            }
            n /= 10;
        }
        return sumOdds;
    }
}
