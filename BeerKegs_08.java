import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beerKegs = Integer.parseInt(scanner.nextLine());
        double biggestKegL = Double.MIN_VALUE;
        String biggestKegName = "";

        for (int i = 1; i <= beerKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > biggestKegL) {
                biggestKegL = volume;
                biggestKegName = model;
            }
        }
        System.out.println(biggestKegName);
    }
}
