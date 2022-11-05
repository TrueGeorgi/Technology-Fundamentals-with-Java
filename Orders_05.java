import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        calculation(product, amount);

    }
    public static void calculation (String product, int amount) {
        double result = 0;
        switch (product) {
            case "coffee":
                result = amount * 1.5;
                break;
            case "water":
                result = amount * 1.0;
                break;
            case "coke":
                result = amount * 1.4;
                break;
            case "snacks":
                result = amount * 2;
                break;
        }
        System.out.printf("%.2f", result);
    }
}
