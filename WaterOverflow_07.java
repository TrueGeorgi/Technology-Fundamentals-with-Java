import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pours = Integer.parseInt(scanner.nextLine());
        int emptyLitersInTheTank = 255;
        int litersInTheTank = 0;
        for (int i = 1; i <= pours; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            if (emptyLitersInTheTank >= litersOfWater) {
                emptyLitersInTheTank -= litersOfWater;
                litersInTheTank += litersOfWater;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(litersInTheTank);
    }
}
