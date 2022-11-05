package JavaInroductionExercises_01;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadsetes = lostGamesCount / 2;
        int brokenMice = lostGamesCount / 3;
        int brokenKeyboards = lostGamesCount / 6;
        int brokenDisplays = lostGamesCount / 12;

        double headsetsCost = headsetPrice * brokenHeadsetes;
        double miceCost = mousePrice * brokenMice;
        double keyboardsCost = keyboardPrice * brokenKeyboards;
        double displaysCost = displayPrice * brokenDisplays;

        double total = headsetsCost + miceCost + keyboardsCost + displaysCost;

        System.out.printf("Rage expenses: %.2f lv", total);
    }
}
