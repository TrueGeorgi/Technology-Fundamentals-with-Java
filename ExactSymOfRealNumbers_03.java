import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSymOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = numbers; i > 0; i--) {
            BigDecimal a = new BigDecimal(scanner.nextLine());
            sum = sum.add(a);
        }
        System.out.println(sum);
    }
}
