package JavaInroductionExercises_01;

import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyIvanCho = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double totalPriceLightsabers = Math.ceil(students * 1.1) * priceLightsaber;
        double totalPriceRobes = students * priceRobe;
        double totalPriceBelt = (students * priceBelt);
        if (students >= 6) {
            totalPriceBelt -= students / 6 * priceBelt;
        }

        double total = totalPriceLightsabers + totalPriceBelt + totalPriceRobes;

        if (moneyIvanCho >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            double moneyNeeded = total - moneyIvanCho;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeeded);
        }
    }
}
