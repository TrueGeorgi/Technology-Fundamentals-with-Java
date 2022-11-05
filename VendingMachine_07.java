package JavaInroductionExercises_01;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double coinsInMachine = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                coinsInMachine += coins;
                input = scanner.nextLine();
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
                input = scanner.nextLine();
            }
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (coinsInMachine - 2 > 0) {
                        coinsInMachine -= 2;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.printf("Sorry, not enough money. You have %.2f left", coinsInMachine);
                    }
                    product = scanner.nextLine();
                    break;
                case "Water":
                    if (coinsInMachine - 0.7 > 0) {
                        coinsInMachine -= 0.7;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.printf("Sorry, not enough money. You have %.2f left", coinsInMachine);
                    }
                    product = scanner.nextLine();
                    break;
                case "Crisps":
                    if (coinsInMachine - 1.5 > 0) {
                        coinsInMachine -= 1.5;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.printf("Sorry, not enough money. You have %.2f left", coinsInMachine);
                    }
                    product = scanner.nextLine();
                    break;
                case "Soda":
                    if (coinsInMachine - 0.8 > 0) {
                        coinsInMachine -= 0.8;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.printf("Sorry, not enough money. You have %.2f left", coinsInMachine);
                    }
                    product = scanner.nextLine();
                    break;
                case "Coke":
                    if (coinsInMachine - 1 > 0) {
                        coinsInMachine -= 1;
                        System.out.printf("Purchased %s%n", product);
                    } else {
                        System.out.printf("Sorry, not enough money. You have %.2f left", coinsInMachine);
                    }
                    product = scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
                    break;
            }
        }
        System.out.printf("Change: %.2f", coinsInMachine);
    }
}
